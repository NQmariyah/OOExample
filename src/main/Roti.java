package main;

public class Roti extends Product{
	private String rasa;

	public Roti(String kodeProduct, String namaProduct, double hargaProduct, String rasa) {
		super(kodeProduct, namaProduct, hargaProduct);
		this.rasa = rasa;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
}
