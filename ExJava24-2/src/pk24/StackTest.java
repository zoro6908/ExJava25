package pk24;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		Stack<Object> st = new Stack<Object>();

		if (st.empty()) { // stack�� ��� ������
			for (int i = 1; i <= 3; i++) { // stack�� �����͸� 3�� �߰�
				st.push(new String("Hi" + i)); // stack�� ������ ����
				System.out.println(st.peek()); // Top point�� ���Ե� �����͸� ���
			}
		}
		st.pop(); // ���� Top point�� �����͸� ����
		System.out.println("\n" + st.peek());

		st.pop();
		System.out.println(st.peek());

		st.push(new String("\neverybody!"));
		System.out.println(st.peek());

		st.push(new String("\nNIce Day!"));
		System.out.println(st.peek());
	}
}
