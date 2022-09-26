package mx.edu.tesoem.isc.g7s21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SUMAActivity2 extends AppCompatActivity {
    Button btnsregresa, btnscalcula;
    EditText txtnum1, txtnum2;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumaactivity2);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        lblresultado = findViewById(R.id.lblresultado);

        btnscalcula = findViewById(R.id.btnscalcula);
        btnscalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());

                lblresultado.setText(String.valueOf(num1 + num2));
            }
        });

        btnsregresa = findViewById(R.id.btnsregresa);
        btnsregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });

    }
}