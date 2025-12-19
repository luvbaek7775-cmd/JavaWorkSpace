package com.kh.variable;

public class A_Variable {
	
	// 시급과 근무시간과 근무일수를 곱해 월급을 계산해주는 메서드
	public void printVariable() {
		
		System.out.println("변수 사용 전");
		System.out.println("시급 : 8500");
		System.out.println("근무 시간 : 6");
		System.out.println("근무 일수 : 5");
		
		System.out.println("강진솔A : " + 8500 * 6 * 5);
		System.out.println("강진솔B : " + 8500 * 6 * 5);
		System.out.println("강진솔C : " + 8500 * 6 * 5);
		
		int pay = 11000; // 오른쪽에 있는 값을 왼쪽에 대입
		int time = 5;
		int day = 9;
		
		System.out.println("강진솔A : " + pay * time * day);
		System.out.println("강진솔B : " + pay * time * day);
		System.out.println("강진솔C : " + pay * time * day);
		// 변수를 사용하는 이유
		// 숫자보다 변수를 사용했을 때 가독성이 훨씬 좋음
		// 가독성 확보, 재사용성 증대, 유지보수성 증대...
	}
	
	public void declareVariable () {
		// 변수의 선언, 자료형 변수명;
		// int, long...
		// 자료형 : 어떤 값을 담아낼지 어떤 크기의 값을 담아낼지에 따라 다르게 지정하는 부분
		// 변수명: 변수의 이름을 지정하는 부분, 담겨있는 값을 최대한 잘 표현해야 한다.
		// 면수명 명명규칙 : 변수명은 영어 소문자로 시작하여 작성함, 낙타등 표기법을 사용함(camel case)
		// ex) String userfirstname -> UserFirstName
		// 주의 : 변수선언은 클래스 아래 영역, 메서드 아래에서만 사용 가능
		// 같은 영역 안에서 동일한 이름의 변수명 사용 불가
		// 해당 영역 안에서 선언한 변수는 해당 영역에서만 가능
		
		// 1.논리형 변수
		boolean isTrue;
		
		// 2-1. 숫자형 변수
		// 정수형
		byte bNum; // 1byte; 8bit -128 ~ 127 최대 가능수
		short sNum; // 2byte;
		int iNum; // 4byte; -> 정수 대표 자료형
		long lNum; // 8byte;
		
		// 2-2. 실수형
		float fNum; // 4byte 소수점 7자리까지
		double dNum; // 8byte 소수점 15자리까지, 대표자료형
		
		// 3. 문장형
		char ch; // 2byte 0부터 시작함
		// 기본자료형 끝
		
		// 4. 문자열(참고자료형)
		String str;
		
		// 변수에 값을 대입하는 행위 == 초기화
		// 변수를 반드시 초기화하고 사용해야 한다.
		isTrue = false;
		// True or false;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f; // 실수 리터럴 값을 float에 저장시 f를 같이 붙인다.
		dNum = 8.0;
		
		ch = 'A';
		str = "ABC";
		
	}
	
	public void initVariable() {
		// 변수 선언과 동시에 값을 대입
		boolean isTrue = false;
		
		int longInteger = 999_999_999;
		byte bNum = 1; // -128 ~ 127 
		System.out.println(bNum);
		byte iNum = 127;
		
		bNum = (byte)(iNum + 15);
		System.out.println(bNum);
	}
	
	public void constant() {
		int age = 25;
		age = 21;
		
		final int AGE = 21; // 고정값은 final
		// 상수값을 저장하고 있는 변수의 이름은 대문자로 작성한다.
	}

}