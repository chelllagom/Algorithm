package A2;

import java.util.Scanner;

/*설명
선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. 
(앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.

출력
선생님이 볼 수 있는 최대학생수를 출력한다.
*/

class A02 {
	
	int solution(int x, int[] arr) {
		//for문 x번 돌리고 i<max이면 answer++
		int answer = 1, max = arr[0];
		for(int i=1; i<x; i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		A02 main = new A02();
		Scanner in = new Scanner(System.in);
	    
		int input1 = in.nextInt();
	    int[] input2 = new int[input1];
	    
	    for(int i=0; i<input1; i++) {
	    	input2[i] = in.nextInt();
	    }
	    
	    System.out.println(main.solution(input1, input2));
    }
}
