package A1;

import java.util.ArrayList;
import java.util.Scanner;

/*설명
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
*/
class A04 {
	
	ArrayList<String> solution(int n, String[] strArr) {

		ArrayList<String> answer = new ArrayList<>();
		//하나씩 꺼내서 뒤집고 추가하기
		for(String i : strArr) {
			String temp = new StringBuilder(i).reverse().toString();
			answer.add(temp);
		}
		return answer;
	}
	
	public static void main(String[] args){

		A04 main = new A04();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] strArr = new String[n];
		//배열에 값을 담아서 넘겨준다
		for(int i=0; i<n; i++) {
			strArr[i] = in.next();
		}
		for(String i : main.solution(n, strArr)) {
			System.out.println(i);
		}
	}
}


