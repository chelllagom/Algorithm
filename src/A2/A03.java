package A2;

import java.util.ArrayList;
import java.util.Scanner;

/*설명
A, B 두 사람이 가위바위보 게임을 합니다. 
총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
*/

class A03 {
	
	ArrayList<Character> solution(int x, int[] aArr, int[] bArr) {
		
		ArrayList<Character> answer = new ArrayList<>();
		
		for(int i=0; i<x; i++) {
			if(aArr[i] == bArr[i]) answer.add('D');
			else if(aArr[i] == 1 && bArr[i] == 3) answer.add('A'); //가위 승
			else if(aArr[i] == 2 && bArr[i] == 1) answer.add('A'); //바위 승
			else if(aArr[i] == 3 && bArr[i] == 2) answer.add('A'); //보 승
			else answer.add('B');
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		A03 main = new A03();
		Scanner in = new Scanner(System.in);
	    
		int input1 = in.nextInt();
	    int[] input2 = new int[input1];
	    int[] input3 = new int[input1];
	    
	    for(int i=0; i<input1; i++) {
	    	input2[i] = in.nextInt();
	    }
	    for(int i=0; i<input1; i++) {
	    	input3[i] = in.nextInt();
	    }
	    
	    for(char i : main.solution(input1, input2, input3)) {
	    	System.out.println(i);
	    }
	    
    }
}
