package com.test.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayExample {

	public static void main(String[] args) {
		int a[]={6,10,6,9,7,8};
		solution(a);
		

	}
	
	static int solution(int[] a) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i : a)
	        map.compute(i, (k, v) -> v == null ? 1 : v + 1);
	    int max = 0;
	    for (Entry<Integer, Integer> e : map.entrySet()) {
	        int t = e.getValue() + map.getOrDefault(e.getKey() + 1, 0);
	        if (t > max)
	            max = t;
	    }
	    System.out.println(Arrays.toString(a) + " -> " + max);
	    return max;
	}
	
	/*public static void longestForward(int[] arr)
	{
	    int subSeqLength = 1;
	    int longest = 1;
	    int indexStart = 0;
	    int indexEnd = 0;

	    for (int i = 0; i < arr.length - 1; i++)
	    {
	        if (arr[i] == arr[i + 1] - 1)//We need to check if the current is equal to the next
	        {
	            subSeqLength++;//if it is we increment
	            if (subSeqLength > longest)//we assign the longest and new bounds
	            {
	                longest = subSeqLength;
	                indexStart = i + 2 - subSeqLength;//make sure the index start is correct
	                indexEnd = i + 2;
	            }

	        } 
	        else
	            subSeqLength = 1;//else re-initiate the straight length
	    }


	    for (int i = indexStart; i < indexEnd; i++)//print the sequence
	        System.out.println(arr[i] + ", ");        
	}*/

}
