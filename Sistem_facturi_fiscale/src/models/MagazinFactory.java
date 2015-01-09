package models;

public class MagazinFactory {
	
	public static Magazin creareMagazin(TipMagazin tip)
	{
		Magazin magazin = null;
		switch(tip)
		{
		case MINI:
			magazin = new MiniMarket();
			break;
			
		case MEDIUM:
			magazin = new MediumMarket();
			break;
			
		case HYPER: 
			magazin= new HyperMarket();
			break;
			
		default:
			System.out.println("Nu a fost creat nici un magazin , pentru ca lipseste tipul!");
			break;
		}
		return magazin;
	}
}
