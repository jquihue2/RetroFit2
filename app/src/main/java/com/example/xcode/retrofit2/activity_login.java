package com.example.xcode.retrofit2;

import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class activity_login extends AppCompatActivity {

    // varaiables
    EditText nombre_imput,clave_imput;
    CheckBox recordar_check;
    Button entrar_button;

    final String NOMBRE="admin";
    final String CLAVE="1";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_login);

        initUI();
        loadDataPreferents();
        validarUusuario();

    }

    private void loadDataPreferents() {
        String valorLeidoUsuario,valorLeidoClave,valorLeidoCheck;

        SharedPreferences sharedPreferent;
        sharedPreferent = getSharedPreferences("preferentLogin",MODE_PRIVATE);
        valorLeidoUsuario = sharedPreferent.getString("usuario","");
        valorLeidoClave = sharedPreferent.getString("clave","");
        valorLeidoCheck = sharedPreferent.getString("check","0");

        nombre_imput.setText(valorLeidoUsuario);
        clave_imput.setText(valorLeidoClave);
        if(valorLeidoCheck.equals("1")){
            recordar_check.setChecked(true);
        }else{
            recordar_check.setChecked(false);
        }


    }

    private void initUI() {
        nombre_imput = (EditText)findViewById(R.id.nombre_input);
        clave_imput= (EditText)findViewById(R.id.contrasena_input);
        recordar_check = (CheckBox)findViewById(R.id.recordar_check);
        entrar_button = (Button)findViewById(R.id.entrar_boton);
    }

    private void validarUusuario() {

        entrar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nombre_imput.length() == 0){
                    Snackbar.make(v,"debe ingresar el usuario",Snackbar.LENGTH_LONG).show();
                }else{
                    validarAcceso(nombre_imput.getText().toString(),clave_imput.getText().toString());
                }

            }
        });
    }

    private void validarAcceso(String usuario, String clave) {

        Log.d("logVaalidando","validando");
        //if(usuario.equals(NOMBRE) && clave.equals(CLAVE))
        {
            SharedPreferences sharedPreferent;
            sharedPreferent = getSharedPreferences("preferentLogin",MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPreferent.edit();

            if(recordar_check.isChecked()){
                editor.putString("usuario",usuario);
                editor.putString("clave",clave);
                editor.putString("check","1");
                //Snackbar.make( findViewById(R.id.entrar_boton) ,"datos guardados",Snackbar.LENGTH_LONG);
            }else{
                editor.putString("usuario","");
                editor.putString("clave","");
                editor.putString("check","0");
            }

            editor.commit();
        }
    }

}
