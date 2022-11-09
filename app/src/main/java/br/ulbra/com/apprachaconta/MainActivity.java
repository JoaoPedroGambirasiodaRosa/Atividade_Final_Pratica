package br.ulbra.com.apprachaconta;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.badge.BadgeUtils;

public class MainActivity extends AppCompatActivity {
    private EditText nPessoas, contaTotal;
    private Button btnDividir, btnLimpar;

    public void message(String titulo, String mensagem, String botao){
        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle(titulo);
        dialogo.setMessage(mensagem);
        dialogo.setNeutralButton(botao, null);
        dialogo.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nPessoas = findViewById(R.id.pessoas);
        contaTotal = findViewById(R.id.conta);
        btnDividir = findViewById(R.id.calc);
        btnLimpar = findViewById(R.id.clean);

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, divisão;
                valor1 = Double.parseDouble(nPessoas.getText().toString());
                valor2 = Double.parseDouble(contaTotal.getText().toString());
                divisão = valor1 / valor2;
                if (valor2 == 0) {
                    Toast.makeText(MainActivity.this, "NÃO SE DIVIDE POR 0", Toast.LENGTH_SHORT).show();
                } else {
                    message("O número de pessoas é:" +valor2, "Cada um deve pagar o valor de R$" +divisão, "OK");
                }

            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nPessoas.setText("");
                contaTotal.setText("");
            }
        });

    }
}