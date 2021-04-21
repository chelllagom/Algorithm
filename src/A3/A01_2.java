package A3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*설명
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

출력
오름차순으로 정렬된 배열을 출력합니다.
*/

class A01_2 {
	
	//Two Pointers Algorithm을 사용하여 문제를 푸는 방법
	ArrayList<Integer> solution(int x1, int[] arr1, int x2, int[] arr2) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		while(p1<x1 && p2<x2) {
			if(arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
			else answer.add(arr2[p2++]);
		}
		
		while(p1<x1) answer.add(arr1[p1++]); //p1 포인터가 아직 안끝났으면
		while(p2<x2) answer.add(arr2[p2++]); //p2 포인터가 아직 안끝났으면
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		A01_2 main = new A01_2();
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
