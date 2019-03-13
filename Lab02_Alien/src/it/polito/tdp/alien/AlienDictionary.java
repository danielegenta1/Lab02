package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary 
{
	private List<Word>dizionario; 
	
	public AlienDictionary()
	{
		dizionario = new LinkedList<Word>();
	}
	
	public void addWord(String alienWord, String translation)
	{
		Word w = new Word(alienWord, translation);
		//aggiunta
		if (!dizionario.contains(w))
			dizionario.add(w);
		//aggiornamento
		else
			dizionario.get(dizionario.indexOf(w)).setTraslation(translation);
	}
	
	public String translateWord(String alienWord)
	{
		for (Word w : dizionario)
		{
			if (w.getAlienWord().compareTo(alienWord) == 0)
				return w.getTraslation();
		}
		return null;
	}
}
