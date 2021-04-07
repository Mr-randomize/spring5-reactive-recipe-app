package com.iviberberi.spring5reactiverecipeapp.services;

import com.iviberberi.spring5reactiverecipeapp.commands.RecipeCommand;
import com.iviberberi.spring5reactiverecipeapp.domain.Recipe;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RecipeService {

    Flux<Recipe> getRecipes();

    Mono<Recipe> findById(String id);

    Mono<RecipeCommand> findCommandById(String id);

    Mono<RecipeCommand>  saveRecipeCommand(RecipeCommand command);

    Mono<Void> deleteById(String idToDelete);
}
