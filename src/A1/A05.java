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
class A05 {
	
	String solution(String input) {

		String answer = "";
		//char배열로 변경한 뒤 왼쪽 오른쪽 포인터를 만들고 알파벳일 경우에만 변경한다
		//특수문자일경우 자리를 이동한다
		char[] charArr = input.toCharArray();
		int lt = 0, rt = input.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(charArr[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(charArr[rt])) {
				rt--;
			}else {
				char temp = charArr[lt];
				charArr[lt] = charArr[rt];
				charArr[rt] = temp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(charArr);
		return answer;
	}
	
	public static void main(String[] args){

		A05 main = new A05();
		
		Scanner in = new Scanner(System.in);
		String input = in.next();
		
		System.out.println(main.solution(input));
	}
}


