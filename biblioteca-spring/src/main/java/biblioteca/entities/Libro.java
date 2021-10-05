package biblioteca.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro implements Comparable<Libro>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.titolo.compareTo(o.titolo);
	}
	
	
	
	
	
}
