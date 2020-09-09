package com.example.doodleblue_project.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.doodleblue_project.database.dao.ProductDao;
import com.example.doodleblue_project.database.model.Products;

@Database(entities = Products.class, version = 1)
public abstract class Productdatabase extends RoomDatabase {

    private static Productdatabase mInstance;

    //method to get room database
    public static Productdatabase getDatabase(Context context) {

        if (mInstance == null)
            mInstance = Room.databaseBuilder(context.getApplicationContext(),
                    Productdatabase.class, "products_db")
                    .build();

        return mInstance;
    }

    //method to remove instance
    public static void closeDatabase() {
        mInstance = null;
    }

//    define product dao ( data access object )
    public abstract ProductDao productDao();
}
