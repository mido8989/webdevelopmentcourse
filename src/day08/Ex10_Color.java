package day08;

import util.MyUtil;

public class Ex10_Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p("Color Test");
		u.p(u.MAGENTA + "Font Style " + u.END);
		u.p(u.BOLD + "BOLD" + u.END);
		u.p(u.INTENITY + "INTENITY" + u.END);
		u.p(u.ITALIC + "ITALIC" + u.END);
		u.p(u.UNDERLINE + "UNDERLINE" + u.END);
		u.p(u.NEGATIVE + "NEGATIVE" + u.END);
		u.p(u.CROSSEDOUT + "CROSSEDOUT" + u.END);
		u.p(u.DOUBLEUNDERLINE + "DOUBLEUNDERLINE" + u.END);
		
		// AA라는 글자를 8색으로 나타내시오.
		// for문으로 구현할 것 + System.out.println(x) ==> System.out.print()
		//  "\033[색상코드m" + 문장 + "\033[0m"
		for(int i=30;i<38;i++) {
			System.out.print("\033[" + i + "m" + "AA" + u.END);
		}
		u.p("");
		for(int i=90;i<98;i++) {
			System.out.print("\033[" + i + "m" + "AA" + u.END);
	}
		u.p("");
		// 바탕색을 "   " 로 표현하시오. 일반바탕색 1줄, 밝은바탕색 1줄
		for(int i=40;i<48;i++) {
			System.out.print("\033[" + i + "m" + "    " + u.END);
		}
		u.p("");
		for(int i=100;i<108;i++) {
			System.out.print("\033[" + i + "m" + "    " + u.END);
		}
		u.p("");
		
		
		u.p("Extended 256 Color");
		for(int i=0;i<256;i++) {
			System.out.print("\033[38;5;" + i + "m" + "A" + u.END);
		}

	}
	}
	






