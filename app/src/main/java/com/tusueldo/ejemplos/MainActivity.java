package com.tusueldo.ejemplos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.til_nombre) TextInputLayout tilNombre;
    @BindView(R.id.btn_nombre) Button btnNombre;
    @BindView(R.id.btn_lanzar_evento) Button btnLanzarEvento;
    @BindView(R.id.btn_lanzar_activity) Button btnLanzarActivity;
    @BindView(R.id.til_telefono) TextInputLayout tilTelefono;
    @BindView(R.id.btn_llamar) Button btnLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_nombre, R.id.btn_llamar, R.id.btn_lanzar_activity, R.id.btn_lanzar_evento})
    public void click(Button button) {
        String nombre = getTexto(tilNombre);
        String telefono = getTexto(tilTelefono);
        Intent i = null;
        switch (button.getId()) {
            case R.id.btn_nombre:
                Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_lanzar_activity:
                i = new Intent(this, Main2Activity.class);
                i.putExtra("nombre", nombre);
                startActivity(i);
                break;
            case R.id.btn_lanzar_evento:
                break;
            case R.id.btn_llamar:
                i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + telefono));
                startActivity(i);
                break;
        }


    }

    private String getTexto(TextInputLayout til) {

        String texto = null;
        if (til.getEditText() != null) {
            texto = til.getEditText().getText().toString();
        }
        return texto;
    }


}


