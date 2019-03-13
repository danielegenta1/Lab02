package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {
	private String alienWord;
	private List<String> traslations;

	public WordEnhanced(String alienWord, String traslation) 
	{
		this.alienWord = alienWord;
		traslations = new LinkedList<String>();
		setTraslation(traslation);
	}

	public String getAlienWord() 
	{
		return alienWord;
	}

	public List<String> getTraslations() 
	{
		for (String s : traslations)
			System.out.println(traslations);
		return traslations;
	}
	
	public void setTraslation(String traslation)
	{
		traslations.add(traslation);
	}
	
	
	
	

}
