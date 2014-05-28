import java.util.ArrayList;


public class Rechnung 
{
	
	private ArrayList<Artikel> artikelListe= new ArrayList<Artikel>();
	
	
	public void addArtikel(Artikel artikel)
	{
		artikelListe.add(artikel);
	}
	
	public void drucken(Drucker drucker)
	{
		drucker.drucken(artikelListe);
	}
 
	public static void main(String[] args) 
	{
		Rechnung meineRechnung = new Rechnung();
		
		meineRechnung.addArtikel(new Artikel("Brot",1.30));
		meineRechnung.addArtikel(new Artikel("Milch",1.49));
		meineRechnung.addArtikel(new Artikel("Butter",0.99));
		meineRechnung.addArtikel(new Artikel("Pizza",1.89));
		
		meineRechnung.drucken(new HtmlDrucker());
		meineRechnung.drucken(new TextDrucker());
	}
}
