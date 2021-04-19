package A2;

import java.util.ArrayList;
import java.util.Scanner;

/*설명
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
각 자연수의 크기는 100,000를 넘지 않는다.

출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
*/

class A06 {
	
	public boolean isPrime(int revTemp) {
		
		//if(revTemp < 2) return false;
		if(revTemp == 1) return false;
		for(int i=2; i<revTemp; i++) {
			if(revTemp%i == 0) return false;
		}
		
		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int temp = arr[i];
			int revTemp = 0;
			while(temp > 0) {
				int x = temp%10; // 1의 자리수 추출
				revTemp = revTemp * 10 + x; // 추출한 수가 가장 앞으로 가게 됨
				temp = temp/10; // 1의 자리수 삭제
			}
			
			if(isPrime(revTemp)) {
				answer.add(revTemp);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		A06 main = new A06();
		
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int[] input2 = new int[input1];
		for(int i=0; i<input1; i++) {
			input2[i] = in.nextInt();
		}
		
		for(int i : main.solution(input1, input2)) {
			System.out.print(i + " ");
		}
	}
}
