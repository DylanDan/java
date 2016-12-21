package com.dylan.java.sort;

public class QuickSort extends BaseSort{
	
	int[] stuff = null;
	
	public void sort(){
		
		stuff = new int[]{6,5,2,1,7,3,0,9,8,4};//generator(10);
		print(stuff);
		_sort(stuff, 0, stuff.length);
		print(stuff);
		
	}
	
	
	private void _sort(int[] a ,int low ,int high){
		if(low < high){
			int middle = getMiddle(a,low,high);
			_sort(stuff, 0, middle);
			_sort(stuff, middle+1, high);
		}
		
	}


	private int getMiddle(int[] a, int low, int high) {
		
		int middleValue = a[low];
		int nextMiddle = low;
//		int temp = 0; 
		for(int i = low+1;i < high;i++){
			if(a[i] < middleValue){
				if(i-nextMiddle>1){
					int inner_temp = a[i];
					for(int j = i;j>nextMiddle;j-- ){
						a[j] = a[j-1];
						
					}
					a[nextMiddle] = inner_temp;
				}
				if(i-nextMiddle==1){
					
					a[nextMiddle] = a[i];
					
					a[i] = middleValue;
				}
				
				nextMiddle++;
			}
			
			print(a);
			System.out.println(nextMiddle+"-"+i);
			
		}
		
		return nextMiddle;
		
	}
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		qs.sort();
	}

}
