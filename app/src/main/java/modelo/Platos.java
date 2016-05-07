package modelo;

import android.provider.ContactsContract;

/**
 * Created by xcode on 5/7/16.
 */
public class Platos {
    private String id_plato;
    private String nombre_plato;
    private String archivo_plato;
    private String id_categoria;

    public String getId_plato() {
        return id_plato;
    }

    public void setId_plato(String id_plato) {
        this.id_plato = id_plato;
    }

    public String getNombre_plato() {
        return nombre_plato;
    }

    public void setNombre_plato(String nombre_plato) {
        this.nombre_plato = nombre_plato;
    }

    public String getArchivo_plato() {
        return archivo_plato;
    }

    public void setArchivo_plato(String archivo_plato) {
        this.archivo_plato = archivo_plato;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }
}
