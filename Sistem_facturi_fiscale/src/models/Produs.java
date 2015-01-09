package models;

public class Produs {

	private String denumire;
	private String categorie;
	private String taraOrigine;
	private double pret;
	
	
	//Constructor
	public Produs(String denumire, String categorie, String taraOrigine,double pret) {
		
		this.denumire = denumire;
		this.categorie = categorie;
		this.taraOrigine = taraOrigine;
		this.pret = pret;
	}
	//Getters and setters


	public String getDenumire() {
		return denumire;
	}


	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public String getTaraOrigine() {
		return taraOrigine;
	}


	public void setTaraOrigine(String taraOrigine) {
		this.taraOrigine = taraOrigine;
	}


	public double getPret() {
		return pret;
	}


	public void setPret(double pret) {
		this.pret = pret;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(256);
		sb.append("Produs :");
		sb.append(" "+denumire);
		sb.append(" "+categorie);
		sb.append(" "+taraOrigine);
		sb.append(" "+pret);
		
		return sb.toString();
	}
	
	
	
	
	
	
}
