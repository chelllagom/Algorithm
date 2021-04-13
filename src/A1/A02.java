package A1;

import java.util.Scanner;

/*설명
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
*/

class A02 {
	
	String solution(String input) {
		
		String answer = "";
		
		//String을 for문 돌리기 위해 char 배열로 만들어주고
		for(char i : input.toCharArray()) {
			//Character에 있는 메소드로 대소문자 판별
			if(Character.isLowerCase(i)) {
				answer += Character.toUpperCase(i);
			}else {
				answer += Character.toLowerCase(i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){

		A02 main = new A02();
		
		Scanner in = new Scanner(System.in);
		String input = in.next();
		
		System.out.println(main.solution(input));
	}
}