package br.unisul.ad3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.appcompat.app.AppCompatActivity;

public class MainInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);
        NavigationView navigationView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navigationView, navController);

        View headerView = navigationView.getHeaderView(0);

        SharedPreferences pref = getSharedPreferences("preferencias", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("key5", "value5");
        editor.commit();

        // get the saved string from shared preferences
        String id1 = pref.getString("dadoID", "ID");
        String nomecompleto1 = pref.getString("dadoNomeCompleto", "Nome Completo");
        String email1 = pref.getString("dadoEMail", "E-Mail");
        // set reference to the text view
        TextView id = (TextView) headerView.findViewById(R.id.menu_id);
        TextView nomecompleto = (TextView) headerView.findViewById(R.id.menu_nomecompleto);
        TextView email = (TextView) headerView.findViewById(R.id.menu_email);
        // set the string from sp as text of the textview
        id.setText(id1);
        nomecompleto.setText(nomecompleto1);
        email.setText(email1);

        navigationView.getMenu().findItem(R.id.nav_Sair).setOnMenuItemClickListener(menuItem -> {
            Intent intent = new Intent(MainInicio.this, MainLogin.class);
            Toast.makeText(MainInicio.this, MainInicio.this.getString(R.string.menu_botao_sair), Toast.LENGTH_LONG).show();
            startActivity(intent);
            SharedPreferences.Editor prefclear = getSharedPreferences("preferencias", MODE_PRIVATE).edit();
            prefclear.clear();
            prefclear.commit();
            finish();
            return true;
        });

    }
}