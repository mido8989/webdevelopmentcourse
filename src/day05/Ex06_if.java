package day05;

import util.MyUtil;

public class Ex06_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyUtil u = new MyUtil();
		u.p("If Example");
		int a = -1000;
		
		if (a > 100) {
			u.p(u.BOLD + "Sucah a Big Number!!" + u.END);
		}
		else if (a > 0) {
			u.p(u.RED + "It is a positive number" + u.END);
		}
		else if(a == 0) {
			u.p(u.GREEN + "It is Zero" + u.END);
		}
		
		else {
			u.p(u.RED + u.GREEN + u.BOLD + "MINUS" + u.END);
		}

	}

}
