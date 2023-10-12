package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AplikasiKasir {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static String namaPegawai;
	
	static ArrayList<Product> inventory = new ArrayList<>();
	static ArrayList<Transaksi> trxRecords = new ArrayList<>(); 
	
	public static void main(String[] args) {
		int choice;
		
		try {
			signin();
			populateProduct();
			
			do {
				showMenu();
				System.out.println("Masukkan pilihan(1/2/3/4):");
				choice = Integer.parseInt(reader.readLine());
				
				switch (choice) {
				case 1:
					manageProduct();
					break;
				case 2:
					newTrx();
					break;
				case 3:
					manageTrx();
					break;
				}
				
				System.out.println("");
			}while(choice != 4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void showMenu() {
		System.out.println("Toko Berkah Kue Kreatif");
		System.out.println("=======================");
		System.out.println("Kasir: " + namaPegawai);
		System.out.println("1. Kelola Produk");
		System.out.println("2. Transaksi Baru");
		System.out.println("3. Lihat Laporan Transaksi");
		System.out.println("4. Keluar");
		System.out.println("");
	}
	
	public static void populateProduct() {
		inventory.add(new Roti("001", "Roti Tawar", 10000, "Tawar"));
		inventory.add(new Roti("002", "Roti Gandum", 15000, "Gandum"));
		inventory.add(new Roti("003", "Roti Manis", 5000, "Keju"));
		inventory.add(new Roti("004", "Brownies", 50000, "Cokelat Keju"));
		inventory.add(new Minuman("005", "Kopi Susu", 12000));
		
	}
	
	public static void signin() throws IOException {
		System.out.println("Masukkan nama:");
		namaPegawai = reader.readLine();
	}
	
	public static void manageProduct() {
		for(Product p : inventory) {
			System.out.println(p);
		}
	}
	
	public static void newTrx() throws IOException {
		Transaksi t = new Transaksi(namaPegawai);
		String tempProduct;
		ArrayList<Product> keranjang = new ArrayList<>();
		double amt = 0;
		String kodetransaksi = LocalDateTime.now().toString();
		t.setKodeTransaksi(kodetransaksi);
		
		do {
			System.out.println("Masukkan kode product:");
			tempProduct = reader.readLine();
			
			for(Product p: inventory) {
				if(p.getKodeProduct().equals(tempProduct)) {
					keranjang.add(p);
					amt += p.getHargaProduct();
				}
			}
			
		}while(!tempProduct.equals("0"));
		
		t.setProductList(keranjang);
		t.setSubAmt(amt);
		t.setTotalAmt(amt);
		t.setWaktuTransaksi(LocalDateTime.now());
		
		System.out.println("Membayar dengan: ");
		t.setMetodePembayaran(reader.readLine());
		System.out.println("Bayar: ");
		t.setPaidAmt(Double.parseDouble(reader.readLine()));
		t.setChangeAmt(t.getPaidAmt()-t.getTotalAmt());
		
		
		trxRecords.add(t);
	}
	
	public static void manageTrx() {
		for(Transaksi t : trxRecords) {
			System.out.println(t);
		}
	}
}
