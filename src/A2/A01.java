package A2;

import java.util.ArrayList;
import java.util.Scanner;

/*설명
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.*/

class A01 {
	
	ArrayList<Integer> solution(int x, int[] arr) {
		//for문을 x번까지 돌리는데 i는 1부터 돌리고 i-1<i 이면 int배열에 담는다.
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		
		for(int i=1; i<x; i++) {
			if(arr[i-1] < arr[i]) {
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		A01 main = new A01();
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
