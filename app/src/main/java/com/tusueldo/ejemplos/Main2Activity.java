package com.tusueldo.ejemplos;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.tv_nombre) TextView tvNombre;
    @BindView(R.id.btn_regresar) Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        String nombrito = getIntent().getStringExtra("nombre");
        tvNombre.setText("Hola, " + nombrito);
    }
}
