package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static long repeatedString(String s, long n) {
        // Write your code here

        long mod = n % s.length();
        long fullCount = 0;
        long modCount = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'a') {
                fullCount++;

                if(i < mod) {
                    modCount++;
                }
            }

        }

        return fullCount * (n / s.length()) + modCount;
    }
}
