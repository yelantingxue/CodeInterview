package chap5.interview50;

import org.junit.Test;

public class Interv50Q2Test {

	@Test
	public void test() {
		
		Interview50Q2 instance = new Interview50Q2();
		
		instance.insert('g');
		System.out.println(instance.firstAppearingOnce());
		
		instance.insert('o');
		System.out.println(instance.firstAppearingOnce());
		
		instance.insert('o');
		System.out.println(instance.firstAppearingOnce());
		
		instance.insert('g');
		System.out.println(instance.firstAppearingOnce());
		
		instance.insert('l');
		System.out.println(instance.firstAppearingOnce());
		
		instance.insert('e');
		System.out.println(instance.firstAppearingOnce());
	}
}
