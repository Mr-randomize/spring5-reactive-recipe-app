package com.iviberberi.spring5reactiverecipeapp.services;

import com.iviberberi.spring5reactiverecipeapp.commands.IngredientCommand;
import reactor.core.publisher.Mono;


public interface IngredientService {

    Mono<IngredientCommand> findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    Mono<IngredientCommand> saveIngredientCommand(IngredientCommand command);

    Mono<Void> deleteById(String recipeId, String idToDelete);
}
