package com.kk.mergearray;

import java.util.Arrays;

public class Mergearray {

	public static void main(String[] args) {
		int firstArry[] = { 2, 8, -1, -1, -1, 13, -1, 15, 20 };

        int lastArry[] = { 5, 7, 9, 25 };
        
        int first=firstArry.length;
        int last =lastArry.length;
        
        System.out.println(first);
        System.out.println(last);
        
        int[] newArry=new int[first+last];
        
        for (int i = 0; i < newArry.length; i++) {
			if(i<first) {
				newArry[i]=firstArry[i];
			}else if(i>last) {
				newArry[i]=lastArry[i];
			}
		}
        System.out.println(Arrays.toString(newArry));
        		
	}
}
