package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService
{

    @Autowired
    private TodosRepository todosRepos;

    @Autowired
    private UserService userService;

    @Override
    public void markComplete(long todoid)
    {
//        Todos todo
    }

    @Override
    public List<Todos> findAll()
    {
        List<Todos> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        todosRepos.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Todos save(Todos todos)
    {
        Todos newTodo = new Todos();

        newTodo.setDescription(todos.getDescription()
            .toLowerCase());
        newTodo.setUser(todos.getUser());

        return todosRepos.save(newTodo);
    }

    @Override
    public Todos findTodoById(long id)
    {
        return null;
    }
}
