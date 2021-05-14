package A5;

import java.util.Scanner;
import java.util.Stack;

//쇠막대기 문제
class A05 {
	
	int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1) == '(') answer += stack.size();
				else answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		A05 main = new A05();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(main.solution(str));
    }
}