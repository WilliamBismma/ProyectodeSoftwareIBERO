package com.barappbismma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.barappbismma.Entidades.Globales;
import com.barappbismma.Entidades.Usuario;


public class MainActivity extends AppCompatActivity {

    Button btnLog;
    private static final int REQUEST_CAMERA_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLog = findViewById(R.id.btn_ingresar_log);

        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{
                    Manifest.permission.CAMERA
            },REQUEST_CAMERA_CODE);
        }

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario user = new Usuario();
                Intent intent = new Intent(MainActivity.this,Menu.class );
                user.setNombre("pepito perez");
                user.setPerfil("Mesero");
                user.setEntidad("bar1");
                Globales.usuario = user;
                MainActivity.this.startActivity(intent);
            }
        });
    }
}