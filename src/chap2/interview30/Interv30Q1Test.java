package chap2.interview30;

import org.junit.Test;

public class Interv30Q1Test {

	@Test
	public void test1() {
		
		StackWithMin st = new StackWithMin();
		st.push(3);
		
		if(st.min.peek() == 3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		st.push(4);
		
		if(st.min.peek() == 3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		st.push(2);
		
		if(st.min.peek() == 2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		st.push(3);
		
		if(st.min.peek() == 2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		st.pop();
		
		if(st.min.peek() == 2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		st.pop();
		
		if(st.min.peek() == 3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		st.pop();
		
		if(st.min.peek() == 3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		st.push(0);
		
		if(st.min.peek() == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
