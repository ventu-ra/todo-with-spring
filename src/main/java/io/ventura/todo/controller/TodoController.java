package io.ventura.todo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ventura.todo.entity.Todo;
import io.ventura.todo.service.TodoService;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @PostMapping
  public List<Todo> create(@RequestBody Todo todo) {
    // TODO: process POST request

    return todoService.create(todo);
  }

}
