package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly() {
		int a;
		int b;
		int expected;
		boolean expectException;
		if(!expectException) {
			assertThat(TestDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}
		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);
		assertThat(testDemo.addPositive(6,7)).isEqualTo(13);
	}

	public static Stream<Object> argumentsForAddPositive() {
		return Stream.of();
	}

	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);	
		assertThat(testDemo.addPositive(400,500)).isEqualTo(900);
	}
	
	
	@Test
	void assertThatNumberIsEven() {
		int a;
		int expected;
		boolean expectException;
		if(!expectException) {
			assertThat(TestDemo.isEven(a)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.isEven(a)).isInstanceOf(IllegalArgumentException.class);
		}
		assertThat(TestDemo.isEven(4)).isEqualTo(true);
		assertThat(TestDemo.isEven(9)).isEqualTo(false);
	}
	
	@Test
	void assertThatNumberSquaredIsCorrect() {
		TestDemo mockDemo = spy(testDemo);
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);

	}
	
}
