import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayDequeJTest {
	ArrayDeque<String> a = new ArrayDeque<String>();
	
	@Test
	public void addgetFirstTest(){
		a.addFirst("three");
		String three = a.get(0);
		a.addFirst("two");
		String two = a.get(0);
		a.addFirst("one");
		String one = a.get(0);
		assertEquals("Should be three, actual is " + three, "three", three);
		assertEquals("Should be two, actual is " + two,"two", two);
		assertEquals("Should be one, actual is " + one,"one", one);
	}
	
	@Test
	public void addgetLastTest(){
		a.addLast("three");
		String three = a.get(0);
		a.addLast("two");
		String two = a.get(0);
		a.addLast("one");
		String one = a.get(0);
		assertEquals("Should be three, actual is " + three, "three", three);
		assertEquals("Should be three, actual is " + three,"three", three);
		assertEquals("Should be three, actual is " + three,"three", three);
	}
	
	public static void main(String[] args) {
		jh61b.junit.TestRunner.runTests("all", ArrayDequeJTest.class);

	}

}
