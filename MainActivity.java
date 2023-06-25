package com.markredfive.inventmanag;

import androidx.appcompat.app.AppCompatActivity;

/* import de recursos e serviços */
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/* abaixo segue a activity de rolagem de dados contendo um randomizador de d20 */
    public void rolarDado(View view) {
        TextView texto = findViewById(R.id.result);
        int d20 = new Random().nextInt(20);
        texto.setText( d20 + 1 );
    }

}
