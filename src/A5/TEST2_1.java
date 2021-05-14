package A5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class TEST2_1 {
	public ArrayList<Integer> solution(int[] t, int[] r) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> tmap = new HashMap<>();
        HashMap<Integer, Integer> rmap = new HashMap<>();
        
        //시간이 적으면 적은 순으로 들어감
        //시간이 같을 때 등급순으로 들어감
        //시간과 등급이 같을 때 아이디 순으로 들어감
        for(int i=0; i<t.length; i++) {
        	tmap.put(t[i], i);
        	rmap.put(r[i], i);
        }
        Arrays.sort(tmap.keySet().toArray());
        for (Integer key : tmap.keySet()) {
        	
            key + tmap.get(key);
        }
        return answer;
	}
}