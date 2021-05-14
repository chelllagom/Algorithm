package A5;

class TEST {
    public int solution(String s) {
        int answer = 0;
        String tempAnswer = "";
        String temp = "";
        char[] sArr = s.toCharArray();
        
        for(int i=0; i<s.length(); i++) {
        	if(Character.isAlphabetic(sArr[i])) {
        		temp += sArr[i];
        		switch (temp) {
	                case "zero": 
	                	tempAnswer += "0";
	                	temp = "";
	                	break;
	                case "one":
	                	tempAnswer += "1";
	                	temp = "";
	                	break;
	                case "two":
	                	tempAnswer += "2";
	                	temp = "";
	                	break;
	                case "three":
	                	tempAnswer += "3";
	                	temp = "";
	                	break;
	                case "four":
	                	tempAnswer += "4";
	                	temp = "";
	                	break;
	                case "five":
	                	tempAnswer += "5";
	                	temp = "";
	                	break;
	                case "six":
	                	tempAnswer += "6";
	                	temp = "";
	                	break;
	                case "seven":
	                	tempAnswer += "7";
	                	temp = "";
	                	break;
	                case "eight":
	                	tempAnswer += "8";
	                	temp = "";
	                	break;
	                case "nine":
	                	tempAnswer += "9";
	                	temp = "";
	                	break;
        		}
        	}else tempAnswer += sArr[i];
        }
        
        answer = Integer.parseInt(tempAnswer);
        return answer;
    }
}