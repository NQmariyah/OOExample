package main;

import java.time.LocalDate;

public class Electronic extends Product{
	private LocalDate garansi;

	public LocalDate getGaransi() {
		return garansi;
	}

	public void setGaransi(LocalDate garansi) {
		this.garansi = garansi;
	}
	
	
}
