public class LinkedList {
	private ListElement head = null;
        //count für die Länge wäre sinnvoll
	
	public ListElement create(String value) {
		return new ListElement(value, null);
	}
	
	public String toString(){
		String buffer = "";
		int count = 0; 
                //das Count Element brauchst du nicht
                //du könntest das Komma einfach so anhängen und am ende
                //vor dem return das letzte komma entfernen
		for (ListElement current = head; current != null; current = current.next) {
			if (count != 0) {
				buffer += ",";
			}
			buffer += current.value;
			count++;
		}
		return buffer;
	}
	
	/**
	 * 
	 * @param index
	 * @return element at given index, if not available --> return == null
	 */
	public ListElement getListElement(int index) {
		int count = 0;
		ListElement current = head;
		if(head == null) {
			return null;
		}
		while(current.next != null) {
			while(count != index) {
				count++;
				current = current.next;
			}
		}
		if(count != index) {
			return null;
		}
		return current;
	}
	
	public void addStart(ListElement newElement) {
		if (head == null) {
			head = newElement;
		}
		
		else {
			newElement.next = head;
			head = newElement;
		}
	}
	
	public void addEnd(ListElement newElement) {
		if (head == null) {
			head = newElement;
		}
		
		else { 
			ListElement current = head;
			while (current.next != null){ 
				current = current.next;	
			}
			current.next = newElement;	
		}
	}
	
	public void addMiddle(ListElement newElement, int k) {
		int count = 0;
		for (ListElement current = head; current != null; current = current.next) {
			if (count == k) {
				newElement.next = current.next;
				current.next = newElement;
				return;
			}
			count++;
		}
		System.out.println("Could not insert at position k. Reason: List is shorter");
	}
	
	public void deleteStart() { 
		if (head == null){
			return;
		}
		
		ListElement help = head;
		head = head.next;
		help.next = null;
	}
	
	public void deleteEnd() { 
		if (head == null) {
			return;
		}
		
		if (head.next == null) {
			head = null;
			return;
		}
		
		ListElement current = head;
		while (current.next.next != null) { 
			current = current.next;
		}
		current.next = null;
	}
	
	public void deleteMiddle(int k) { 
		int count = 0;
		ListElement current = head;
		while (current != null) {
			if(count == k){
				if (current.next == null){
					System.out.println("No more element after index " + count);
					return;
				}
				ListElement help = current.next;
				current.next = current.next.next;
				help.next = null;
				return;
			}
			current = current.next;
			count++;
		}
		System.out.println("No element in List");
	}

        // Diese beiden Funktionen wären ebenfalls interessant ...
        // Willst du es versuchen?

        public void insertAfter(ListElement afterThis, ListElement addThis) {
            // Code
        	if(head == null) {
        		System.out.println("afterThis is no element in LinkedList");
        		return;
        	}
        	
        	for(ListElement current = head; current.next != null; current = current.next) {
        		if(current == afterThis) {
        			ListElement help = current.next;
        			current.next = addThis;
        			addThis.next = help;
        		}
        	}
        }

        public void deleteAfter(ListElement afterThis) {
            // Code
        	
        	for(ListElement current = head; current.next != null; current = current.next) {
        		if(current.next == null) {
        			System.out.println("No more element to delete afterThis");
        			return;
        		}	
        		
        		if(current == afterThis) {
        			if(current.next.next == null) {
        				current.next = null;
        				return;
        			}
        			
        			else {
        			current.next = current.next.next;
        			}
        		}
        	}
        }
	
	private class ListElement {
		private ListElement next;
		private String value;
		
		public ListElement(String value, ListElement next) {
			this.value = value;
			this.next = next;
		}
		
	
	}

}

