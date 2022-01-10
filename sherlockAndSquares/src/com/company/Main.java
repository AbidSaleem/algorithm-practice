package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(squares(3, 9));

    }

    public static int squares(int a, int b) {
        // Write your code here

        int count = 0;
        int square = 1;
        int root = 1;

        while(square <= b) {

            if(square >= a) {
                count++;
            }

            square += root + (root + 1);

            root++;
        }

        return count;
    }
}
