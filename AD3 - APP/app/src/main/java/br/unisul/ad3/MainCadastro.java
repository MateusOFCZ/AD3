package br.unisul.ad3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.santalu.maskedittext.MaskEditText;

public class MainCadastro extends AppCompatActivity {

    private MaskEditText registro_campo_email, registro_campo_senha, registro_campo_nomecompleto, registro_campo_cpf, registro_campo_rg, registro_campo_endereco, registro_campo_telefone;
    private Button registro_botao_login, registro_botao_registrar;
    private String HOST = "http://meniza.com/ad3/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cadastro);

        registro_campo_email = (MaskEditText) findViewById(R.id.registro_campo_email);
        registro_campo_senha = (MaskEditText) findViewById(R.id.registro_campo_senha);
        registro_campo_nomecompleto = (MaskEditText) findViewById(R.id.registro_campo_nomecompleto);
        registro_campo_cpf = (MaskEditText) findViewById(R.id.registro_campo_cpf);
        registro_campo_rg = (MaskEditText) findViewById(R.id.registro_campo_rg);
        registro_campo_endereco = (MaskEditText) findViewById(R.id.registro_campo_endereco);
        registro_campo_telefone = (MaskEditText) findViewById(R.id.registro_campo_telefone);

        registro_botao_registrar = (Button) findViewById(R.id.registro_botao_registrar);
        registro_botao_login = (Button) findViewById(R.id.registro_botao_login);

        registro_botao_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = registro_campo_email.getText().toString();
                String senha = registro_campo_senha.getText().toString();
                String nomecompleto = registro_campo_nomecompleto.getText().toString();
                String cpf = registro_campo_cpf.getText().toString();
                String rg = registro_campo_rg.getText().toString();
                String endereco = registro_campo_endereco.getText().toString();
                String telefone = registro_campo_telefone.getText().toString();
                String URL = HOST + "cadastro.php";

                if(email.isEmpty() || senha.isEmpty() || nomecompleto.isEmpty() || cpf.isEmpty() || rg.isEmpty() || endereco.isEmpty() || telefone.isEmpty()){
                    Toast.makeText(MainCadastro.this, MainCadastro.this.getString(R.string.campos_vazios), Toast.LENGTH_LONG).show();
                } else {
                    Ion.with(MainCadastro.this).load(URL).setBodyParameter("usuario_email" , email).setBodyParameter("usuario_senha" , senha).setBodyParameter("usuario_nomecompleto" , nomecompleto).setBodyParameter("usuario_cpf" , cpf).setBodyParameter("usuario_rg" , rg).setBodyParameter("usuario_endereco" , endereco).setBodyParameter("usuario_telefone" , telefone).asJsonObject().setCallback(new FutureCallback<JsonObject>() {

                        @Override
                        public void onCompleted(Exception e, JsonObject result) {
                            try {
                                String RESULTADO = result.get("LOG").getAsString();
                                if(RESULTADO.equals("CADASTRO_ERRO")) {
                                    Toast.makeText(MainCadastro.this, MainCadastro.this.getString(R.string.registro_falha_email), Toast.LENGTH_LONG).show();
                                    registro_campo_email.setText("");
                                    registro_campo_email.requestFocus();
                                } else if(RESULTADO.equals("SUCESSO")) {
                                    Toast.makeText(MainCadastro.this, MainCadastro.this.getString(R.string.registro_sucesso), Toast.LENGTH_LONG).show();
                                    registro_campo_email.setText("");
                                    registro_campo_senha.setText("");
                                    registro_campo_nomecompleto.setText("");
                                    registro_campo_cpf.setText("");
                                    registro_campo_rg.setText("");
                                    registro_campo_endereco.setText("");
                                    registro_campo_telefone.setText("");

                                    Intent intent = new Intent (MainCadastro.this, MainLogin.class);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(MainCadastro.this, MainCadastro.this.getString(R.string.erro), Toast.LENGTH_LONG).show();
                                }
                            } catch (Exception erro) {
                                Toast.makeText(MainCadastro.this, MainCadastro.this.getString(R.string.erro_qual) + " " + erro, Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });

        registro_botao_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainCadastro.this, MainLogin.class);
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