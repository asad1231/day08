package object;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		t.test1(1);
		t.test2(1);
		
		ArrayList<String> arr = new ArrayList<>();
		boolean bo = arr.add("aaa");
		
		boolean bool = t.test3();
		
		//1.3개의 이름을 입력받아 출력(배열, ArrayList, HashMap)
		String[] name = t.input();
		t.print(name);
		ArrayList<String> name1 = t.input1();
		t.print1(name1);
		HashMap<Integer, String> name2 = t.input2();
		t.print2(name2);
		//2.입력 값이 짝/홀 구분
		int num = t.input3();
		String n = t.cal(num);
		t.print3(n);
		//3. 입력 값이 3의배수/아닌지 구분
		num = t.input3();
		n = t.cal1(num);
		t.print3(n);
		//4. 입력 값이 소수인지 아닌지 판별
		num = t.input3();
		n = t.cal2(num);
		t.print3(n);
		//5. 절대값을 구하는 메소드
		num = t.input3();
		n = t.cal3(num);
		t.print3(n);
	}
}
