package ch12;

public class OuterEx {
	class InnerEx{
		private int num = 2;
		private String name = "사임당";
		private String mail = "saim@gamil.com";
		
		public void print() {
			System.out.println("-----------------------");
			System.out.println("고객번호 : " + num);
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + mail);
		}

		}
		void print2() {
			class in{
				String add = "서울시 강남구 역삼동";
			}
			in i = new in();
			System.out.println("주소 : " + i.add);
			System.out.println("-----------------------");
		}
	
	public static void main(String[] args) {
		OuterEx o = new OuterEx();
		OuterEx.InnerEx in = o.new InnerEx();
		in.print();
		o.print2();
	}
}
