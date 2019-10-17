package com;

public class App {
    public static String integerSubstringBruteForce(int index, int length) {
        StringBuilder integerStringBuilder = new StringBuilder();

        int currentNumber = 1;

        while(integerStringBuilder.length() < index + length + 1) {
            integerStringBuilder.append(currentNumber);
            currentNumber++;
        }

        return integerStringBuilder.toString().substring(index, index + length);
    }

    public static String integerSubstringPartialNumberString(int index, int length) {
        StringBuilder resultBuilder = new StringBuilder();
        int n = index + 1;

        while (resultBuilder.length() < length) {
            resultBuilder.append(findNthDigit(n));
            n++;
        }

        return resultBuilder.toString();
    }

    // https://www.programcreek.com/2014/09/leetcode-nth-digit-java/
    private static int findNthDigit(int m) {
        long n=m; // convert int to long
        long start=1,  len=1,  count=9;

        while(n>len*count){
            n=n-len*count;
            len++;
            count=count*10;
            start=start*10;
        }

        // identify the number
        start = start + (n-1)/len;

        // identify the digit
        return String.valueOf(start).charAt((int)((n-1)%len))-'0';
    }

    
}
