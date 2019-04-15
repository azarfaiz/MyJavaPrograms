import java.util.Scanner;

public class DictionarySearch {
	static int row,column;
	public static void main(String[] args) {
		/*
		 * char a[][] = { {'a','z','o','l'}, {'n','x','h','o'}, {'v','y','i','v'},
		 * {'o','r','s','e'} };
		 */
		//String s[] = {"van","zoho","love","are","is"};
		char a[][] = {
				{'a','b','c','e'},
				{'s','h','b','s'},
				{'n','v','e','e'}
		};
		String s[] = {"abcb"};
		char ch[];
		for(int i=0;i<s.length;i++){
			ch = s[i].toCharArray();
			passString(ch,a);
		}

	}
	
	static void passString(char b[],char a[][]){
		boolean flag = false;
		row = 0;
		column = 0;
		for(int i=0;i<b.length;i++){
			flag = findOccurrence(b[i],a,i);
			if(!flag)
				break;
		}
		if(flag){
			System.out.println(b);
		}
	}
	
	static boolean findOccurrence(char c,char a[][],int k){
		
		if(k == 0){
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					if(a[i][j] == c){
						row = i;
						column = j;
						return true;
					}
				}
			}
		}
		
		else{
			if((column < a.length-1 && a[row][column+1] == c) || (row < a.length-1 && a[row+1][column] == c)){
				if(column < a.length-1 && a[row][column+1] == c){
					column = column+1;
				}
				else if(row < a.length-1 && a[row+1][column] == c){
					row = row+1;
				}
				return true;
			}
		}
		return false;
		
	}
}


//Balaji's way
/*public class DictionarySearch {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] st= new String[10];
		char[][] a=new char[4][4];
		a[0][0]='a';a[0][1]='z';a[0][2]='o';a[0][3]='l';
		a[1][0]='n';a[1][1]='x';a[1][2]='h';a[1][3]='o';
		a[2][0]='v';a[2][1]='y';a[2][2]='i';a[2][3]='v';
		a[3][0]='o';a[3][1]='r';a[3][2]='s';a[3][3]='e';
		int z=5;
		for(int i=0;i<z;i++)
		{
			st[i]=sc.nextLine();
		}
		for(int i=0;i<z;i++)
			solve(st[i],a);
		sc.close();
	}
	public static void solve(String s,char[][] a){
		char b[]=new char[100];
		int k;
		for(int i=0;i<s.length();i++)
		{
			b[i]=s.charAt(i);
			System.out.println("b["+i+"]"+b[i]);
		}
		k=find1(b,a);
		if(k>1)
			System.out.println(s);
	}
	public static int find1(char[] b,char[][] a){
		int k=-1,l=-1,i,j;
		int s=1;
		for(i=0;i<4;i++){
			for(j=0;j<4;j++)
			{
				if(a[i][j]==b[0]){
					k=i;l=j;
					//System.out.println("k and l "+k+" "+l);
				}
			}
		}
		if(k>=0){
			s=find2(b,a,k,l);
			//return s;
			}		
			return s;
	}
	public static int find2(char[] b,char[][] a,int k,int l){
		int s=1;
		for( int i = 1;i<b.length;i++){
			//System.out.println("k and l in find2 "+k+" "+l);
		if(k-1>=0&&a[k-1][l]==b[i]){
			s++;
		}
		if(k+1<=4&&a[k+1][l]==b[i]){
			s++;
		}
		if(l-1>=0&&a[k][l-1]==b[i])
			s++;
		if(l+1<=3&&a[k][l+1]==b[i])
			s++;
		}
		return s;
	}
}*/