package com.gonzalo.versiones20;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.gonzalo.versiones20.utils.Versiones;

public class ActivityDescription extends AppCompatActivity {
    ImageView logoGrande;
    TextView nombreElemento,fechaElemento,versionElemento,descripcion;
    Versiones version;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        instancias();
        acciones();
    }

    private void acciones() {

    }

    private void instancias() {
        version=(Versiones)getIntent().getExtras().get(MainActivity.TAG_1);
        logoGrande = findViewById(R.id.logoGrande);
        nombreElemento = findViewById(R.id.nombreElemetno);
        fechaElemento = findViewById(R.id.fechaElemento);
        versionElemento = findViewById(R.id.versionElemetno);
        descripcion = findViewById(R.id.texto);
        logoGrande.setImageResource(version.getLogoGrande());
        nombreElemento.setText(version.getNombre());
        fechaElemento.setText(String.valueOf(version.getFecha()));
        versionElemento.setText(String.valueOf(version.getVersion()));
        descripcion.setText(version.getDescripcion());

    }

}