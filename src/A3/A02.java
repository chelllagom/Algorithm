package A3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*설명
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
각 집합의 원소는 1,000,000,000이하의 자연수입니다.

출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
*/

class A02 {
	
	ArrayList<Integer> solution(int x1, int[] arr1, int x2, int[] arr2) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int p1=0, p2=0;
		while(p1<x1 && p2<x2) {
			if(arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1++]);
				p2++;
			}else if(arr1[p1] < arr2[p2]) p1++;
			else p2++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		A02 main = new A02();
		Scanner in = new Scanner(System.in);
	    
		int input1 = in.nextInt();
		int[] arr1 = new int[input1];
		for(int i=0; i<input1; i++) {
	    	arr1[i] = in.nextInt();
	    }
		
		int input2 = in.nextInt();
	    int[] arr2 = new int[input2];
	    for(int i=0; i<input2; i++) {
	    	arr2[i] = in.nextInt();
	    }
	    
	    for(int i : main.solution(input1, arr1, input2, arr2)) {
	    	System.out.print(i + " ");
	    }
    }
}
