package com.example.hibernatetest;

import com.example.hibernatetest.models.Todo;
import com.example.hibernatetest.services.TodoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TestInMemoryCrud {

    @Autowired
    private TodoService todoService;

    /*@BeforeClass
    public void setUp () {
        todoService.add(new Todo("Test ToDo"));
    }*/

    @Test
    public  void testAppearsInAll () {
        var todo = new Todo("Test todo");
        var id = todoService.add(todo);
        Todo item = todoService.getById(id);
        Assert.assertEquals(todo.getId(), item.getId());

    }


}
