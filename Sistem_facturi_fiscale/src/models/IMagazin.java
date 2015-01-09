package models;

public interface IMagazin {
	
		public double getTotalFaraTaxe();
		public double getTotalCuTaxe();
		public double getTotalCuTaxeScutite(); // = getTotalCuTaxe daca nu sunt scutiri de taxe
		public double getTotalTaraFaraTaxe(String tara);
		public double getTotalTaraCuTaxe(String tara);
		public double getTotalTaraCuTaxeScutite(String tara);
		public double calculScutiriTaxe();
		
}
