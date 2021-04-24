package oopIntro;

public class Product {
	
	public Product() { // Constructor=yapýcý kýsmýdýr ve bu kýsým yazmasanda her zaman vardýr
		System.out.println("Ben çalýþtým"); // Fakat içine bir þey yazmak istiyorsan böyle yapmak zorundasýn
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this(); // Baþka class çaðýrýlabilir üsttekini çaðýrdýk
		this.id = id; // Bu classtaki id
		this.name = name; // Bu clastaki name
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;

}
