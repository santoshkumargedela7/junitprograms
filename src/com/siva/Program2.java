package com.siva;

import java.util.Optional;

public class Program2 {
		
	int id;
	String name;
	
	public Program2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Program2 [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {
			
		Program2 program = new Program2(101,"siva");
		program.getName();
		System.out.println(program);
		Program2 program1 = new Program2(102, "santosh");
		String name = program1.getName();
		System.out.println(name);
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);
		
	Optional<String>optional = 	Optional.ofNullable(program1.getName());
		System.out.println(optional);
		
	}

	

}
