package data;

import android.content.Context;
import android.util.Log;

import java.util.List;

import modelo.Categorias;
import modelo.Platos;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by xcode on 5/7/16.
 */
public class restPlato {
    private String url="http://162.243.32.93";
    Context context;
    public restPlato(Context context){
        this.context=context;
    }

    public void obtenerPlatos(String idCategoria){
        RestAdapter restAdapter=new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(url).build();
        platosRepositoryService restInterface=  restAdapter.create(platosRepositoryService.class);
        restInterface.listaPlatos(idCategoria, new Callback<Platos>() {
            @Override
            public void success(Platos platos, Response response) {
                Log.d("ok","listaPlatos");
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("error",error.getMessage().toString());
            }
        });

    }
}
