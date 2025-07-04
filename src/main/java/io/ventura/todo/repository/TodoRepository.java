package io.ventura.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.ventura.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
