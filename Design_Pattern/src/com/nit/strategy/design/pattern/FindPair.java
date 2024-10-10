package com.nit.strategy.design.pattern;

import java.util.HashMap;
import java.util.Stack;

public class FindPair {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {7,7,7};
		int[] arr3 = {1,2,2,3};
		
		System.out.println(isElement1(arr1));
		System.out.println(isElement1(arr2));
		System.out.println(isElement1(arr3));
		
		System.out.println(isElement2(arr1));
		System.out.println(isElement2(arr2));
		System.out.println(isElement2(arr3));
		
		System.out.println(isElement3(arr1));
		System.out.println(isElement3(arr2));
		System.out.println(isElement3(arr3));
	}
	
	public static boolean isElement1(int[] arr) {
		HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (int count : countMap.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true; 
	}
	
	public static boolean isElement2(int[] arr) {
		Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num); 
            } else {
                stack.pop(); 
            }
        }

        return stack.isEmpty();
	}
	
	public static boolean isElement3(int[] arr) {
		int[] frequency = new int[101];

        for (int num : arr) {
            frequency[num]++;
        }

        for (int count : frequency) {
            if (count % 2 != 0) {
                return false; 
            }
        }

        return true; 
	}

}
