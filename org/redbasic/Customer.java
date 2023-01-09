package org.redbasic;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String id ;
	public String name;

    public Customer(String id, String name)
    {
    	this.id = id;
    	this.name = name;
    }
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void Print()
    {
    	System.out.println("id : " + this.id);
    	System.out.println("name : " + this.name);
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	public List<String> listTest() {
		
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		
		
		
		return list;
		
	}
	
	
}
