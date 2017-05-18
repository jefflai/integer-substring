package com;

public class App {
    public static int integerSubstringBruteForce(int index, int length) {
        StringBuffer integerBuffer = new StringBuffer();
        int currentNumber = 1;
        while(integerBuffer.length() < index + length) {
            integerBuffer.append(currentNumber);
            currentNumber++;
        }
        return Integer.parseInt(integerBuffer.toString().substring(index, index + length));
    }
    
}
