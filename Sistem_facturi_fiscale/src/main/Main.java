package main;

import java.util.ArrayList;

import models.Gestiune;
import models.MagazinFactory;
import models.Produs;
import models.TipMagazin;
import utils.Reader;

public class Main {

	public static void main(String[] args) {
		//Aplication entry point
		Reader reader = new Reader();
		//reader.readFacturi("facturi.txt");
		//reader.readProduse("produse.txt");
		reader.readTaxe("taxe.txt");
		//ArrayList<Produs> produse = ListaProduse.getInstance().afiseazaProduse();
		//for(Produs p: ListaProduse.getInstance().afiseazaProduse())
		//{
		//	System.out.println(p);
		//}
		/*ystem.out.println("::::TEST FACTORY PATTERN::::");
		System.out.println(MagazinFactory.creareMagazin(TipMagazin.MINI));
		System.out.println(MagazinFactory.creareMagazin(TipMagazin.MINI));
		System.out.println(MagazinFactory.creareMagazin(TipMagazin.MINI));*/
		System.out.println(Gestiune.getInstance().getTaxe().toString());
	}

}
