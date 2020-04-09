package com.example.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.exaple.model.Task;
import com.exaple.model.Todo;

public class TaskImpl 
{
	
	Task objtask =new Task();
	
	public Task createTask(Todo obj)
	{
	
		objtask.addtodo(obj);
		
		return objtask;
	}
	

	public void display(Task t)
	{
		System.out.println("Task Id:"+t.getId());
		Iterator<Todo> objIt = t.getTodo().iterator();
		while(objIt.hasNext())
		{
			Todo obj=(Todo)objIt.next();
			System.out.println("Todo ID:"+obj.getId());
			System.out.println("Todo Name:"+obj.getName());
		}
	}
}
