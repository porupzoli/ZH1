package tartalyos;

public abstract class Tarolo 
{
	int terfogat;

	public Tarolo(int terfogat) 
	{
		super();
		this.terfogat = terfogat;
	}
	
	public abstract boolean veszelyese();

	public int getTerfogat() {
		return terfogat;
	}

	public void setTerfogat(int terfogat) {
		this.terfogat = terfogat;
	}


	
	
}
