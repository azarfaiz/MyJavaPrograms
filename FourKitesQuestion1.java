
public class FourKitesQuestion1 {

	public static void main(String[] args) {
		
		char[][] input = {
				{'*','.','*','*'},
				{'*','*','.','*'},
				{'*','.','.','*'},
				{'*','*','*','.'},
				{'*','*','.','*'}
		};
		
		int rowCount = input.length;
		int colCount = input[0].length;
		int waterUnit = 0;
		
		//System.out.println(rowCount);
		//System.out.println(colCount);
		
		for(int i=1;i<rowCount-1;i++) {
			for(int j=1;j<colCount-1;j++) {
				if(input[i][j] == '.') {
					input[i][j] = 'W';
					waterUnit++;
				}
			}
		}
		
		System.out.println("Water units filled : "+waterUnit);

	}

}
