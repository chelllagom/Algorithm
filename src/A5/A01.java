package A5;

import java.util.Scanner;
import java.util.Stack;

/*설명
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

출력
첫 번째 줄에 YES, NO를 출력한다.
*/

class A01 {
	
	String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				//')' 가 남아있는 경우
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		//'('가 남아있는 경우
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		
		A01 main = new A01();
		Scanner in = new Scanner(System.in);
	    
		String input1 = in.next();
	    
	    System.out.println(main.solution(input1));
    }
}