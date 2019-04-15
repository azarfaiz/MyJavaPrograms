
import java.util.*;
public class Minesweeper {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r,c,ri,ci,count = 0,b;
		System.out.println("Enter row and column: ");
		r = sc.nextInt();
		c = sc.nextInt();
		char[][] m = new char[r][c];
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				m[i][j] = '-';
				//System.out.print(m[i][j]+" ");
			}
			//System.out.println();
		}
		b = (r*c)/5;
		for(int i = 0; i < b; i++)
		{
			ri = (int) ((Math.random()*r));
			ci = (int) ((Math.random()*c));
			//System.out.println(ri+" "+ci);
			m[ri][ci] = 'B';
		}
		count = countBomb(m, c, c);
		System.out.println("Total number of Bombs: "+count);
		m = solve(m,r,c);
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	public static char[][] solve(char[][] a,int r,int c)
	{
		char ct = '0';
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				ct = '0';
				if(a[i][j] != 'B')
				{
					if(j-1 >= 0 && a[i][j-1] == 'B')
						ct++;
					if(j+1 < c && a[i][j+1] == 'B')
						ct++;
					if(i-1 >= 0 && a[i-1][j] == 'B')
						ct++;
					if(i+1 < r && a[i+1][j] == 'B')
						ct++;
					if(i-1 >= 0 && j-1 >= 0 && a[i-1][j-1] == 'B')
						ct++;
					if(i+1 < r && j+1 < c && a[i+1][j+1] == 'B')
						ct++;
					if(i-1 >= 0 && j+1 < c && a[i-1][j+1] == 'B')
						ct++;
					if(i+1 < r && j-1 >= 0 && a[i+1][j-1] == 'B')
						ct++;
					
					a[i][j] = (char)ct;
				}
			}
		}
		return a;
	}
	public static int countBomb(char[][] a,int r,int c)
	{
		int ct = 0;
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				if(a[i][j] == 'B')
					ct++;
			}
		}
		return ct;
	}
}
