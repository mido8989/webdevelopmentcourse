package day05;

import java.util.Random;

import util.MyUtil;

public class Ex07_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p("Switch Exmaple");
		
		Random r = new Random();
		int i = r.nextInt(3); // i는 0, 1, 2 중 하나
		u.p("현재 결정된 i의 값은 " + i);
		
		switch (i) {
			case 0:
				u.p("0이었군");
				break;
			case 1:
				u.p("1이었네");
				break;
			case 2:
				u.p("This is Two");
				u.p("축 당첨!!!! 만수르 재산 정도의 상품 증정");
				break;
			default:
				u.p("삐이이익!!! 버그 발생");
		}
	}

}
