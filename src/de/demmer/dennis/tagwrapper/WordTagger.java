package de.demmer.dennis.tagwrapper;

public class WordTagger {
	
	private IWrapper wrapper;
	
	
	public WordTagger () {
		wrapper = Application.getWrapper();
	}
	
	
	public String wrapWord(String word, String text, String tag) {
		return wrapper.wrap(text, word, tag);
	}
	
	

}
