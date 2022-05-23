package ch13;

import java.sql.Date;
import java.util.Calendar;

public class Cal {
	public static void main(String[] args) {
		//Calendar 인스턴스 생성은 new 불가능
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		//월은 +1 해줘야함 (0~11의 값을 가지고 있음)
		System.out.println(cal.get(Calendar.DATE));
		
		//시간은 12시간제, 24시간제 있음
		//1)12시간제 => hour
		System.out.println(cal.get(Calendar.HOUR));
		//2)24시간제 => hour_of_day
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));

		//오전,오후 => 오전은 0, 오후는 1
		System.out.println(cal.get(Calendar.AM_PM));
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}

		//1년 중 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//월의 몇 번째 되는날
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		//요일 (자바에서는 숫자 코드만 리턴 일요일 1 ~ 토요일 7 로 리턴)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil = "";
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: yoil = "일요일"; break;
		case 2: yoil = "월요일"; break;
		case 3: yoil = "화요일"; break;
		case 4: yoil = "수요일"; break;
		case 5: yoil = "목요일"; break;
		case 6: yoil = "금요일"; break;
		case 7: yoil = "토요일"; break;
		}
		System.out.println("오늘은 " + yoil+"입니다.");
		
		//1년 중 몇번째 주
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

		java.util.Date date = cal.getTime();
		System.out.println(date.getYear()+1900); //1900을 더함
		System.out.println(date.getMonth()+1);
		
	}
}
