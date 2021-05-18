package A6;

import java.util.Scanner;

/*캐시메모리
입력
첫 번째 줄에 캐시의 크기인 S(3<=S<=10)와 작업의 개수 N(5<=N<=1,000)이 입력된다.
두 번째 줄에 N개의 작업번호가 처리순으로 주어진다. 작업번호는 1 ~100 이다.

출력
마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례로 출력합니다.
*/

class A04 {
	
	int[] solution(int len, int n, int[] arr) {
		int[] cache = new int[len];
		for(int x : arr) {
			int idx = -1;
			//캐시에 있는지 없는지 확인
			for(int i=0; i<len; i++) if(x == cache[i]) idx = i;
			//없으면 끝까지 밀기
			if(idx == -1) {
				for(int i=len-1; i>=1; i--) cache[i] = cache[i-1];
			//있으면 있는곳까지만 밀기
			}else {
				for(int i=idx; i>=1; i--) cache[i] = cache[i-1];
			}//맨 앞에 삽입
			cache[0] = x;
		}
		return cache;
	}
	
	public static void main(String[] args) {
		
		A04 main = new A04();
		Scanner in = new Scanner(System.in);
		
		int len = in.nextInt();
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = in.nextInt();
		for(int i : main.solution(len, n, arr)) System.out.print(i + " ");
    }
}