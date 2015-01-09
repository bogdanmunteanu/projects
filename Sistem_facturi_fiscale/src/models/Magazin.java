package models;

import java.util.Vector;

public abstract class Magazin implements IMagazin {

	
	private String nume;
	private TipMagazin tip = null;
	private Vector<Factura> facturi;
	
	public Magazin(TipMagazin tip)
	{
		this.tip=tip;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Vector<Factura> getFacturi() {
		return facturi;
	}

	public void setFacturi(Vector<Factura> facturi) {
		this.facturi = facturi;
	}

	@Override
	public double getTotalFaraTaxe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalCuTaxe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalCuTaxeScutite() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalTaraFaraTaxe(String tara) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalTaraCuTaxe(String tara) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalTaraCuTaxeScutite(String tara) {
		// TODO Auto-generated method stub
		return 0;
	}

	public TipMagazin getTip() {
		return tip;
	}

	public void setTip(TipMagazin tip) {
		this.tip = tip;
	}

}
