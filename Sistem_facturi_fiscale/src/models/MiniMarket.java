package models;

public class MiniMarket extends Magazin {
	
	public MiniMarket() {
		super(TipMagazin.MINI);
		System.out.println("MiniMarket generat cu factory pattern");
	}

	@Override
	public double calculScutiriTaxe() {
		// TODO Auto-generated method stub
		return 0;
	}





	

}
