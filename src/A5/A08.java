package A5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*설명
메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.
응급실은 환자가 도착한 순서대로 진료를 합니다. 
하지만 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 합니다.
이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의 진료순서를 정합니다.
• 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
• 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 
그렇지 않으면 진료를 받습니다.
즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.
현재 N명의 환자가 대기목록에 있습니다.
N명의 대기목록 순서의 환자 위험도가 주어지면, 
대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.
대기목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것입니다.

입력
첫 줄에 자연수 N(5<=N<=100)과 M(0<=M<N) 주어집니다.
두 번째 줄에 접수한 순서대로 환자의 위험도(50<=위험도<=100)가 주어집니다.
위험도는 값이 높을 수록 더 위험하다는 뜻입니다. 같은 값의 위험도가 존재할 수 있습니다.

출력
M번째 환자의 몇 번째로 진료받는지 출력하세요.
*/
class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

class A08 {
	
	public int solution(int num, int point, int[] arr) {
		int answer = 0;
		Queue<Person> q = new LinkedList<>();
		//초기화
		for(int i=0; i<num; i++) {
			q.offer(new Person(i, arr[i]));
		}
		//탐색
		while(!q.isEmpty()) {
			Person temp = q.poll();
			//우선순위 높은 사람 있나 확인
			for(Person p : q) {
				if(p.priority > temp.priority) {
					q.offer(temp);
					temp = null;
					break;
				}				
			}
			//본인이 가장 우선순위가 높으면
			if(temp != null) {
				answer++;
				if(temp.id==point) return answer;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		A08 main = new A08();
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int point = in.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) arr[i] = in.nextInt();
		System.out.println(main.solution(num, point, arr));
    }
}