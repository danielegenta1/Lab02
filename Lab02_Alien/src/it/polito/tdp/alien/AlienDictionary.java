package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary 
{
	private List<WordEnhanced>dizionario; 
	
	public AlienDictionary()
	{
		dizionario = new LinkedList<WordEnhanced>();
	}
	
	public void addWord(String alienWord, String translation)
	{
		WordEnhanced w = new WordEnhanced(alienWord, translation);
		
		//aggiunta
		for (WordEnhanced we : dizionario)
		{
			if (we.getAlienWord().compareTo(alienWord) == 0)
			{
				dizionario.get(dizionario.indexOf(we)).setTraslation(translation);
				return;
			}
		}
		dizionario.add(w);
		
		//ipotizzo che si inseriscano traduzioni multiple con aggiunte successive e non tutte in un colpo solo
		//aggiunta seconda traduzione
			
	}
	
	public List<String> translateWord(String alienWord)
	{
		for (WordEnhanced w : dizionario)
		{
			if (w.getAlienWord().compareTo(alienWord) == 0)
				return w.getTraslations();
		}
		return null;
	}
}
