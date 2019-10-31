package Default;
import java.util.*;

public class 괄호의값_2504 {
	
	static boolean isOpen(char c) {
		if(c=='('||c=='[') return true;
		else return false;
	}
	
	static int Match(char a, char b) {
		if (a=='(') {
			if(b==')') return 1; //Match
			else return 2; 
		}
		else if (a=='[') {
			if(b==']') return 1; //Match
			else return 2; 
		}
		else return 3; 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>(); //a stack for parentheses
		Stack<Integer> numstack = new Stack<>(); //a stack for numbers
		
		String str = sc.next();
		sc.close();
		int index=0;
		int temp=0;
		while(index<str.length()) {
			char ch = str.charAt(index++);
			if(isOpen(ch)) stack.push(ch); 
			else { //ch가 닫는 괄호이면 pop
				if(stack.isEmpty()) {
					System.out.println(0); //incorrect string
					System.exit(0);
				}
				else {
					char c=stack.pop(); 
					switch(Match(c, ch)) { 
					case 1: 
						temp=1;
						break;
					case 2: //incorrect string
						System.out.println(0); 
						System.exit(0);
					case 3: //pop numbers
						temp=0;
						while(c=='*') { 
							temp+=numstack.pop();
							if (!stack.isEmpty() && stack.peek().equals('*')) c=stack.pop(); //또 숫자면 반복
							else break;
						}
						if (!stack.isEmpty()) c=stack.pop();
						else {
							System.out.println(0); 
							System.exit(0);
						}
						break;
					}
					if(Match(c, ch)==2) {
						System.out.println(0); 
						System.exit(0);
					}
					if(c=='(') temp*=2;
					else temp*=3;
					/* 계산해 숫자 다시 push */
					stack.push('*');
					numstack.push(temp);
				}
			}
		}
		int sum=0;
		while (!stack.isEmpty()) { //incorrect string
			char c = stack.pop();
			if(c!='*') {
				System.out.println(0); 
				System.exit(0);
			}
		}
		while(!numstack.isEmpty()) {
			sum+=numstack.pop();
		}
		System.out.println(sum);
	}
}
