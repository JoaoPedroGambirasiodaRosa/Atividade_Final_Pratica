package br.ulbra.com.apprachaconta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMainActivity();
            }
        }, 2500);
    }

    private void mostrarMainActivity() {
        Intent intent = new Intent(
                Splash_Screen_Activity.this,MainActivity.class
        );
        startActivity(intent);
        finish();
    }
}