package tartalyos;

public class Tartaly extends Tarolo {
	
	private double nyomas;
	
	public Tartaly(int terfogat, double nyomas ) {
		super(terfogat);
		this.nyomas=nyomas;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getNyomas() {
		return nyomas;
	}


	public void setNyomas(double nyomas) {
		this.nyomas = nyomas;
	}


	public boolean veszelyese()
	{
		if((getTerfogat()*nyomas)>100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public String toString() 
	{
		return "Tartaly: " + nyomas + ", veszelyese()=" + veszelyese();
	}
	
	public boolean nagyobbtartaly(Tartaly tartaly)
	{
		if(this.nyomas>tartaly.getNyomas())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static Tartaly getBiggerTartaky(Tartaly tartaly1, Tartaly tartaly2)
	{
		if(tartaly1.getTerfogat()>tartaly2.getTerfogat())
		{
			return tartaly1;
		}
		return tartaly2;
	}
	
	
}
