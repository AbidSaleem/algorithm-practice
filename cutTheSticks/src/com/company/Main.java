package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

        cutTheSticks(new LinkedList<>() {{
            add(5);
            add(4);
            add(4);
            add(2);
            add(2);
            add(8);
        }});
        
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here

        List<Integer> result = new ArrayList<>();

        arr.sort(Integer::compareTo);

        while(arr.size() >= 1) {
            result.add(arr.size());

            int shortest = arr.get(0);

            for(int j = 0; j < arr.size(); j++) {
                arr.set(j, arr.get(j) - shortest);
            }

            arr = arr.stream().filter(x -> x > 0).collect(Collectors.toList());
        }

        return result;
    }
}
