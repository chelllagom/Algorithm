package A6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/* 좌표 정렬  Comparator<> 사용 https://st-lab.tistory.com/243
설명 
N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.

입력
첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.

출력
N개의 좌표를 정렬하여 출력하세요.
*/

class A07_1 {

	//익명객체 생성
	static Comparator<Point> comp = new Comparator<Point>() {
		@Override
		public int compare(Point o1, Point o2) {
			//return이 음수가 나오면 교환 안하고, 양수가 나오면 교환한다.
			if(o1.x == o2.x) return o1.y-o2.y;
			return o1.x-o2.x;
		}
	};
	
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
		//정렬-sort시 comp 익명객체를 통하여 정렬 기준 같이 넘겨줌
		Collections.sort(arr, comp);
		for(Point o : arr) System.out.println(o.x + " " + o.y);
    }
	
	
}