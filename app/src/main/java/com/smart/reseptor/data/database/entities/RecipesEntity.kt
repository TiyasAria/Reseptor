package com.smart.reseptor.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.smart.reseptor.models.FoodRecipe
import com.smart.reseptor.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id : Int = 0
}