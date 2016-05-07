package data;

import android.content.Context;
import android.util.Log;

import java.util.List;

import modelo.Categorias;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by xcode on 5/7/16.
 */
public class restCaegoriaService {
    private String url="http://162.243.32.93";
    Context context;
    public restCaegoriaService(Context context){
        this.context=context;
    }

    public void obtenerCategorias(){
        RestAdapter restAdapter=new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL) .setEndpoint(url).build();
        categoriaRepositoryService restInterface=  restAdapter.create(categoriaRepositoryService.class);

        restInterface.listarCategoria(new Callback<List<Categorias>>() {
            @Override
            public void success(List<Categorias> categoriases, Response response) {
                Log.d("ok","satisfactorio");
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("ok","error");
                
            }
        });
    }
}
