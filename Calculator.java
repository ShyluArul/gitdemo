package com.testExamples;

public class Calculator {

	public int add(int a, int b){
		return a+b;
	}

	public int divide(int i, int j) {
		// TODO Auto-generated method stub
		if(j==0)
			throw new ArithmeticException();
		return i/j;
	}
}
