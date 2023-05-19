package object;

import java.util.Scanner;

public class TestClass04 {
	//argument : 메소드에서 받아주는 값
	//		   : 매개변수
	public void sumFunc(int num) {
		int sum=0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~" + num + "까지의 합 : " + sum);
	}
}
