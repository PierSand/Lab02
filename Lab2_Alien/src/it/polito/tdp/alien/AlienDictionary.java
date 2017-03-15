package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	private Map<String, Word> word = new TreeMap<String, Word>();
	private Word w;

	
	public void addWord(String alienWord, String translation){
		alienWord=alienWord.toLowerCase();
		if(word.containsKey(alienWord)){
			word.remove(alienWord);
			word.put(alienWord, w=new Word(alienWord, translation));
		}
		else word.put(alienWord, w= new Word(alienWord, translation));
	}
	
	public String translateWord(String alienWord){
		alienWord=alienWord.toLowerCase();
		if(word.containsKey(alienWord)){
			return word.get(alienWord).getTranslation();
		}
		else return null;
	}
	
}
