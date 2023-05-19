package object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TestClass07 {
	//private : 정보 은닉
	Scanner sc = new Scanner(System.in);
	private void test() {}
	public void test1(int num) {
		if(num == 1) {
			System.out.println(111);
			return;
		}
		System.out.println("다음문장실행");
	}
	public int test2(int n) {
		if(n == 1) {
			System.out.println("test1 111");
			return 100;
		}else if(n == 1) {
			System.out.println("test2 222");
			return 200;
		}
		System.out.println("다음문장 실행");
		return 0;
	}
	public boolean test3() {
		return true;
	}
	public int test4() {
		int num = 1;
		if(num == 1) {
			return num;
		}
		return 0;
	}
	public String test5() {
		int num = 1;
		if(num == 1) {
			return "aaa";
		}
		return null;
	}
	public String[] input() {
		String[] name = new String[3];
		String nameCheck = null;
		for(int i = 0; i < 3; i++) {
			System.out.print((i+1) + "번째 이름을 입력하세요 : ");
			nameCheck = sc.next();
			name[i] = nameCheck;
		}
		return name;
		
	}
	public void print(String[] name) {
		for(int i = 0; i < name.length; i++) {
			System.out.println((i+1) + "번째 : " + name[i]);
		}
	}
	public ArrayList<String> input1() {
		ArrayList<String> name = new ArrayList<>();
		String nameCheck = null;
		for(int i = 0; i < 3; i++) {
			System.out.print((i+1) + "번째 이름을 입력하세요 : ");
			nameCheck = sc.next();
			name.add(nameCheck);
		}
		return name;
		
	}
	public void print1(ArrayList<String> name) {
		for(int i = 0; i < name.size(); i++) {
			System.out.println((i+1) + "번째 : " + name.get(i));
		}
	}
	public HashMap<Integer, String> input2() {
		HashMap<Integer, String> name = new HashMap<>();
		String nameCheck = null;
		for(int i = 0; i < 3; i++) {
			System.out.print((i+1) + "번째 이름을 입력하세요 : ");
			nameCheck = sc.next();
			name.put(i+1, nameCheck);
		}
		return name;
		
	}
	public void print2(HashMap<Integer, String> name) {
		Iterator<Integer> n = name.keySet().iterator();
		while(n.hasNext()) {
			int n1 = n.next();
			System.out.println(n1 + "번째 : " + name.get(n1));
		}
	}
	public int input3() {
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		return num;
	}
	public String cal(int num) {
		if(num % 2 == 0) {
			return "짝수 입니다.";
		}else {
			return "홀수 입니다.";
		}
	}
	public void print3(String n) {
		System.out.println(n);
	}
	public String cal1(int num) {
		if(num % 3 == 0) {
			return "3의 배수입니다.";
		}else {
			return "3의 배수가 아닙니다.";
		}
	}
	public String cal2(int num) {
		int count = 0;
		if(num == 0 || num == 1 || num < 0) {
			return "잘못 입력하셨습니다.";
		}
		for(int i = 1; i <= num; i++) {
			if(num % i == 0 || num % i == num) {
				count++;
			}
		}
		if(count == 2) {
			return "소수입니다.";
		}else {
			return "소수가 아닙니다.";
		}
	}
	public String cal3(int num) {
		if(num < 0) {
			int n = -num;
			return n+"";
		}else {
			return num+"";
		}
	}
	
}
/*
 - 모든 문제는 main, 연산, 입력, 출력하는 기능으로 만드세요
 만약 연산하는 기능이 없으면 연산기능은 빼셔도 됩니다.
 1. 3개의 이름을 입력받아 출력(배열, ArrayList, HashMap)
 2. 입력 값이 짝/홀 구분
 3. 입력 값이 3의배수/아닌지 구분
 4. 입력 값이 소수인지 아닌지 판별
 5. 절대값을 구하는 메소드
 
 */
