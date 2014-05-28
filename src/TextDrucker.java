import java.util.ArrayList;



public class TextDrucker implements Drucker 
{
	public void drucken(ArrayList<Artikel> artikelListe) 
	{
		for(Artikel artikel: artikelListe)
		{
			  System.out.println(artikel.getArtikelbeschreibung()+" "+artikel.getEinzelpreis());
		}

	}

}
