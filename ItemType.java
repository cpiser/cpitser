public class ItemType {

    private int value;

    public ItemType(int num) {
	value = num;
    } // ItemType
    
    public int compareTo(ItemType item) {
	int num = item.getValue();
	if (value > num) {
	    return 1;
	} else if (value < num) {
	    return -1;
	} else {
	    return 0;
	}
    } // compareTo

    public int getValue() {
	return this.value;
    } // getValue
    
} // ItemType
