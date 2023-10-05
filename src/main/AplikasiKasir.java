package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AplikasiKasir {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	static Product pudding = new Product("food1","Bread Butter Pudding", 11500);
	static Product cream = new Product("food2", "Cream Buille", 14000);
	static Product crois = new Product("food3", "Choco Croissant", 10500);
	static Product choc = new Product("food4", "Bank of Chocolat", 7500);
	
	public static void main(String[] args) {
		Product p = new Product();
		p.getNamaProduct();
		p.getGaransi();
		
		Electronic e = new Electronic();
		e.getNamaProduct();
		e.getGaransi();
		
		String line;
		try {
			while((line = reader.readLine())!= null) {
				if(line.equals("new")) {
					newTransaction();
				}else if(line.equals("report")){
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void newTransaction() {
		try {
			String namaPegawai = reader.readLine();
			Transaksi trx = new Transaksi(namaPegawai);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
