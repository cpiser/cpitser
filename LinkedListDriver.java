public class LinkedListDriver {

    public static void main(String[] args) {
	SortedLinkedList list = new SortedLinkedList();
	System.out.println("Initial length: " + list.getLength());
	list.insertItem(new ItemType(5));
	System.out.println("New length: " + list.getLength());
	list.insertItem(new ItemType(7));
	System.out.println("New length: " + list.getLength());
	list.insertItem(new ItemType(3));
	list.insertItem(new ItemType(7));
	System.out.println("New length: " + list.getLength());
	list.insertItem(new ItemType(4));
	System.out.println("New length: " + list.getLength());
    }
    
} // LinkedListDriver
