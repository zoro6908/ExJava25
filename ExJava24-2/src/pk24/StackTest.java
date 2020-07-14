package pk24;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		Stack<Object> st = new Stack<Object>();

		if (st.empty()) { // stack이 비어 있으면
			for (int i = 1; i <= 3; i++) { // stack에 데이터를 3개 추가
				st.push(new String("Hi" + i)); // stack에 데이터 삽입
				System.out.println(st.peek()); // Top point의 삽입된 데이터를 출력
			}
		}
		st.pop(); // 현재 Top point의 데이터를 삭제
		System.out.println("\n" + st.peek());

		st.pop();
		System.out.println(st.peek());

		st.push(new String("\neverybody!"));
		System.out.println(st.peek());

		st.push(new String("\nNIce Day!"));
		System.out.println(st.peek());
	}
}
