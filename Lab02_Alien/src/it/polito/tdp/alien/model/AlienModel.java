package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.alien.AlienDictionary;
import it.polito.tdp.alien.Word;

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
			//TODO generare eccezione
			if (!buffer[0].matches("[a-zA-z]+"))
				return "ERRORE: La stringa può contenere solo caratteri alfabetici\n";
				
			//controllo se parola è corretta
			String res = dizionario.translateWord(buffer[0].toLowerCase());
			if (res == null)
				result = "AlienWord non trovata nel dizionario.\n";
			else
				result = "La traduzione di: " + input + " è " + res+"\n";
		}
		else if (buffer.length == 2)
		{
			//TODO generare eccezione
			if (!buffer[0].matches("[a-zA-z]+") || !buffer[1].matches("[a-zA-z]+"))
				return "ERRORE: La stringa può contenere solo caratteri alfabetici\n";
			
			//controllo se parola non esiste in dizionario
			//controllo se parola è corretta
			dizionario.addWord(buffer[0].toLowerCase(), buffer[1].toLowerCase());
			result = "Parola: " + buffer[0] + " aggiunta a dizionario\n";
		}
		//TODO generare eccezione?
		else
			result = "ERRORE: Formato stringa inserita non corretto\n";
		
		return result;
	}

}
