package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService
{

    @Override
    public void markComplete(long todoid)
    {

    }

    @Override
    public List<Todos> findAll()
    {
        return null;
    }
}
