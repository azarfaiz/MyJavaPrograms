import java.util.Scanner;

public class ParanthesisCheck {
	
	static class Stack{
		int top = -1;
		char a[] = new char[100];
		void push(char n){
			if(top == 99){
				System.out.println("Stack overflow");
				return;
			}
			a[++top] = n;
		}
		char pop(){
			if(top == -1){
				System.out.println("No elements in the array");
				return 0;
			}
			return a[top--];
		}
		
		boolean isempty(){
			return top == -1 ? true : false;
		}
	}
	
	static boolean matchingPair(char a,char b){
		if(a=='(' && b==')')
			return true;
		if(a=='{' && b=='}')
			return true;
		if(a=='[' && b==']')
			return true;
		else
			return false;
		
	}
	
	static boolean areParanthesesBalanced(char exp[]){
		Stack st = new Stack();
		for(int i=0;i<exp.length;i++){
			if(exp[i] == '[' || exp[i] == '{' || exp[i] == '('){
				st.push(exp[i]);
			}
			if(exp[i] == ']' || exp[i] == '}' || exp[i] == ')'){
				if(st.isempty()){
					return false;
				}
				else if(!matchingPair(st.pop(),exp[i])){
					return false;
				}
			}
		}
		if(st.isempty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		char exp[];
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the balanced expression");
		String st = ip.nextLine();
		exp = st.toCharArray();
		if(areParanthesesBalanced(exp)){
			System.out.println("Balanced");
		}
		else
			System.out.println("Unbalanced");

	}

}
