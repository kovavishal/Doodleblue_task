package com.example.doodleblue_project.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.doodleblue_project.database.model.Products;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface ProductDao {
    @Insert
    void insertNote(Products product);
}
