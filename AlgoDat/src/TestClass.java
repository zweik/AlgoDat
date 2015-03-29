
public class TestClass {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		
		test.addEnd(test.create("test1"));
		test.addEnd(test.create("test2"));
		test.addEnd(test.create("test3"));
		test.addEnd(test.create("test4"));
		
		//test.deleteAfter(test.getListElement(4));
		test.insertAfter(test.getListElement(3), test.create("test3.5"));
		
		System.out.println(test.toString());
		
	}

}
