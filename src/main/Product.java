package main;

public class Product {
	//kode, nama, harga
	private String kodeProduct;
	private String namaProduct;
	private double hargaProduct;
	
	//default constructor
	public Product() {
		namaProduct = "no-name";
		hargaProduct = 0;
	}
	
	//overloaded constructor
	public Product(String kodeProduct, String namaProduct, double hargaProduct) {
		this.kodeProduct = kodeProduct;
		this.namaProduct = namaProduct;
		this.hargaProduct = hargaProduct;
	}
	
	//method setter kodeProduct
	public void setKodeProduct(String kodeProduct) {
		this.kodeProduct = kodeProduct;
	}
	
	//method getter kodeProduct
	public String getKodeProduct() {
		return kodeProduct;
	}

	public String getNamaProduct() {
		return namaProduct;
	}

	public void setNamaProduct(String namaProduct) {
		this.namaProduct = namaProduct;
	}

	public double getHargaProduct() {
		return hargaProduct;
	}

	public void setHargaProduct(double hargaProduct) {
		this.hargaProduct = hargaProduct;
	}

	@Override
	public String toString() {
		String s = this.getKodeProduct() + ". " + this.getNamaProduct() +
				": " + this.getHargaProduct();
		
		//001. Roti Tawar: 10000.0
		return s;
	}
	
	
	
}
