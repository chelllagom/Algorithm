package A5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//공주 구하기 문제
class A06 {
	
	int solution(int n, int x) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) q.offer(i);
		while(!q.isEmpty()) {
			for(int i=1; i<x; i++) q.offer(q.poll());
			q.poll();
			if(q.size() == 1) answer = q.poll();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		A06 main = new A06();
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		
		System.out.println(main.solution(input1, input2));
    }
}