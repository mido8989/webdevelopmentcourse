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
		
	}

}










