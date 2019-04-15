
public class UniqueRows {

	public static void main(String[] args) {
		/*int a[][] = {{1,0,1},{0,1,1},{1,0,1}};
		int b[] = new int[3];
		int n = 0;
		int temp = 0;
		for(int i=0;i<3;i++){
			temp = 0;n=0;
			for(int j=0;j<3;j++){
				temp = n + a[i][j];
				n = temp * 10;
			}
			b[i] = temp;
		}
		
		for(int i=0;i<3;i++){
			System.out.println(b[i]);
		}
		
		for(int i=0;i<3;i++){
			int index = uniqueIndex(b,i);
			if(index == 0){
				for(int j=0;j<3;j++){
					System.out.print(a[i][j]);
					System.out.print("\t");
				}
				System.out.println();
			}
		}

	}
	
	static int uniqueIndex(int array[],int index){
		int count = 0;
		for(int i=0;i<index;i++){
			if(array[i] == array[index]){
				count++;
			}
		}
		return count;*/
		
		//Finding the unique number without sorting(other number will be present exactly twice)
		int a[] = {2,3,4,8,4,3,2};
		int d = 0;
		for(int i=0;i<a.length;i++){
			d = d ^ a[i];
			System.out.println("d and i----->"+d+" "+i);
		}
	}

}
