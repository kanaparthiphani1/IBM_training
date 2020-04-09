package com.exaple.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Todo 
{
	private String id;
	
	private String name;
	
	public Todo(String name)
	{
		this.id=UUID.randomUUID().toString();
		this.name=name;
	}
	
}
