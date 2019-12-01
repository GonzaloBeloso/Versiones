package com.gonzalo.versiones20.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gonzalo.versiones20.R;
import com.gonzalo.versiones20.utils.Versiones;

import java.util.List;

public class AdaptadorVersiones extends BaseAdapter {

    List <Versiones> listaVersiones;
    Context context;

    public AdaptadorVersiones(List listaMarcas, Context context) {
        this.listaVersiones = listaMarcas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaVersiones.size();
    }

    @Override
    public Object getItem(int i) {
        return listaVersiones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view ==null) {
            view = LayoutInflater.from(context).inflate(R.layout.lista_layout, viewGroup, false);

        }
        Versiones marcaPosicion = listaVersiones.get(i);

        TextView nombre = view.findViewById(R.id.nombre_version);
        ImageView imagen = view.findViewById(R.id.imagen_version);
        nombre.setText(marcaPosicion.getNombre());
        imagen.setImageResource(marcaPosicion.getLogo());
        return view;
    }
}