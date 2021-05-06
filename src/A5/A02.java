package A5;

import java.util.Scanner;
import java.util.Stack;

/*설명
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
남은 문자만 출력한다.
*/

class A02 {
	
	Stack<Character> solution(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
			}else stack.push(x);
		}
		
		return stack;
	}
	
	public static void main(String[] args) {
		
		A02 main = new A02();
		Scanner in = new Scanner(System.in);
	    
		String input1 = in.next();
	    
		for(char x : main.solution(input1)) System.out.print(x);
    }
}