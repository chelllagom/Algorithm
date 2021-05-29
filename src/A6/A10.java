package A6;

import java.util.Arrays;
import java.util.Scanner;

/* 결정알고리즘(마구간 정하기)
설명
N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 
마구간간에 좌표가 중복되는 일은 없습니다.
현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 
각 마구간에는 한 마리의 말만 넣을 수 있고, 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.

입력
첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.

출력
첫 줄에 가장 가까운 두 말의 최대 거리를 출력하세요.
*/

class A10 {
	
	int count(int[] arr, int dist) {
		//ep는 좌표, 맨 왼쪽부터 시작해야 거리를 늘릴 수 있음
		int horseCnt = 1, ep = arr[0];
		for(int i=1; i<arr.length; i++) {
			//현재 배치할 마구간과 전 마구간 좌표의 거리가 
			//주어진 거리 dist보다 크거나 같아야지만 말을 배치할 수 있다.
			if(arr[i]-ep >= dist) {
				horseCnt++;
				ep = arr[i];
			}
		}
		return horseCnt;
	}
	
	int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1, rt = arr[n-1];
		while(lt <= rt) {
			//말들 사이의 거리
			int mid = (lt+rt)/2;
			//거리가 좁아 말이 더 많으면, 거리를 늘린다.
			if(count(arr, mid) >= c) {
				answer = mid;
				lt = mid+1;
			//거리가 길어서 말을 배치할 수 없으면, 거리를 줄인다.
			}else rt = mid-1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		A10 main = new A10();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int c = in.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = in.nextInt();
		
		System.out.println(main.solution(n, c, arr));
    }
}