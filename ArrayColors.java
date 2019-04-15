import java.util.Scanner;

public class ArrayColors {

	public static void main(String[] args) {
		//char b[][] = {{'B','G','R','_'},{'R','B','G','G'},{'R','G','Y','B'},{'R','B','B','Y'}};
		char b[][] = {{'B','Y','G','R'},{'R','K','Y','Y'},{'B','R','Y','R'},{'K','Y','R','B'}};
		int r=4,c=4;
		//vertical check
		/*for(int i=0;i<c;i++){
			int k=0;
			while(k < (r-2)){
				if(b[k][i] == b[k+1][i] && b[k][i] == b[k+2][i]){
					b[k][i] = '_';
					b[k+1][i] = '_';
					b[k+2][i] = '_';
					int j = k;
					if(k != 0){
						while(j!=0){
							b[j+2][i] = b[j-1][i];
							b[j-1][i] = '_';
							j--;
						}
						b[j][i] = '_';
					}
				}
				k++;
			}
		}*/
		
		//horizontal check
		/*for(int i=0;i<r;i++){
			int k=0;
			while(k < (c-2)){
				if(b[i][k] == b[i][k+1] && b[i][k] == b[i][k+2]){
					b[i][k] = '_';
					b[i][k+1] = '_';
					b[i][k+2] = '_';
					int j = i;
					if(i != 0){
						while(j !=0){
							b[j][k] = b[j-1][k];
							b[j][k+1] = b[j-1][k+1];
							b[j][k+2] = b[j-1][k+2];
							j--;
						}
						b[j][k] = '_';
						b[j][k+1] = '_';
						b[j][k+2] = '_';
					}
				}
				k++;
			}
		}*/
		
		//diagonal check
		int row=0,column=0;
		while(column < (c-2)){
			while(row < (r-2)){
				int r1=row,r2=row+1,r3=row+2;
				if(b[r1][column] == b[r2][column+1] && b[r1][column] == b[r3][column+2]){
					b[r1][column] = '_';
					b[r2][column+1] = '_';
					b[r3][column+2] = '_';
					while(r1 != 0){
						b[r1][column] = b[r1-1][column];
						b[r1-1][column] = '_';
						r1--;
					}
					while(r2 != 0){
						b[r2][column+1] = b[r2-1][column+1];
						b[r2-1][column+1] = '_';
						r2--;
					}
					while(r3 !=0){
						b[r3][column+2] = b[r3-1][column+2];
						b[r3-1][column+2] = '_';
						r3--;
					}
				}
				row++;
			}
			column++;
		}
		
		row=0;column=c-1;
		while(column > (c-2)){
			while(row < (r-2)){
				int r1=row,r2=row+1,r3=row+2;
				if(b[r1][column] == b[r2][column-1] && b[r1][column] == b[r3][column-2]){
					b[r1][column] = '_';
					b[r2][column-1] = '_';
					b[r3][column-2] = '_';
					while(r1 != 0){
						b[r1][column] = b[r1-1][column];
						b[r1-1][column] = '_';
						r1--;
					}
					while(r2 != 0){
						b[r2][column-1] = b[r2-1][column-1];
						b[r2-1][column-1] = '_';
						r2--;
					}
					while(r3 !=0){
						b[r3][column-2] = b[r3-1][column-2];
						b[r3-1][column-2] = '_';
						r3--;
					}
				}
				row++;
			}
			column++;
		}
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		/*int row,column;
		char a[][];
		String s;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = ip.nextInt();
		System.out.println("Enter the number of columns");
		column = ip.nextInt();
		a = new char[row][column];
		int choice = 0;
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				a[i][j] = ' ';
			}
		}
		do{
			System.out.println("**********Enter any of the below option to start with***********");
			System.out.println("1.Continue");
			System.out.println("2.Exit");
			choice = ip.nextInt();
			switch (choice) {
			case 1:
				int count = 0;
				for(int i=0;i<row;i++){
					for(int j=0;j<column;j++){
						if(a[i][j] == ' '){
							count++;
						}
					}
				}*/
				
				/*if(count > 0){
					//Filling single character coulmn wise
					System.out.println("Enter the position(column)");
					int col = ip.nextInt();
					System.out.println("Enter the colour");
					char colour = ip.next().charAt(0);
					int k = row -1;
					while(k >=0 && a[k][col-1] != ' '){
						k--;
					}
					if(k>=0){
						a[k][col-1] = colour;
					}
					else{
						printMatrix(a, row, column);
						choice=2;
					}
					
					//Condition 3
					System.out.println("Enter the string");
					s = ip.next();
					System.out.println("Enter the position(column)");
					int col = ip.nextInt();
					int k = row -1;
					int z = 0;
					char seq[] = s.toCharArray();
					int index = seq.length;
					while(index != 0){
						while(k >=0 && a[k][col-1] != ' '){
							k--;
						}
						if(k>=0){
							for(int i=col-1;i<column;i++){
								if(index > 0 && a[k][i] == ' '){
									a[k][i] = seq[z];
									z++;
									index --;
								}
							}
							for(int i=0;i<col-1;i++){
								if(index > 0 && a[k][i] == ' '){
									a[k][i] = seq[z];
									z++;
									index--;
								}
							}
						}
					}
					printMatrix(a, row, column);
				}
				else{
					printMatrix(a, row, column);
					choice=2;
				}*/
				/*break;
			
			case 2:
				System.out.println("Thank you");
				printMatrix(a, row, column);
				break;
			default:
				break;
			}
		}while(choice==1);
	}
	
	static void printMatrix(char a[][], int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(a[i][j] == ' '){
					System.out.print("_");
				}
				else
					System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}*/
	}

}
