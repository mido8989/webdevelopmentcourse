package day04;

import java.util.Random;

import util.MyUtil;

public class Ex05_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		
		u.p(u.BOLD + "Random Exmaple" + u.END);
		
		Random rd = new Random();
		
		// Radnom Number 
		u.p("" + rd.nextInt());
		u.p("" + (rd.nextInt(100) + 1)); // 1부터 100까지
		u.p("" + rd.nextFloat());
		u.p("" + rd.nextDouble());
		
		// Random Alphabet
		// 임의의 영문 대문자 한글자가 나오도록 해보시오.
		char random_char = new 
		

	}

}
