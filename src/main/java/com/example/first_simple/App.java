package com.example.first_simple;

import java.util.Scanner;

import com.example.service.TaskService;
import com.exaple.model.Task;
import com.exaple.model.Todo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   	 Scanner sc = new Scanner(System.in);
    	int choice=5;
    	Task objtask=new Task();
    	Todo objtodo =new Todo();
    	TaskService objService=new TaskService();
    	while(choice!=3)
    	{
    	System.out.println("1.create todo");
    	System.out.println("2.display todo");
    	System.out.println("Enter ur choice:");
    	choice=sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    	{
    		System.out.println("Enter name:");
    		String name=sc.next();
    		objtodo=new Todo(name);
    		objtask=objService.createTaskService(objtodo);
    		
    	}
    	break;
    	case 2:
    	{
    		objService.displayService(objtask);
    		
    	}
    	break;
    	case 3:
    		break;
    	}
    	}
    }
}
