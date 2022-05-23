package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		String str = new String("Hello 1234");
		char[] arr = new char[str.length()];
		
		for(int i =0; i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		System.out.println("---------------------------");
		for(int i =0; i<arr.length;i++)
			if(Character.isUpperCase(arr[i])) { 
				System.out.println(arr[i]+"는 대문자입니다.");
			} else if(Character.isLowerCase(arr[i])) {
				System.out.println(arr[i]+"는 소문자입니다.");
			} else if(Character.isDigit(arr[i])) {
				System.out.println(arr[i]+"는 숫자입니다.");
			}
		System.out.println("---------------------------");

		String result = str.substring(6);
		System.out.println("문자 " + result + "입니다.");
		System.out.println("숫자 " + Integer.parseInt(result)+"입니다.");
		System.out.println("숫자 1234 + 2 = " + (Integer.parseInt(result)+2)+"입니다.");

		System.out.println("---------------------------");

	
		
		
	
					

	}
}
