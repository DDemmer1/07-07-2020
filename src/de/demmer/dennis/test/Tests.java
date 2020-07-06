package de.demmer.dennis.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.demmer.dennis.tagwrapper.Application;
import de.demmer.dennis.tagwrapper.WordTagger;

public class Tests {

	@Test
	public void testWordWrap() {
		String testText = "Das ist ein Test. Und das hier ist auch ein Test. test ... ,*+2132 <p>Test 1234</p> test";
		String expected = "Das ist ein <b>Test</b>. Und das hier ist auch ein <b>Test</b>. test ... ,*+2132 <p><b>Test</b> 1234</p> test";
		
		WordTagger tagger = new WordTagger();
		
		
		assertNotNull("Du musst noch eine IWrapper instanz implementieren ",Application.getWrapper());
		assertEquals(expected, tagger.wrapWord("Test", testText, "b"));
	}
}
