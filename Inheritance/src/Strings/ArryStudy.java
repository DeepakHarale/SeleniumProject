package Strings;

public class ArryStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String arr[] = new String[15];
		
		arr[0]="Hello";
		arr[1]="Hii";
		arr[2]="Deepak";
		arr[3]="by";

//		
//		System.out.println(arr[0]);
//		System.out.println(arr[2]);
//		
		for(int i=0; i<=3; i++) {
			
//			System.out.println(arr[i]);
		}
		
		int a[] =new int[12];
		
		a[0] = 1;
		a[1]= 55;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4;
		a[5] = 5;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;
		a[10]=45;
		
		
//		System.out.println(a[0]);
		
		
		for(int i=0; i<= a.length-1; i++) {
			
			System.out.println(a[i]);
		}
		
		
		String city[] = {"pune", "nagpur","Mumbai"};
			
		
		for(int i=0; i<=city.length-1;i++) {
			System.out.println(city[i]);
		}
		            
		
		int arr1[][]= {{2,3},{4,6}};
		
//		  System.out.print(arr1[0][0]+ " ");
//		  System.out.print(arr1[0][1]+ " ");
//		  System.out.println();
//		  System.out.print(arr1[1][0]+ " ");
//		  System.out.print(arr1[1][1]+ " ");
//		  
//		  System.out.println();
		  
		  
		  for(int i=0;i<=arr1.length-1;i++) {
			  
			 for(int j=0; j<=arr1.length-1;j++) {
				System.out.print(arr1[i][j]+ " ");
			 }
			 System.out.println();
		  }
		  
		  
	
	}

}
