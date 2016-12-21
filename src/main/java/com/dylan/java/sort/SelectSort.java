package com.dylan.java.sort;

public class SelectSort extends BaseSort{

	int[] stuff;
	
	public void sort(){
		
		stuff = generator(10);
		
		print(stuff);
		
		int[] result = new int[stuff.length];
		
		for(int i = 0;i<stuff.length;i++){
			int min = stuff[i]; 
			
			for(int j = i+1; j<stuff.length;j++){
				if(min > stuff[j]){
					int temp = min;
					min = stuff[j];
					stuff[j] = temp;
				}
			}
			result[i] = min;
		}
		
		print(result);
	}
	
	public static void main(String[] args) {
		SelectSort ss = new SelectSort();
		
		ss.sort();
	}
	

}
