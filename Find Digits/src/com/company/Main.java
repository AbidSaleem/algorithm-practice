package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(findDigits(12));
    }

    public static int findDigits(int number) {
        // Write your code here

        String numberAsString = "" + number;
        int count = 0;

        for(char character : numberAsString.toCharArray()) {
            int digit = Integer.parseInt("" + character);

            if(digit != 0 && number % digit == 0) {
                count++;
            }
        }

        return count;
    }
}
