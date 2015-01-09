package models;

public class HyperMarket extends Magazin {


	
	public HyperMarket() {
		super(TipMagazin.HYPER);
		System.out.println("HyperMarket generat cu factory pattern");
	}

	@Override
	public double calculScutiriTaxe() {
		// TODO Auto-generated method stub
		return 0;
	}



}
