package chap02;

import java.util.Scanner;

public class DayOfYear {
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int year, int month, int day) {
		int days = day;
		
		for(int i=1; i<month; i++) {
			days += mdays[isLeap(year)][i-1];
		}
		return days;
	}
	
	static int leftDayOfYear(int year, int month, int day) {
		//이번 달의 남은 일수
		day = mdays[isLeap(year)][month-1]-day;
		//다음 달의 일수 합
		while(++month <= 12) {
			day += mdays[isLeap(year)][month-1];
		}
		return day;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("올해는 며칠이 남았나?");
		
		do {
			System.out.println("년 : "); int year = sc.nextInt();
			System.out.println("월 : "); int month = sc.nextInt();
			System.out.println("일 : "); int day = sc.nextInt();
			
			System.out.printf("이번년은 %d일 남았습니다.\n", leftDayOfYear(year, month, day));
			System.out.println("한번 더 할까요? 1.예 2.아니오");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
