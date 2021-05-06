package A4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*설명
현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 
같은 숫자의 카드가 여러장 있을 수 있습니다.
현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 
3장을 뽑을 수 있는 모든 경우를 기록합니다.
기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.

입력
첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.

출력
첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
*/

/*
 * TreeSet 메서드 정리
 * add(), remove(), size()
 * first(): 오름차순에선 최소값, 내림차순에선 최대값 반환, last(): 가장 마지막 값
 */

class A05 {
	
	int solution(int n, int x, int[] arr) {
		
		int answer = -1, cnt=0;
		//디폴트가 오름차순, Collections.reverseOrder()로 내림차순 만든다.
		TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					tSet.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
		for(int i : tSet) {
			cnt++;
			if(cnt == x) return i;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		A05 main = new A05();
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