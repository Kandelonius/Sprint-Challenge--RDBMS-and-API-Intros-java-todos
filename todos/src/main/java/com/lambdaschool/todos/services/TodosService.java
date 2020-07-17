package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;

import java.util.List;

public interface TodosService
{
    List<Todos> findAll();
    void markComplete(long todoid);
}
