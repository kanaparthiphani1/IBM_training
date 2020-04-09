package com.example.service;

import java.util.ArrayList;

import com.example.dao.TaskImpl;
import com.exaple.model.Task;
import com.exaple.model.Todo;

public class TaskService 
{

	private TaskImpl obj;
	{
		obj=new TaskImpl();
	}
	public Task createTaskService(Todo ob)
	{
		Task objTask= obj.createTask(ob);
		return objTask;
	}
	
	public void displayService(Task k)
	{
		obj.display(k);
	}
}
