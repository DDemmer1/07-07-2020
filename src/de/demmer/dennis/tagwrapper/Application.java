package de.demmer.dennis.tagwrapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
	
	public static IWrapper getWrapper() {
		//HIER MUSS EURE SELBST IMPLEMENTIERTE WRAPPER INSTANZ ZURÜCKGEGEBEN WERDEN
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a URL: ");
		String url = scanner.next();

		System.out.println("Please enter a word you want to mark: ");
		String word = scanner.next();
	
		System.out.println("Please enter a tag you want to wrap around the word (eg. b for a '<b></b>' wrap: ");
		String tag = scanner.next();
		
		WordTagger wordTagger = new WordTagger();

		try {
			String wrapped = wordTagger.wrapWord(word,  HtmlUtil.getText(url), tag);
			FileWriter writer = new FileWriter(new File("wrapped.html"));
			writer.write(wrapped);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
