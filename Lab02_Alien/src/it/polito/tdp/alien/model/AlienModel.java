package it.polito.tdp.alien.model;

import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.alien.AlienDictionary;
import it.polito.tdp.alien.WordEnhanced;

public class AlienModel 
{
	AlienDictionary dizionario;
	public AlienModel()
	{
		dizionario = new AlienDictionary();
	}
	
	public String doTranslate(String input)
	{
		String result = "";
		String buffer[] = input.split(" ");

		if (buffer.length == 1)
		{
			//controllo se parola è corretta
			if (!buffer[0].matches("[a-zA-z?]+"))
				throw new InvalidParameterException(String.format("ERRORE: La stringa può contenere solo caratteri alfabetici\n"));
				
			
			List<String>aus = dizionario.translateWord(buffer[0].toLowerCase());
			if (aus == null)
				return "AlienWord non trovata nel dizionario.\n";
			
			//formattazione output
			String res = "";
			for (int i = 1; i <= aus.size(); i++)
			{
				String s = aus.get(i-1);
				if (i <= aus.size()-1)
					res += s + ", ";
				else
					res += s;
			}
			result = "La traduzione di: " + input + " è: " + res+"\n";
		}
		else if (buffer.length == 2)
		{
			if (!buffer[0].matches("[a-zA-z]+") || !buffer[1].matches("[a-zA-z?]+"))
				throw new InvalidParameterException(String.format("ERRORE: La stringa può contenere solo caratteri alfabetici\n"));
			
			//controllo se parola non esiste in dizionario
			//controllo se parola è corretta
			dizionario.addWord(buffer[0].toLowerCase(), buffer[1].toLowerCase());
			result = "Combinazione: " + buffer[0] + " - " + buffer[1] + " aggiunta a dizionario\n";
		}
		//TODO generare eccezione?
		else
			result = "ERRORE: Formato stringa inserita non corretto\n";
		
		return result;
	}
	
	public void doClear()
	{
		dizionario.clear();
	}

}
