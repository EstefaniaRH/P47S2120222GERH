package mx.edu.tesoem.isc.g7s21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RESTAActivity2 extends AppCompatActivity {
    Button btnsregresa2, btnscalcula2;
    EditText txtnum3, txtnum4;
    TextView lblresultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaactivity2);

        txtnum3 = findViewById(R.id.txtnum3);
        txtnum4 = findViewById(R.id.txtnum4);

        lblresultado2 = findViewById(R.id.lblresultado2);

        btnscalcula2 = findViewById(R.id.btnscalcula2);
        btnscalcula2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtnum3.getText().toString());
                int num2 = Integer.parseInt(txtnum4.getText().toString());

                lblresultado2.setText(String.valueOf(num1 - num2));
            }
        });




        btnsregresa2 = findViewById(R.id.btnsregresa2);
        btnsregresa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });



    }
}