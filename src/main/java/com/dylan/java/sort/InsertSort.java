package com.dylan.java.sort;

public class InsertSort extends BaseSort {
	
	int[] stuff = null;
	
	public void sort(){
		
		stuff = generator(100);
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i =0 ;i<stuff.length;i++) {
			System.out.println(stuff[i]);
			sb.append(stuff[i]).append(",");
		}
		sb.append("]");
		
		System.out.println(sb.toString());
		
		for(int i = 0;i<stuff.length;i++){
			for(int j = i;j>0;j--){
				if(stuff[j-1]<stuff[j]){
					int temp = stuff[j];
					stuff[j] = stuff[j-1];
					stuff[j-1] = temp;
					
				}else{
					break;
				}
			}
			
		}	
		
		sb = new StringBuilder();
		sb.append("[");
		for (int i =0 ;i<stuff.length;i++) {
			sb.append(stuff[i]).append(",");
		}
		sb.append("]");
		
		System.out.println(sb.toString());
	}
	
	
	public static void main(String[] args) {
		InsertSort is = new InsertSort();
		is.sort();
	}
	
	
	

}
