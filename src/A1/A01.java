package A1;
import java.util.Scanner;

//설명
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.

//입력
//첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
//문자열은 영어 알파벳으로만 구성되어 있습니다.

//출력
//첫 줄에 해당 문자의 개수를 출력한다.
class A01 {
	public int solution(String chars, char firstChar) {
		
		int answer = 0;
		
		chars = chars.toUpperCase(); //전부 대문자로 바꾼다.
		firstChar = Character.toUpperCase(firstChar); //기본 문자형이라 static 메서드 사용하여 변경
		
		// : 뒤에는 배열이나 컬렉션이 와야함, 따라서 charArray를 배열로 바꾸어줌
		for(char i : chars.toCharArray()) { 
			if(i == firstChar) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		
		A01 main = new A01();
		
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		//next()가 string을 반환하기 때문에 .charAt(0)으로 첫번째 요소를 char로 리턴한다
		char input2 = in.next().charAt(0);
		
		System.out.print(main.solution(input1, input2));
	}
}
