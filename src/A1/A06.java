package A1;

import java.util.Scanner;

/*설명
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
*/
class A06 {
	
	String solution(String input) {

		String answer = "";
		
		for(int i=0; i<input.length(); i++) {
			//charAt(i)는 i번째 자리의 값을, indexOf(i)는 중복을 제거한 값을 리턴하는데
			//둘이 같다면 중복된 값이 없다는 뜻이니 answer에 추가해준다.
			if(input.indexOf(input.charAt(i)) == i) {
				answer += input.charAt(i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){

		A06 main = new A06();
		
		Scanner in = new Scanner(System.in);
		String input = in.next();
		
		System.out.println(main.solution(input));
	}
}