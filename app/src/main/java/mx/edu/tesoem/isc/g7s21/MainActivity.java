package mx.edu.tesoem.isc.g7s21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnmsuma,btnmresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmsuma = findViewById(R.id.btnmsuma);
        btnmresta = findViewById(R.id.btnmresta);

        btnmsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent psuma = new Intent(MainActivity.this,SUMAActivity2.class );
                startActivity(psuma);

            }
        });

        btnmresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent presta = new Intent(MainActivity.this,RESTAActivity2.class );
                startActivity(presta);

            }
        });
    }
}