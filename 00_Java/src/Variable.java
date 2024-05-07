
public class Variable {

	public static void main(String[] args) {
		//1.정수 2.문자 3.문자열 4.실수 5.논리형(참 거짓)
		//1. 정수 byte short int long
		// byte = 1byte
		byte 바이트 = 1;
		System.out.println(바이트);
		System.out.println("바이트");
		//파일을 저장할 때 키보드에서 ctrl + s 를 눌러주면 저장됨
		byte bt = 2;
		System.out.println(bt);
		
		short 쇼트 = 3;
		System.out.println(쇼트);
		
		int 인트 = 1;
		System.out.println(인트);
		
		System.out.println("============");
		//byte 자료형 선언 선언이름 bte bte안에 숫자 2 넣고 출력하기
		//short = shrt shrt =
		//int = nt nt =
		//long = lng lng =
		byte bte = 2;
		System.out.println(bte);
		
		short shrt = 2;
		System.out.println(shrt);
		
		int nt = 2;
		System.out.println(nt);
		
		long lng = 2;
		System.out.println(lng);
		
		//2. 문자
		//문자에는 char와 String이 있음
		//문자를 나타내는 char은 '' 작은 따음표를 사용해서 표현
		//"" 큰 따음표는 String 문자열을 나타내는 표현
		char myChar = 'A';
		System.out.println(myChar);
		
		//char myChar2 = "A";
		//System.out.println(myChar2);
		//char 에는 하나의 문자만 담을 수 있기 때문에
		//A나 B 둘 중 하나만 작성 가능
		/*
		 * char myChar3 = 'AB';
		 * char myChar4 = 'ABC';
		 * char myChar5 = '가나다';
		 * 모두 문자가 하나가 아니기 때문에 출력할 수 없음
		 */
		//String
		String str1 = "와 드디어 문자다~~";
		System.out.println(str1);
		//String 을 사용해서 본인의 이름 출력하기
		//String name = "본인의 이름";
		//System.out.pringln(name);
		String name = "김재원";
		
		System.out.print("당신의 이름은");
		System.out.println(name);
		System.out.println("입니다.");
		
		//만약에 여러 글자나 내용을 한줄로 출력하고 싶다면
		//+ 를 사용해서 이어서 출력할 수 있음
		System.out.println("당신의 이름은" + name + "입니다.");
		
		//원하는 건 당신의 이름은 ㅇㅇㅇ 입니다.
		System.out.println("당신의 이름은" + name + "입니다.");
		System.out.println("당신의 이름은 " + name + " 입니다.");
		System.out.println("당 신 의 이 름 은 " + name + " 입 니 다.");
		//띄어쓰기를 넣고 싶을 경우 "" 큰 따음표 내부에 띄어쓰기를 넣어야 함
		
		//정수 + 문자 + 문자열 출력하기
		/*
		 안녕하세요. 저는요. 서울에 사는 ㅇㅇㅇ 입니다.
		 제 전화번호는 111-222-3333 입니다.
		 제 주민번호는 비밀입니다.
		 제 혈액형은 A형입니다.
		 */
		String greeting = "안녕하세요.";
		String introduction = "저는요. 서울에 사는 ooo 입니다.";
		String number = "111-2222-3333";
		String secret = "비밀";
		String bloodType = "A형";
		
		System.out.print(greeting);//안녕하세요.
		System.out.println(introduction);
		System.out.print("제 전화번호는 ");
		System.out.print(number);
		System.out.println(" 입니다.");
		System.out.println("제 주민번호는 " + secret + "입니다.");
		System.out.println("제 혈액형은 " + bloodType + "입니다.");
		
		//4.실수 5.논리형
		//실수는 float 과 double 이 있음
		//실수는 기본으로 double 형식으로 되어있음
		//float = 4byte double = 8byte
		//float에 실수를 담기 위해서는 f를 붙여줘야 함
		//실수 뒤에 f를 붙일 때 대 소문자 구분 없이 사용 가능
		float ff1 = 3.14f;
		float ff2 = 3.14F;
		System.out.println("ff1 은 : " + ff1 + " 이다.");
		System.out.println("ff2 는 : " + ff2 + " 이다.");
		//double은 크기가 float 보다 크고 애초에 double을 넣으려 했기때문에
		//뒤에 다른 수식을 붙이지 않아도 사용할 수 있음
		double dd1 = 3.14;
		System.out.println("double dd1 : " + dd1);
		
		//5.논리형
		//boolean을 사용해서 true인지 false인지 표현할 수 있음
		//나중에 알고리즘이나 if for while 문을 사용할 때 자주 사용
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("오늘 날씬는 " + isTrue);
		System.out.println("내일 날씨는 " + isFalse + " ?");
		
		//정수 문자 문자열 실수 논리형
		int num = 10;
		System.out.println("정수 num의 값 = " + num);
		
		char ch = 'Z';
		System.out.println("문자 ch 의 값 = " + ch);
	
		String text = "Hello, World!";
		System.out.println("문자열은 text = " + text);
		
		double dbl = 3.14;
		System.out.println(dbl);
		
		boolean isTrue2 = true;
		System.out.println("isTrue2 = " + isTrue2);
		
		
		System.out.println(" num = " + num);
		
		//num 에다가 10 대신 20을 넣고 싶다면?
		int 숫자 = 10;
		System.out.println("정수 숫자의 값 = " + 숫자);
		
		//지정값은 처음 1회만 사용한 후
		//변수명에 다른 숫자나 값을 넣을 때는
		//지정값을 생략한다
		숫자 = 20;
		System.out.println("20오로 변경한 숫자의 값 : " + 숫자);
		
		/*
		 철수는 19살이었다.
		 그런데 24년이 되면서 20살이 되었다.
		 */
		String name1 = "철수";
		String age = "19";
		System.out.println(name1 + "는 " + age + "살이었다.");
		age = "20";
		System.out.println("그런데 24년이 되면서 " + age + "살이 되었다.");
	}

}