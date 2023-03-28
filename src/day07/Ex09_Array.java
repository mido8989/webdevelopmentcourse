package day07;

import util.MyUtil;

public class Ex09_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p(u.RED + "Array Test" + u.END);
		
		String[] str; 
		str = new String[5];
		u.p("str의 현재 길이는 : "+ str.length);
		
		// String[] str2 = new String[];
		
		String[] student_name = new String[5];
		String[] student_name2 = {"A", "B", "C", "Abrahan", "E"};
		
		int[] score_math = new int[5];
		int[] score_java = {10, 20, 10, 30, 20,};
		
		// 모든 학생들의 java 이름과 자바점수를 출력하시오.
		u.p("Heavy Labor");
		u.p("Student[ " + student_name2[0] + "] : " + score_java[0] + "점");
		u.p("Student[ " + student_name2[1] + "] : " + score_java[1] + "점");
		u.p("Student[ " + student_name2[2] + "] : " + score_java[2] + "점");
		u.p("Student[ " + student_name2[3] + "] : " + score_java[3] + "점");
		u.p("Student[ " + student_name2[4] + "] : " + score_java[4] + "점");
		
		
		u.p("");
		u.p("Automation");
		for(int i=0;i<student_name2.length;i++) {
			u.p("Student[ " + student_name2[i] + "] : " + score_java[i] + "점");
		}


		

	}

}
