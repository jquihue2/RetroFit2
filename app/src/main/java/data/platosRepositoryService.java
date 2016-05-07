package data;

import modelo.Platos;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by xcode on 5/7/16.
 */
public interface platosRepositoryService {

    @GET("/searchPlateForCategory")
    void listaPlatos(@Query("idCategory")String idCategory, Callback<Platos> cb);
}
