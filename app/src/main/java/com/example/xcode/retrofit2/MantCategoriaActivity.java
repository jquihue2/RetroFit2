package com.example.xcode.retrofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

import helper.DBHelper;
import modelo.Categorias;

public class MantCategoriaActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;
    EditText et;
    private DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mant_categoria);


        btn1 = (Button)findViewById(R.id.btnGuardar);
        btn2 = (Button)findViewById(R.id.btnActualizar);
        btn3 = (Button)findViewById(R.id.btnEliminar);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dao dao;
                dao = getHelper().getCategoriaDao();
                Categorias categorias=new Categorias();

                categorias.setNombre("jose");
                try {
                    dao.create(categorias);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    // obtener la referencia
    private DBHelper getHelper(){
        if(dbHelper == null){
            dbHelper = OpenHelperManager.getHelper(getApplicationContext(),DBHelper.class);
        }
        return dbHelper;
    }

    //liberar recursos
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(dbHelper != null){
            OpenHelperManager.releaseHelper();
            dbHelper=null;

        }
    }
}
