
import java.util.Scanner;

public class BricksBlock {

	public static void main(String[] args) {
		//USING 1D ARRAY
		int a[];
		char comm[];
		a = new int[10];
		int position = -1;
		boolean flag = true;
		String command;
		System.out.println("Enter the command");
		Scanner ip = new Scanner(System.in);
		command = ip.nextLine();
		comm = command.toCharArray();
		for(int i=0;i<comm.length;i++){
			if(comm[i] == 'P'){
				position = 0;
				flag = true;
			}
			if(comm[i] == 'M'){
				if(position >= 0 && position <=9){
					position++;
				}
			}
			if(comm[i] == 'D' && flag){
				if(position >=0 && position <=9){
					a[position]++;
					flag = false;
				}
			}
				
		}
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			//System.out.printf("%x",a[i]);
		}
		
		
		//using 2D array
		/*int blocks[][];
		char comm[];
		int position = -1;
		boolean flag = true;
		blocks = new int[15][10];
		for(int i=0;i<15;i++){
			for(int j=0;j<10;j++){
				blocks[i][j] = 0;
			}
		}
		String command;
		System.out.println("Enter the command");
		Scanner ip = new Scanner(System.in);
		command = ip.nextLine();
		comm = command.toCharArray();
		
		for(int i=0;i<comm.length;i++){
			int j=0;
			if(comm[i] == 'P'){
				position = 0;
				flag = true;
			}
			if(comm[i] == 'M'){
				if(position >= 0 && position <=9){
					position++;
				}
			}
			if(comm[i] == 'D' && flag){
				if(position >=0 && position <=9){
					while(blocks[j][position] != 0){
						j++;
					}
					blocks[j][position] = 1;
					flag = false;
				}
			}
		}
		
		for(int i=0;i<10;i++){
			int sum = 0;
			for(int j=0;j<15;j++){
				sum+=blocks[j][i];
				//System.out.print(blocks[i][j]);
				//System.out.print("\t");
			}
			System.out.printf("%x",sum);
			//System.out.println();
		}*/
		
	}

}
