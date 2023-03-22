package day03;

import util.MyUtil;

public class Ex03_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		
		u.p(u.RED + "Day3 Operator" + u.END);
		
		// 1. 대입연산
		int num = 10;
		u.p("1. num = " + num);
		
		// 2. 대입연산2
		num += 10;
		u.p("2-1. num = " + num);
		num -=10;
		u.p("2-2. num = " + num);
		num += (num + num);
		u.p("2-3. num = " + num);
		
		// 3. 산술연산
		num = 5 + 5 * 2;
		u.p("3-1.  num = " + num);
		num = 5 * (5 + 2);
		u.p("3-2.  num = " + num);
		
		final int NUM_OF_GRP = 3;
		num = 35 % NUM_OF_GRP;
		u.p("3-3.  현재 데이터는 " + num + " 작업에서 처리합니다.");
		//NUM_OF_GRP = 10;
		
		//4. 산술연산 2
		float numf = 10 / 4F;
		u.p("4-1. numf = " + numf);
		double numd = 10 / 4F; // float보다 double의 공간이 크므로 가능
		u.p("4-2. numd = " + numd);
		
		// 5. 산율연산3
		//num = 10 / 0;  // 현재는 예외발생 후 종료, 추후 예외처리로 처리 가능
		
		
		
		
		
	}

}







