package A5;

import java.util.Stack;
class TEST2 {
    public String solution(int n, int k, String[] cmd) {
        int cnt = 0;
	    Stack<Integer> pointer = new Stack<>();
	    char[] arr = new char[n];
	    for(int i=0; i<arr.length; i++) arr[i] = 'O';
	    
	    for(int i=0; i<cmd.length; i++) {
	    	int x;
	    	switch (cmd[i].charAt(0)) {
	            case 'D':
	            	x = Integer.parseInt(String.valueOf(cmd[i].charAt(2)));
	            	k += x;
	            	break;
	            case 'U':
	            	x = Integer.parseInt(String.valueOf(cmd[i].charAt(2)));
	            	k -= x;
	            	break;
	            case 'C':
	            	arr[k] = 'X';
	            	cnt++;
	            	pointer.push(k);
	            	if(k+1 <= n-cnt) k++;
	            	else k--;
	            	break;
	            case 'Z':
	            	arr[pointer.pop()] = 'O';
                    cnt--;
	            	break;
	            default:
	            	break;
	    	}
	    }
	    String answer = new String(arr);
	    return answer;
    }
}