package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V14", 15000, "16GB Ram"); // Klas oluþturma böyle yapýlýr, örnek oluþturma, referans oluþturma, intance

		
		Product product2 = new Product(); // Classlar kýsaca özellik tutucu özelliðe sahiptir
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram"; // Hepsiburada P1,P2,P3 gibi kodladýk
		
		Product product3 = new Product(); // Stock ve Heap kýsmý, heap=newden sonra baþlar 
		product3.id = 1;
		product3.name = "Hp 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		
		Product[] products = {product1,product2,product3};
		
		for(Product product : products) {
			
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		System.out.println("----------------------------");
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		System.out.println("----------------------------------");
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1); // Sepeteye ne ekleyecek içine yazabiliriz buna parametre denir 
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);

	}

}
