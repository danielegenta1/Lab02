package it.polito.tdp.alien;

public class Word {
	private String alienWord;
	private String traslation;

	public Word(String alienWord, String traslation) 
	{
		this.alienWord = alienWord;
		this.traslation = traslation;
	}

	public String getAlienWord() 
	{
		return alienWord;
	}

	public String getTraslation() 
	{
		return traslation;
	}
	
	public void setTraslation(String traslation)
	{
		this.traslation = traslation;
	}
	
	
	
	

}
