import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		/*int n = 5;
		for(int i=1;i<=n;i=i+2){
			for(int j=0;j<(n-i)/2;j++){
				//System.out.println("i and j "+i+j);
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++){
					//System.out.println("j "+j);
					System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		//Pascal's triangle
		
		int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();
		
		for(i=0;i<r;i++)
		{
			for(k=r; k>i; k--)
			{
				System.out.print(" ");
			}
            number = 1;
			for(j=0;j<=i;j++)
			{	
				System.out.print(number+ " ");
			//	System.out.print("*"+" ");
                 number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
		
		//second largest in the array
		/*Scanner sc = new Scanner(System.in);
		  int mi,d,ma;
		  int[] a = {2,5,3,10,9,8};
		  int n = a.length;
		  mi = ma = Integer.MIN_VALUE;
		  for(int i = 0; i < n; i++)
		  {
		   if(a[i] > ma)
		   {
		    mi = ma;
		    ma = a[i];
		    System.out.println("i, a[i], mi, ma "+i+" "+a[i]+" "+mi+" "+ma);
		   }
		   else if(a[i] > mi && a[i] != ma)
		   {
		    mi = a[i];
		    System.out.println("else i, a[i], mi, ma "+i+" "+a[i]+" "+mi+" "+ma);
		   }
		  }
		  //System.out.println(mi+"  "+ma);
		  if(ma != mi)
		   System.out.println(mi);
		  else
		   System.out.println("No second largest");*/

	}

}
