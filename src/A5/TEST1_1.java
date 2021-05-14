package A5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

class TEST1_1 {
	public ArrayList<Integer> solution(String code, String day, String[] data) {
		ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<data.length; i++) {
        	String[] tempArr = data[i].split(" code=");
        	if(code.equals(tempArr[1].substring(0, 6))) {
        		int key = Integer.parseInt(tempArr[1].substring(12));
        		int val = Integer.parseInt(tempArr[0].substring(6));
        		
        		map.put(key, val);
        	}
        }
        
        Arrays.sort(map.keySet().toArray());
        for(int i=0; i<map.size(); i++) {
        	answer.add(map.get(i));	
        }
        for(Entry<Integer, Integer> entry : map.entrySet()){

        	entry.getValue();

    	}


        return answer;
    }
}