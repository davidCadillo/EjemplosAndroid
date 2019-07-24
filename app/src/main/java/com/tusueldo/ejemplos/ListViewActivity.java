package com.tusueldo.ejemplos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import butterknife.BindArray;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class ListViewActivity extends AppCompatActivity {

    @BindView(R.id.lv_paises) ListView listView;
    @BindArray(R.array.paises) String[] paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ButterKnife.bind(this);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{"Perro", "Gato", "Loro", "Panda"}));

    }

    @OnItemClick(R.id.lv_paises)
    public void itemClick(int position) {
        Toast.makeText(ListViewActivity.this, "Se ha seleccionado el " + position + " elemento. :)", Toast.LENGTH_SHORT).show();
    }


}
