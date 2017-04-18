
public class ArrayDequeTest {

	public static void main(String[] args) {
		ArrayDeque<String> test = new ArrayDeque<String>();
		test.addFirst("firstt");
		test.addFirst("second");
		test.addLast("third");
		test.addLast("fourth");
		test.removeLast();
		test.addFirst("f");
		test.addFirst("a");
		test.addFirst("b");
		test.addFirst("c");
		test.addFirst("d");
		test.addFirst("e");
		test.addLast("lastItem");
		//String output = test.get(1);
	//	int nextfirst = test.nextLast;
		test.printDeque();
		//System.out.println(output);
//		System.out.println(test.size());
	}

}
