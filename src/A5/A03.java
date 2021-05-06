package A5;

import java.util.Scanner;
import java.util.Stack;

//크레인 인형뽑기(카카오) stack.peek(): 맨 위에 있는 요소 지우지 않고 리턴받음, pop()은 삭제하며 리턴

class A03 {
	
	int solution(int n, int[][] nArr, int m, int[] moves) {
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<m; i++) {
			for(int x=0; x<n; x++) {
				if(nArr[x][moves[i]-1] != 0) {
					if(!stack.isEmpty() && stack.peek() == nArr[x][moves[i]-1]) {
						stack.pop();
						answer += 2;
					}else {
						stack.push(nArr[x][moves[i]-1]);
					}
					nArr[x][moves[i]-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		A03 main = new A03();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] board=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j]=kb.nextInt();
			}
		}
		int m=kb.nextInt();
		int[] moves=new int[m];
		for(int i=0; i<m; i++) moves[i]=kb.nextInt();
	    
		System.out.println(main.solution(n, board, m, moves));
    }
}