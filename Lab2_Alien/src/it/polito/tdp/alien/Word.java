package it.polito.tdp.alien;

import java.util.*;

public class Word {
	private String alienWord;
	private String translation;
	private List<String> parole = new LinkedList<String>();
	
	public Word(String alienWord, String translation){
		this.translation=translation;
		this.alienWord=alienWord;
	}
	
	public String getTranslation(){
		return this.translation;
	}
}