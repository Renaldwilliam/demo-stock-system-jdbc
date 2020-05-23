package application;


import java.util.Date;

import model.entities.Department;
import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1,"books");	
		
		Product obj1 = new Product(1, "impressora", 3,new Date(), "estragada", obj);
		
		System.out.println(obj1);
		
	}

}
