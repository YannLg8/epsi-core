package fr.epsi.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class MathUtilsTests {

	@ParameterizedTest(name = "factorial of {0}is {1}")
	@CsvFileSource(resources = "/factorial.csv", numLinesToSkip = 1)
	void factorial(int col1, double col2) {
		assertEquals(col2, MathUtils.factorial(col1));
	}

	@ParameterizedTest(name = "{0} is a prime number") // {0} sera remplacé par le 1e argument
	@ValueSource(ints = { 2,5,7,11,13,29,31 }) // Le test sera lancé 6 fois
	void nb1st(int number) {
		assertTrue(MathUtils.isPrimeNumber(number));
	}
	@ParameterizedTest(name = "{0} is not a prime number") // {0} sera remplacé par le 1e argument
	@ValueSource(ints = {4,6,8,9,14 }) // Le test sera lancé 6 fois
	void nbnot1st(int number) {
		assertFalse(MathUtils.isPrimeNumber(number));
	}
	
}
