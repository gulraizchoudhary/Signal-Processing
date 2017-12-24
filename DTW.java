package Examples;

public class DTW {
	public static void printArray(double[][] arr){
		for(int i=1; i<arr[0].length; i++){
			System.out.println("");
			for(int j=1; j<arr.length; j++)
				System.out.println(j+","+i+" "+ arr[j][i]+",");
		}
	}
	public static double DTWDistance(double[] a, double[] b) {
		int n= a.length;
		int m = b.length;
		
		double cost =0;
		   double DTW[][] = new double[n][m]; 
		  // System.out.println(DTW[0].length);
		   for(int i = 0; i < m ; i++)
	            for(int j=0; j<n ; j++)
	                DTW[i][j]=9999;
	            
		   DTW[0][0]= 0;

		   for(int i = 1; i<m; i++){
		       for (int j = 1; j<n; j++){
		           cost = Math.abs(a[j-1]- b[i-1]);
		           DTW[j][i] =cost + Math.min(Math.min(DTW[j-1][i], DTW[j][i-1]),DTW[j-1][i-1]);
		           
		           //System.out.println(j+" "+i+ ", "+DTW[j][i]);
		           
		           
		       }
		   }
		   printArray(DTW);
		   return DTW[n-1][m-1];
		}
	public static void main(String[] args) {
		double[] a = {0,2,1,1,1,0};
		double[] b = {0,0,2,1.5,1,1};
		//DTWDistance(a,b);
		System.out.println(DTWDistance(a,b));
		
	}

}
