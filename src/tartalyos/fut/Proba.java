package tartalyos.fut;

import tartalyos.Tartaly;

public class Proba {

	public static void main(String[] args) 
	{
		Tartaly[] array=new Tartaly[5];
		
		for(int i=0; i<array.length; i++)
		{
			array[i]=new Tartaly(i+10, i);
		}
		
		
		
		int maxnymas=0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i].nagyobbtartaly(array[maxnymas]))
			{
				maxnymas=i;
			}
		}
		
		
		
		
		Tartaly maxtartaly= array[0];
		
		for(int i=0; i<array.length; i++)
		{
			if(maxtartaly.getTerfogat()<array[i].getTerfogat())
			{
				maxtartaly=array[i];
			}
		}
		
		System.out.println(maxtartaly);
	}

}
