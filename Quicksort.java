
public class Quicksort {

	public static void main(String[] args) {
		int array[] = {5,1,8,4,3,9,7,6};
		Quick(array,0,7);
		for(int p=0;p<=7;p++){
			System.out.print(array[p]+" ");
		}
	

	}
	
	private static int partition(int A[],int st,int en){
		int pivot = A[en];
		int pindex = st;
		//System.out.println("pindex------>"+pindex);
		for(int i=st;i<en;i++){
			if(A[i]<=pivot){
				int temp = A[pindex];
				A[pindex] = A[i];
				A[i] = temp;
				pindex++;
			}
		}
		int temp = A[pindex];
		A[pindex] = pivot;
		A[en] = temp;
		return pindex;
	}
	
	private static void Quick(int A[],int start,int end){
		if(start<end){
		int pindex = partition(A,start,end);
		//System.out.println(pindex);
		Quick(A,start,pindex-1);
		//System.out.println("pindex-------->"+pindex);
		Quick(A,pindex+1,end);
		}
		/*for(int p=0;p<A.length;p++){
			System.out.print(A[p]+" ");
		}*/
		
	}

}
