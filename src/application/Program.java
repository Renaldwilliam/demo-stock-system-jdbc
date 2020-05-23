package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.ProductDao;
import model.dao.ProductDao;
import model.entities.Department;
import model.entities.Product;
import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		ProductDao ProductDao = DaoFactory.createProductDao();
		
		System.out.println("=== TEST 1: Product findById ====");
		Product Product = ProductDao.findById(3);
		System.out.println(Product);
		
		System.out.println("\n=== TEST 2: Product findByDepartment ====");
		Department department = new Department(1, null);
		List<Product> list  = ProductDao.findByDepartment(department);
		for (Product obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Product findAll ====");
		list  = ProductDao.findAll();
		for (Product obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: Product insert ====");
		Product newProduct = new Product(null, "Notebook mac", 2, new Date(), "Formatado", department);
		
		ProductDao.insert(newProduct);
		System.out.println("Inserted! New id = " + newProduct.getId());

		
		System.out.println("\n=== TEST 5: Product update ====");
		Product = ProductDao.findById(2);
		Product.setStatus("Formatado");
		ProductDao.update(Product);
		System.out.println("Update completed");
		
		
		System.out.println("\n=== TEST 6: Product delete ====");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		ProductDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
		
	}

}
