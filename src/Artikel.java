
public class Artikel {
	private String name;
	private double preis;
	
	public Artikel(String name, double preis)
	{
		this.name = name;
		this.preis = preis;
	}
	
	public String getArtikelbeschreibung() 
	{
		return name;
	}
	
	public double getEinzelpreis() 
	{
		return preis;
	}

}
