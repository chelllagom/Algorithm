package A3;

import java.util.Scanner;

/*설명
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
만약 N=8, M=6이고 수열이 다음과 같다면
1 2 1 3 1 1 1 2
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

입력
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
수열의 원소값은 1,000을 넘지 않는 자연수이다.

출력
첫째 줄에 경우의 수를 출력한다.
*/

class A04 {
	
	int solution(int len, int x, int[] arr) {
		int answer = 0, sum = 0, lt = 0;

		for(int rt=0; rt<len; rt++) {
			sum += arr[rt];
			if(sum == x) answer++;
			while(sum >= x) {
				sum -= arr[lt++];
				if(sum == x) answer++;
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		
		A04 main = new A04();
		Scanner in = new Scanner(System.in);
	    
		int input1 = in.nextInt();
		int input2 = in.nextInt();
	    int[] arr = new int[input1];
	    for(int i=0; i<input1; i++) {
	    	arr[i] = in.nextInt();
	    }
	    
	    System.out.println(main.solution(input1, input2, arr));
    }
}
