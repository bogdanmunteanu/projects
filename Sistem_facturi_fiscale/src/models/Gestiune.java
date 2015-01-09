package models;

import java.util.ArrayList;
import java.util.HashMap;

public class Gestiune {

	private static Gestiune singleton;
	private static ArrayList<Produs> produse = new ArrayList<>(); //lista produse
	private static ArrayList<Magazin> magazine = new ArrayList<>(); //lista magazine
	private static HashMap<String, HashMap<String, Double>> taxe = new HashMap<>(); //dictionar de perechi
	
	public static Gestiune getInstance()
	{
		if(singleton==null)
		{
			singleton=new Gestiune();
		}
		return singleton;
	}
	//Metode pentru lista de produse
	public void adaugaProdus(Produs prod)
	{
		produse.add(prod);
	}
	
	public void stergeProdus(int index)
	{
		produse.remove(index);
	}
	
	public ArrayList<Produs> afiseazaProduse()
	{
		return produse;
	}
	
	//Metode pentru lista de taxe
	public void adaugaTaxa(String tara,String categorie,double procent)
	{
		HashMap<String, Double> temp = taxe.get(tara);
		if(temp==null)
		{
			temp = new HashMap<String,Double>();
			temp.put(categorie, procent);
			taxe.put(tara, temp);
		}else
		{
			temp.put(categorie, procent);
		}
		
		
	}
	
	public HashMap<String, HashMap<String, Double>>  getTaxe()
	{
		return taxe;
	}
	
	
	
}
