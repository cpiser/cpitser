public class SortedLinkedList {

    private NodeType head;
    private NodeType currentPos;

    public SortedLinkedList() {
	head = null;
	currentPos = null;
    } // SortedLinkedList

    public int getLength() {
	int length = 0;
	NodeType node = head;
	while (node != null) {
	    node = node.next;
	    length++;
	}
	return length;
    } // getLength

    public void insertItem(ItemType item) {
	NodeType newNode = new NodeType();
	newNode.info = item;
	if (this.head == null) {
	    this.head = newNode;
	} else {
	    NodeType prevLoc = null;
	    NodeType location = this.head;
	    boolean finished = false; // flag var that represents if the insertion process is finished
	    while (!finished) {
		int comparison = item.compareTo(location.info);
		if ((comparison == 1) && (location.next != null)) {
		    prevLoc = location;
		    location = location.next;
		} else if ((comparison == 1) && (location.next == null)) {
		    location.next = newNode;
		    finished = true;
		} else if (comparison == 0) {
		    System.out.println("Sorry, you cannot insert the duplicate item.");
		    finished = true;
		} else if (comparison == -1 && prevLoc == null) {
		    newNode.next = this.head;
		    this.head = newNode;
		    finished = true;
		} else if ((comparison == -1) && prevLoc != null) {
		    newNode.next = location;
		    prevLoc.next = newNode;
		    finished = true;
		}
	    }
	}
    } // insertItem

    /*
      public void deleteItem(ItemType item) {

      } // deleteItem

      public int searchItem(ItemType item) {

      } // searchItem

      public ItemType getNextItem() {

      } // getNextItem

      public void resetList() {

      } // resetList

      mergeList
      deleteAlternateNodes
      intersection
    
    */
    
} // SortedLinkedList
