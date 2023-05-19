package object;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Scanner input = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.println("수 입력");
		num = input.nextInt();
		
		TestClass05 t = new TestClass05();
		//parameter : 메소드에 넘겨주는 값
		//			: 인자값
		sum = t.sumFunc(num);
		
		System.out.println("1~" + num + "까지의 합 : " + sum);
		
		System.out.println("main end");
	}
}
