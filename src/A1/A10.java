package A1;

import java.util.Scanner;

/*설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
*/
class A10 {
	
	int[] solution(String input, char x) {
		
		int[] answer = new int[input.length()];
		int point = 1000;
		//left
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == x) {
				point = 0;
				answer[i] = point;
			}else {
				point++;
				answer[i] = point;
			}
		}
		//right
		point = 1000;
		for(int i=input.length()-1; i>=0; i--) {
			if(input.charAt(i) == x) {
				point = 0;
			}else {
				point++;
				answer[i] = Math.min(answer[i], point);
			}
		}
		return answer;
	}
	
	public static void main(String[] args){

		A10 main = new A10();
		
		Scanner in = new Scanner(System.in);
		String input = in.next();
		char x = in.next().charAt(0);
		for(int i : main.solution(input, x)) {
			System.out.print(i + " ");
		}
		
	}
}