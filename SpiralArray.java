import java.util.Scanner;

public class SpiralArray {

	private static Scanner ip;

	public static void main(String[] args) {
		int rowsCount,colsCount;
		ip = new Scanner(System.in);
		
		System.out.println("Enter the no of rows in the array");
		rowsCount = ip.nextInt();
		
		System.out.println("Enter the no of columns in the array");
		colsCount = ip.nextInt();
		
		int T=0,B=rowsCount-1,L=0,R=colsCount-1,dir=0;
		int array[][] = new int[rowsCount][colsCount];
		
		System.out.println("Enter the elements of the array one by one");
		for(int i=0;i<rowsCount;i++){
			for(int j=0;j<colsCount;j++){
				//array[i][j] = ip.nextInt();
				array[i][j] = ip.nextInt();
			}
		}
		
		System.out.print("The elements in spiral order will be : ");
		while(T<=B && L<=R){
			if(dir==0){
				for(int i=T;i<=R;i++){
					System.out.print(array[T][i]+" ");
				}
				T++;
				dir = (dir+1)%4;
			}
			
			else if(dir==1){
				for(int i=T;i<=B;i++){
					System.out.print(array[i][R]+" ");
				}
				R--;
				dir = (dir+1)%4;
			}
			
			else if(dir==2){
				for(int i=R;i>=L;i--){
					System.out.print(array[B][i]+" ");
				}
				B--;
				dir = (dir+1)%4;
			}
			
			else if(dir==3){
				for(int i=B;i>=T;i--){
					System.out.print(array[i][L]+" ");
				}
				L++;
				dir = (dir+1)%4;
			}
			
		}
		
		
		//Another approach
		/*int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int R =0,C = a.length -1;
		for(int i=0;i<(a.length / 2);i++){
			for(int j=R;j<=C;j++){
				System.out.print(a[R][j]+" ");
			}
			for(int j=R+1;j<=C;j++){
				System.out.print(a[j][C]+" ");
			}
			for(int j=C-1;j>=R;j--){
				System.out.print(a[C][j]+" ");
			}
			for(int j=C-1;j>R;j--){
				System.out.print(a[j][R]+" ");
			}
			R++;
			C--;
		}*/
		
	}

}
