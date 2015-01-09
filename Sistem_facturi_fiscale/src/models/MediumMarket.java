package models;

public class MediumMarket extends Magazin {


	
	public MediumMarket() {
		super(TipMagazin.MINI);
		System.out.println("MediumMarket generat cu factory pattern");
	}

	@Override
	public double calculScutiriTaxe() {
		// TODO Auto-generated method stub
		return 0;
	}



}
