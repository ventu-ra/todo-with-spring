package io.ventura.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String descricao;
  private boolean status;
  private int prioridade;

  public Todo(String nome, String descricao, boolean status, int prioridade) {
    this.nome = nome;
    this.descricao = descricao;
    this.status = status;
    this.prioridade = prioridade;
  }

  public Todo() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public int getPrioridade() {
    return prioridade;
  }

  public void setPrioridade(int prioridade) {
    this.prioridade = prioridade;
  }

}
