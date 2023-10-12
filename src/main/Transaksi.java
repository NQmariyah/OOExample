package main;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Transaksi {
	//tanggal, kode, product, carabayar, totalharga, subtotal, jumlahdibayar, kembalian, namapegawai
	public LocalDateTime waktuTransaksi;
	public String kodeTransaksi;
	public ArrayList<Product> productList = new ArrayList<>();
	public String metodePembayaran;
	public double totalAmt;
	public double subAmt;
	public double paidAmt;
	public double changeAmt;
	public String namaPegawai;
	
	public Transaksi(String namaPegawai) {
		this.namaPegawai = namaPegawai; 
		System.out.println("Transaksi baru atas nama: " + namaPegawai);
	}

	public LocalDateTime getWaktuTransaksi() {
		return waktuTransaksi;
	}

	public void setWaktuTransaksi(LocalDateTime waktuTransaksi) {
		this.waktuTransaksi = waktuTransaksi;
	}

	public String getKodeTransaksi() {
		return kodeTransaksi;
	}

	public void setKodeTransaksi(String kodeTransaksi) {
		this.kodeTransaksi = kodeTransaksi;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public String getMetodePembayaran() {
		return metodePembayaran;
	}

	public void setMetodePembayaran(String metodePembayaran) {
		this.metodePembayaran = metodePembayaran;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public double getSubAmt() {
		return subAmt;
	}

	public void setSubAmt(double subAmt) {
		this.subAmt = subAmt;
	}

	public double getPaidAmt() {
		return paidAmt;
	}

	public void setPaidAmt(double paidAmt) {
		this.paidAmt = paidAmt;
	}

	public double getChangeAmt() {
		return changeAmt;
	}

	public void setChangeAmt(double changeAmt) {
		this.changeAmt = changeAmt;
	}

	public String getNamaPegawai() {
		return namaPegawai;
	}

	public void setNamaPegawai(String namaPegawai) {
		this.namaPegawai = namaPegawai;
	}
	
	@Override
	public String toString() {
		String s = this.getKodeTransaksi() + " - " + this.getTotalAmt();
		return s;
	}
}
