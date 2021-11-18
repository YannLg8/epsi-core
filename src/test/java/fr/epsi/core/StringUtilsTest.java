package fr.epsi.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringUtilsTest {

	@ParameterizedTest(name = "Palindrome")
	@ValueSource(strings = { "radar" }) // Le test sera lancé 1 fois
	void palindrome(String word) {
		assertTrue(StringUtils.isPalindrome(word));

	}

	@ParameterizedTest(name = "Palindrome")
	@ValueSource(strings = { "Luc" }) // Le test sera lancé 1 fois
	void notPalindrome(String word) {
		assertFalse(StringUtils.isPalindrome(word));

	}

	@ParameterizedTest(name = "Encodage césard")
	@CsvFileSource(resources = "/cesare.csv") // Le test sera lancé 1 fois
	void encodeCésare() {
		assertEquals("C", StringUtils.cesarEncode("A", 2));
	}
	
	@ParameterizedTest(name = "decodage césard")
	@CsvFileSource(resources = "/cesare.csv") // Le test sera lancé 1 fois
	void decodeCésare() {
		assertEquals("A", StringUtils.cesarDecode("C",2));
	}
}
