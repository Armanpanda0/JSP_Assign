package Partten;

public class HoloTriangle2 {
	
	public static void main(String args[]) {
		int n=5;
		for(int i=1;i<=n;i++) {
				
			for(int j=1;j<=i;j++) {
				if(j==1 ||i==n || i==j ) {
				System.out.print(i+" ");
				}
				else 
					
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
