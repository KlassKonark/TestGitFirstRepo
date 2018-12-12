package Missing_Array_Element;

import java.util.Arrays;

public class Elements {
	
	static int[] arr =  {1,3,6,2,8,5,7,0,9};
	
	public void  Find_The_Missing(int a[]){
		
		
		for(int i=0;i<a.length-1;i++){
			
			Arrays.sort(a);
			
			if(a[i+1]-a[i]!=1){
				
				
				System.out.println("The Missing element is");
				
				System.out.println(a[i+1]-1);
			}
			
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Elements aob = new Elements();
		
		aob.Find_The_Missing(arr);
		

	}

}
