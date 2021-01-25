package com.smart.reseptor.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.smart.reseptor.data.database.entities.FavoritesEntity
import com.smart.reseptor.data.database.entities.FoodJokeEntity
import com.smart.reseptor.data.database.entities.RecipesEntity

@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class, FoodJokeEntity::class],
    version = 1,
    exportSchema = false
)
//untuk menyimpan beberapa type costum dalam database
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase : RoomDatabase() {

    abstract fun recipesDao() : RecipesDao
}