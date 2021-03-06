package A6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 좌표 정렬 Comparable<> 사용 https://st-lab.tistory.com/243
설명 
N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.

입력
첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.

출력
N개의 좌표를 정렬하여 출력하세요.
*/

class Point implements Comparable<Point>{
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		//(자바는 오름차순이 디폴트이기 때문에) this-param이 
		//양수면 서로 교환(this가 더 크니까 뒤로 이동)
		//음수면 교환 안함(param이 더 크니까 놔둠)
		//내림차순으로 하고싶다면 param-this로 return
		if(this.x == o.x) return this.y-o.y;
		return this.x-o.x;
	}
}

class A07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		//초기화
		for(int i=0; i<n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			arr.add(new Point(x, y));
		}
		//정렬
		Collections.sort(arr);
		for(Point o : arr) System.out.println(o.x + " " + o.y);
    }
}