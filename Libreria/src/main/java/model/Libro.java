package model;

public class Libro {

	private int id;
	private String titolo;
	private String autori;
	private double prezzo;
	private int copie;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutori() {
		return autori;
	}
	public void setAutori(String autori) {
		this.autori = autori;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getCopie() {
		return copie;
	}
	public void setCopie(int copie) {
		this.copie = copie;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", autori=" + autori + ", prezzo=" + prezzo + ", copie="
				+ copie + "]";
	}
	
	
	
	
	
}
