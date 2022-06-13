package com.barappbismma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;





import java.util.Arrays;

import androidx.appcompat.app.AppCompatActivity;

import com.barappbismma.Entidades.Globales;
import com.barappbismma.Entidades.Usuario;

public class Menu extends AppCompatActivity {

    Button btnIgreso, btnPedido, btnMusica, btnOfertas, btnConfiguracion, btnMensajes, btnLogout;
    TextView txtNom, txtPerfil;
    Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        usuario = Globales.usuario;

        btnIgreso = findViewById(R.id.btnIngreso);
        btnPedido = findViewById(R.id.btnPedido);
        btnMusica = findViewById(R.id.btnMusica);
        btnOfertas = findViewById(R.id.btnOfertas);
        btnConfiguracion = findViewById(R.id.btnConfiguracion);
        btnMensajes = findViewById(R.id.btnMensajes);
        btnLogout = findViewById(R.id.btnLogout);

        txtNom = findViewById(R.id.txt_nom_menu);
        txtPerfil = findViewById(R.id.txt_perf_menu);

        txtNom.setText(usuario.getNombre());
        txtPerfil.setText(usuario.getPerfil());



    }

}