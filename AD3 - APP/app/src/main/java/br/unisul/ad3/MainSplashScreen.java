package br.unisul.ad3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainSplashScreen extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash_screen);
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                mostrarLogin();
            }
        }, 2000);
}

    private void mostrarLogin() {
        SharedPreferences prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        boolean Logou = prefs.getBoolean("estaLogado", false);

        if(Logou) {
            Intent intent = new Intent(this, MainInicio.class);
            startActivity(intent);
            finish();
        }else {
            Intent intent = new Intent(this, MainLogin.class);
            startActivity(intent);
            finish();
        }
    }
}