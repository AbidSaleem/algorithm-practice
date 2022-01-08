package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(appendAndDelete("ashley", "ash", 2));

    }

    public static String appendAndDelete(String initialString, String targetString, int operations) {
        // Write your code here

        if(operations >= initialString.length() + targetString.length()) {
            return "Yes";
        }

        int length = Math.min(initialString.length(), targetString.length());
        int requiredOperations = 0;

        int i;

        for(i = 0; i < length; i++) {
            if(initialString.charAt(i) != targetString.charAt(i)) {
                break;
            }
        }

        requiredOperations = initialString.substring(i).length() + targetString.substring(i).length();

        if(i == 0) {
            return requiredOperations <= operations ? "Yes" : "No";
        }
        else {
            return requiredOperations <= operations && (operations - requiredOperations) % 2 == 0 ? "Yes" : "No";
        }
    }

}
