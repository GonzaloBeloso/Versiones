package com.gonzalo.versiones20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.gonzalo.versiones20.adaptadores.AdaptadorVersiones;
import com.gonzalo.versiones20.utils.Versiones;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listaVersiones;
    ArrayList arrayVersiones;
    AdaptadorVersiones adaptadorVersiones;
    final static String TAG_1="Objeto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenarVersiones();
        acciones();
    }

    private void acciones() {
        listaVersiones.setOnItemClickListener(this);
    }

    private void rellenarVersiones(){
        listaVersiones.setAdapter(adaptadorVersiones);
        arrayVersiones.add(new Versiones("Beta",R.drawable.beta,R.drawable.beta,001,001,
                getResources().getString(R.string.texto)));
        arrayVersiones.add(new Versiones("Cupcake",R.drawable.cupcake,R.drawable.cupcake_det,111,111,
                getResources().getString(R.string.texto)));
        arrayVersiones.add(new Versiones("Donut",R.drawable.donut,R.drawable.donut_det,222,222,
                getResources().getString(R.string.texto)));
        arrayVersiones.add(new Versiones("Eclair",R.drawable.eclair,R.drawable.eclair_det,333,333,
                getResources().getString(R.string.texto)));
        arrayVersiones.add(new Versiones("Froyo",R.drawable.froyo,R.drawable.froyo_det,444,444,
                getResources().getString(R.string.texto)));
        arrayVersiones.add(new Versiones("Ginger Bread",R.drawable.gingerbread,R.drawable.gige_det,555,555,
                getResources().getString(R.string.texto)));
        arrayVersiones.add(new Versiones("Honey Combo",R.drawable.honeycomb,R.drawable.honey_det,666,666,
                getResources().getString(R.string.texto)));
        arrayVersiones.add(new Versiones("Ice Cream",R.drawable.icecream,R.drawable.ice_det,777,777,
                getResources().getString(R.string.texto)));
        arrayVersiones.add(new Versiones("Jelly Bean",R.drawable.jelly_bean,R.drawable.jelly_det,888,888,
                getResources().getString(R.string.texto)));
        arrayVersiones.add(new Versiones("Kitkat",R.drawable.kitkat,R.drawable.kit_det,999,999,
                getResources().getString(R.string.texto)));
        adaptadorVersiones.notifyDataSetChanged();
    }

    private void instancias() {
        listaVersiones = findViewById(R.id.listaVersiones);
        arrayVersiones = new ArrayList();
        adaptadorVersiones = new AdaptadorVersiones(arrayVersiones,getApplicationContext());

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.listaVersiones:
                Intent intent1 = new Intent(getApplicationContext(), ActivityDescription.class);
                intent1.putExtra(TAG_1,(Versiones)adaptadorVersiones.getItem(position));
                startActivity(intent1);
                break;
        }
    }

}

