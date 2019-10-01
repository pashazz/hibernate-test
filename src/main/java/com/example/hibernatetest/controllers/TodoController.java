package com.example.hibernatetest.controllers;

import com.example.hibernatetest.models.Todo;
import com.example.hibernatetest.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping(value = "/{id}")
    public Todo getById(@PathVariable("id") long id) {
        return todoService.getById(id);
    }

    @GetMapping
    public List<Todo> getAll() {
        return todoService.list();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public long create(@RequestBody Todo todo) {
        return  todoService.add(todo);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") long id) {
         todoService.delete(id);
    }
}
