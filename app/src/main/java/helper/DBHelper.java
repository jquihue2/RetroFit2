package helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import modelo.Categorias;

/**
 * Created by xcode on 5/7/16.
 */
public class DBHelper extends OrmLiteSqliteOpenHelper {
    private final static String DATABASE_NAME="restaurante.db";
    private final static int DATABASE_VERSION=1;

    private Dao<Categorias,Integer> categoriaDao;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.clearTable(connectionSource,Categorias.class);
            //... mas tablas
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }

    public Dao<Categorias, Integer> getCategoriaDao() {
        if(categoriaDao == null){

        }
        return categoriaDao;
    }

   /* public void setCategoriaDao(Dao<Categorias, Integer> categoriaDao) {
        this.categoriaDao = categoriaDao;
    }*/

    @Override
    public void close() {
        super.close();
        categoriaDao=null;
    }
}
