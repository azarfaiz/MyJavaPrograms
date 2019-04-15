import java.util.Scanner;

public class NewTest {
	public static void main(String args[]){
		/*char s[][] = {{'a','b','c','d','e','f','g'},{'h','i','j','k','l','m','n'},{'o','p','q','r','s','t','u'},{'v','w','x','y','z'}};
		String st = "azarsaaasdaaaaaa";*/
		/*System.out.println("Enter the input value");
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		char s[][] = new char[n][n];
		s[n/2][n/2] = '*';
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0 || (i+1)%n==0){
					s[i][j] = '*';
				}
				if(j==0 || (j+1)%n==0){
					s[i][j] = '*';
				}
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(s[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}*/
		
		
		//Balaji's way
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char a[][] = new char[n][n];
		for(int i = 0 ; i < n;i++){
			a[0][i]='*';
			a[i][0]='*';
			a[i][n-1] = '*';
			a[n-1][i] = '*';
		}
		a[n/2-1][n/2-1]='*';
		for(int i = 0 ;i < n ; i++)
		{
			for(int j = 0; j < n;j++)
			{
				/*
				if(a[i][j]!= '*')
					System.out.print(' '+" ");
				else
					System.out.print(a[i][j]+" ");*/
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		}
	}
