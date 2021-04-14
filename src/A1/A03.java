package A1;

import java.util.Scanner;

/*설명
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
문장속의 각 단어는 공백으로 구분됩니다.

입력
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
*/
class A03 {
	//indexOf(' ')를 사용할 수도 있다. 괄호안의 내용으로 잘라 인덱스를 리턴하는데 찾지 못하면 -1을 리턴한다.
	//substring(시작값, 종료지점) ex (0, 5)는, 0부터 4개
	String solution(String input) {

		String answer = "";
		//공백으로 잘라서 배열만들기
		int charLength = 0;
		String[] inputArray = input.split(" ");
		//for문으로 하나씩 꺼내서 길이가 가장 큰 것을 answer에 넣어주기
		for(String i : inputArray) {
			if(i.length()>charLength) {
				charLength = i.length();
				answer = i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){

		A03 main = new A03();
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		System.out.println(main.solution(input));
	}
}