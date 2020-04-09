package com.exaple.model;

import java.util.ArrayList;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Task 
{

	private String id;
	private ArrayList<Todo> todo;
	
	{
		todo=new ArrayList<Todo>();
		this.id = UUID.randomUUID().toString();

	}
	
	
	public Task(int id, ArrayList<Todo> todo) {
		super();

		this.todo = todo;
	}
	public void addtodo(Todo obj)
	{
		todo.add(obj);
	}
	public Task() {
		super();
	}
	
}
