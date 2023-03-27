package day06;

import util.MyUtil;

public class Ex08_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		
		// 1. while 
		u.p("1. while");
		
		int i = 0;
		while(i < 100){
			u.p("이번 i는 " + i + "입니다");
			i++;
	}
		
		 // Infinity Loop
		i = 0;
		while (true) {
			// i가 9999일 때 굵은 글자로 표현한다.
			if(i == 9999) {
				u.p(u.BOLD + "이번 i는 " + i + "입니다." + u.END);
			}
			else {
				u.p("이번 i는 " + i + "입니다.") ;
			}
			i++;
			if (i >= 10000) {
				break;
			}
		}
		
		// 2. for
		for(int j=0;j<100;j++) {
			u.p("이번 j는 " + j + "입니다.");
		}
		
		// u.p("마지막 j의 값은 " + j + "입니다.");
		// j는 for문 내에서 선언된 지역변수이나, for문 종료 시 소멸
		
		for(int k=0;k<10000;k++) {
			u.p("이번 k는 " + k + "입니다");
			k++;
		}
		
		int l = -100;
		
		for (l=0;l<10;l++) {
			u.p("[1]이번 l은 " + l + "입니다.");
		}
		
		u.p("[1]Final l은 " + l); // 1. 10(*)   2. -100  3. 11
		
		for(l=0;l<10;l++) {
			u.p("[2]이번 l은 " + l + "입니다.");
			l = 10000;
		}
		
		u.p("[2]Final l은 " + l); // 1. 10000     2. 10001   3. 0
		
		// 3. do ~ while
		int m = 100;
		
		do {
			u.p("매우 열심히 공부해야겠네");
			m++;
		} while(false);
	}

}










