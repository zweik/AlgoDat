
public class TestClass {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		
		test.addEnd(test.create("test1"));
		test.addEnd(test.create("test1"));
		test.addEnd(test.create("test4"));
		test.addMiddle(test.create("test3"), 1);
		test.deleteMiddle(1);
		System.out.println(test.toString());
		
	}

}
