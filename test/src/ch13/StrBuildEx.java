package ch13;
//출력결과
//append()메소드 활용 : 
public class StrBuildEx {
	public static void main(String[] args) {
		
	
	StringBuilder str1 = new StringBuilder("I am a");
	String str2 = "Java Programmer";
	
	//System.out.println(str1);
	str1.append(" Java Programmer"); 
	System.out.println("append()메소드를 활용 : " +str1);
	
	str1.replace(7, 11, "jsp");
	System.out.println("replace()메소드를 활용 : " + str1);

	str2 = str1.substring(7);
	System.out.println("substring()메소드를 활용 : " + str2);
	}
}
