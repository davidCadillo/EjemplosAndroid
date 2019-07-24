package com.tusueldo.ejemplos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class GridViewActivity extends AppCompatActivity {

    @BindView(R.id.grid_view) GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        ButterKnife.bind(this);
        gridView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{"Perro", "Gato", "Loro", "Panda"}));
    }

    @OnItemClick(R.id.grid_view)
    public void clickItem(View v, int position) {
        Toast.makeText(GridViewActivity.this, "Se ha seleccionado el " + position + " elemento. :)", Toast.LENGTH_SHORT).show();
        v.animate().setDuration(1000).rotationX(360);

    }
}
