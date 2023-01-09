package org.redbasic;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.redbasic.sam2.Book;

//import org.redbasic.Customer;

public class Testmain {


	public static void Person(String aaa)
	{
		System.out.println(aaa);
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("::: main");
        
        Person("Person call...");
        
        Customer customer = new Customer("redbasic", "홍기초");
        
        
        customer.Print();
        
        System.out.println(customer.toString());
        
        
        List<String> listValue = new ArrayList<>();
        listValue = customer.listTest();
        
        System.out.println("1111111111111111111");
        for (String string : listValue) {
			System.out.println(string);
		}
        
        System.out.println("2222222222222222222");
        for (Iterator iterator = listValue.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
        System.out.println("33333333333333333333");
        
        System.out.println(listValue.size());
        for(int a=0; a < listValue.size(); a++)
        {
        	System.out.println(listValue.get(a));
        }
        System.out.println("444444444444444444444");
        
        Book book = new Book();
        
        book.setData("위대한 확언");
        String bookName = book.getData();
        System.out.println(bookName);
        
        System.out.println("55555555555555");
	}



}
