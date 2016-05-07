package data;

import java.util.List;

import modelo.Categorias;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by xcode on 5/7/16.
 */
public interface categoriaRepositoryService {

    @GET("/listCategory")
    public void listarCategoria(Callback<List<Categorias>> cb);
}
