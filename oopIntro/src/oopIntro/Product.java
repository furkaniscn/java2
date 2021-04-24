package oopIntro;

public class Product {
	
	public Product() { // Constructor=yap�c� k�sm�d�r ve bu k�s�m yazmasanda her zaman vard�r
		System.out.println("Ben �al��t�m"); // Fakat i�ine bir �ey yazmak istiyorsan b�yle yapmak zorundas�n
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this(); // Ba�ka class �a��r�labilir �sttekini �a��rd�k
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
