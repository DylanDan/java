package com.dylan.java.sort;

import java.util.Random;

public class BaseSort {
	
	
	protected int[] generator(int scope){
		Random rd = new Random();
	    int[] stuff = new int[scope];
		for(int i=0;i<scope;i++){
			
			stuff[i] = rd.nextInt(scope);
		}
		return stuff;
		
	}
	
	protected void  print(int[] obj){
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		for (int i =0 ;i<obj.length;i++) {
			sb.append(obj[i]).append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		
		System.out.println(sb.toString());
		
		
	}
	

}
