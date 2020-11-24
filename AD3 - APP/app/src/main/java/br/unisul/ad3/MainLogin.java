package br.unisul.ad3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.santalu.maskedittext.MaskEditText;

public class MainLogin extends AppCompatActivity {

    private MaskEditText entrar_campo_email, entrar_campo_senha;
    private Button entrar_botao_entrar, entrar_botao_registrar;
    private String HOST = "http://meniza.com/ad3/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        entrar_campo_email = (MaskEditText) findViewById(R.id.entrar_campo_email);
        entrar_campo_senha = (MaskEditText) findViewById(R.id.entrar_campo_senha);

        entrar_botao_entrar = (Button) findViewById(R.id.entrar_botao_entrar);
        entrar_botao_registrar = (Button) findViewById(R.id.entrar_botao_registrar);

        entrar_botao_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = entrar_campo_email.getText().toString();
                final String senha = entrar_campo_senha.getText().toString();
                final String URL = HOST + "login.php";

                if(email.isEmpty() || senha.isEmpty()){
                    Toast.makeText(MainLogin.this, MainLogin.this.getString(R.string.campos_vazios), Toast.LENGTH_LONG).show();
                } else {
                    Ion.with(MainLogin.this).load(URL).setBodyParameter("usuario_email", email).setBodyParameter("usuario_senha" , senha).asJsonObject().setCallback(new FutureCallback<JsonObject>() {

                        @Override
                        public void onCompleted(Exception e, JsonObject result) {
                            try {
                                String RESULTADO = result.get("LOG").getAsString();
                                String DADOID = result.get("ID").getAsString();
                                String DADONOMECOMPLETO = result.get("Nome Completo").getAsString();
                                String DADOEMAIL = result.get("E-Mail").getAsString();

                                if(RESULTADO.equals("LOGIN_ERRO")) {
                                    Toast.makeText(MainLogin.this, MainLogin.this.getString(R.string.entrar_falha_invalido), Toast.LENGTH_LONG).show();
                                    entrar_campo_email.setText("");
                                    entrar_campo_senha.setText("");
                                    entrar_campo_email.requestFocus();

                                } else if(RESULTADO.equals("SUCESSO")) {
                                    SharedPreferences prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
                                    SharedPreferences.Editor ed = prefs.edit();

                                    ed.putBoolean("estaLogado", true);

                                    ed.putString("dadoID", DADOID);
                                    ed.putString("dadoNomeCompleto", DADONOMECOMPLETO);
                                    ed.putString("dadoEMail", DADOEMAIL);

                                    ed.apply();

                                    Toast.makeText(MainLogin.this, MainLogin.this.getString(R.string.entrar_sucesso), Toast.LENGTH_LONG).show();
                                    Intent intent = new Intent(MainLogin.this, MainInicio.class);

                                    startActivity(intent);

                                } else {
                                    Toast.makeText(MainLogin.this, MainLogin.this.getString(R.string.erro), Toast.LENGTH_LONG).show();
                                }
                            } catch (Exception erro) {
                                Toast.makeText(MainLogin.this, MainLogin.this.getString(R.string.entrar_erro), Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });

        entrar_botao_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLogin.this, MainCadastro.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }
}