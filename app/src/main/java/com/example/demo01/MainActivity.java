package com.example.demo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNombre;
    private Button btnLogin;
    private RadioGroup radioGroup;
    private RadioButton verMessi;
    private RadioButton noVerMessi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //despues de esta linea tiene sentido inicializar variables


        txtNombre = findViewById(R.id.editTxtNombre);
        btnLogin = findViewById(R.id.btnLogin);



        //ImageView messi = findViewById(R.drawable.imgmessi);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                Toast.makeText(this.getApplicationContext(),"Hola "+txtNombre.getText()+" como estas?", Toast.LENGTH_SHORT).show();
            //case R.id.rdbtnVerMessi: TODO Eliminar la foto con esta opcion
        }
    }
}