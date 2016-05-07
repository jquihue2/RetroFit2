package modelo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by xcode on 5/7/16.
 */

@DatabaseTable
public class Categorias {

    protected static final String ID_CATEGORIA="_id_categoria";
    protected static final String NOMBRE_CATEGORIA="nombre_categoria";

    @DatabaseField(generatedId = true,columnName = ID_CATEGORIA)
    private String id_categoria;
    @DatabaseField(generatedId = true,columnName = NOMBRE_CATEGORIA)
    private String nombre;

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
