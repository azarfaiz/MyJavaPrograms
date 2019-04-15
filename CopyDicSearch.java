public class CopyDicSearch {
	static int row,column;
	public static void main(String[] args) {
		char a[][] = {{'a','z','k','l'},{'n','x','z','o'},{'v','y','i','v'},{'o','r','s','e'}};
		String s[] = {"zove","love","are","is"};
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
			if(!flag){
				if(row < 3 && column < 3){
					if(column == 3){
						row++;
						column = 0;
					}
					else{
						column++;
					}
					i = -1;
					continue;
				}
				else{
					break;
				}
			}
		}
		if(flag){
			System.out.println(b);
		}
	}
	
	static boolean findOccurrence(char c,char a[][],int k){
		
		if(k == 0){
			for(int i=row;i<a.length;i++){
				for(int j=column;j<a.length;j++){
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