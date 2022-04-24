package practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Product {
	private String id;
	private String name;
	private int quantity;
	private float price;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

class Cart {

	static ArrayList<Product> productList = new ArrayList<>();

	public static int totalTtems() {
		int sum = 0;
		for (int i = 0; i < productList.size(); i++) {
			sum = sum + productList.get(i).getQuantity();
		}
		return sum;
	}

	public static float netPrice() {
		float price = 0;
		for (int i = 0; i < productList.size(); i++) {
			price = price + productList.get(i).getQuantity() * productList.get(i).getPrice();
		}
		return price;
	}
}

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		Product product1 = new Product();
		System.out.println("Product 1 : ");
		System.out.println("ID : ");
		product1.setId(src.next());
		System.out.println("NAME : ");
		product1.setName(src.next());
		System.out.println("QUANTITY : ");
		product1.setQuantity(src.nextInt());
		System.out.println("PRICE : ");
		product1.setPrice(src.nextFloat());
		
		Product product2 = new Product();
		System.out.println("Product 2 : ");
		System.out.println("ID : ");
		product2.setId(src.next());
		System.out.println("NAME : ");
		product2.setName(src.next());
		System.out.println("QUANTITY : ");
		product2.setQuantity(src.nextInt());
		System.out.println("PRICE : ");
		product2.setPrice(src.nextFloat());
		
		src.close();
		
		Cart obj = new Cart();
		obj.productList.add(product1);
		obj.productList.add(product2);
		System.out.println(obj.netPrice());
		System.out.println(obj.totalTtems());
		
	}

}

//import java.io.*;
//public class ReadDataFromInput {
//   public static void main (String[] args) {
//      int firstNum, secondNum, result;
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      try {
//         System.out.println("Enter a first number:");
//         firstNum = Integer.parseInt(br.readLine());
//         System.out.println("Enter a second number:");
//         secondNum = Integer.parseInt(br.readLine());
//         result = firstNum * secondNum;
//         System.out.println("The Result is: " + result);
//      } catch (IOException ioe) {
//         System.out.println(ioe);
//      }
//   }
//}
