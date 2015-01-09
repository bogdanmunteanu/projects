package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import models.Gestiune;
import models.Produs;

public class Reader {

	public void readFacturi(String filename)
	{
		  
		    try {
		    	BufferedReader br = new BufferedReader(new FileReader(filename));
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null) {
		            //do some work
		        	System.out.println(line);
		        	//go to next line
		            line = br.readLine();
		        }
		       
		    }catch(Exception e)
		    {
		    	System.out.println(e.toString());
		    }
	}
	
	public void readProduse(String filename)
	{
			
		    try {
		    	BufferedReader br = new BufferedReader(new FileReader(filename));
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();
		        String[] countries = null;	
		        while (line != null) {
		            //do some work
		        	if(line.contains("Produs") || line.contains("Categorie"))
		        	{
		        		countries=line.split(" ");
		        		line = br.readLine(); 
		        	}
		        	String[] produs = line.split(" ");
		        	/*System.out.println(produs[0]+" "+produs[1]+" "+countries[2]+" "+produs[2]);
		        	System.out.println(produs[0]+" "+produs[1]+" "+countries[3]+" "+produs[3]);
		        	System.out.println(produs[0]+" "+produs[1]+" "+countries[4]+" "+produs[4]);*/
		        	Produs p = new Produs(produs[0], produs[1], countries[2], Double.parseDouble(produs[2]));
		        	Gestiune.getInstance().adaugaProdus(p);
		        	p = new Produs(produs[0], produs[1], countries[3], Double.parseDouble(produs[3]));
		        	Gestiune.getInstance().adaugaProdus(p);
		        	p = new Produs(produs[0], produs[1], countries[4], Double.parseDouble(produs[4]));
		        	Gestiune.getInstance().adaugaProdus(p);
		        	line = br.readLine();
		        }
		       
		    }catch(Exception e)
		    {
		    	System.out.println(e.toString());
		    }
}
	
	public void readTaxe(String filename)
	{
			ArrayList<String> temp = new ArrayList<>();
		    try {
		    	BufferedReader br = new BufferedReader(new FileReader(filename));
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();
		        String[] countries = null;
		        while (line != null) {
		            //do some work
		        	if (line .contains("Categorie"))
		        	{
		        		countries = line.split(" ");
		        	}
		        	String[] taxe = line.split(" ");
		        	temp.add(countries[1]+" "+taxe[0]+" "+taxe[1]);
		        	temp.add(countries[2]+" "+taxe[0]+" "+taxe[2]);
		        	temp.add(countries[3]+" "+taxe[0]+" "+taxe[3]);
		        	//go to next line
		            line = br.readLine();
		        }
		        //cleanup (needed before inserting into tax list
		        temp.remove(0);
		        temp.remove(1);
		        temp.remove(0);
	        	//insert all into tax list
		        for(String s :temp)
		        {
		        	//System.out.println(s);
		        	String[] t = s.split(" ");
		        	Gestiune.getInstance().adaugaTaxa(t[0], t[1], Double.parseDouble(t[2]));
		        }

		       
		    }catch(Exception e)
		    {
		    	System.out.println(e.toString());
		    }
	}
	
	
	
	
}
