package com.example.hibernatetest.services;

import com.example.hibernatetest.models.Todo;
import com.example.hibernatetest.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TodoService  {
    @Autowired
    private TodoRepository todoRepository;

    public long add(Todo todo) {
        var item =  todoRepository.save(todo);
        return item.getId();
    }

    public List<Todo> list() {
        return todoRepository.findAll();
    }

    public void delete(long id) {
        todoRepository.deleteById(id);
    }

    public Todo getById(long id) {
        return todoRepository.getOne(id);
    }

}
