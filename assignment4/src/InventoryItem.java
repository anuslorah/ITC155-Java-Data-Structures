
public class InventoryItem implements Comparable<InventoryItem> {
	private String name;
	private int uniqueItemID;

	InventoryItem(int uniqueItemID, String name) {
		this.name = name;
		this.uniqueItemID = uniqueItemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUniqueItemID() {
		return uniqueItemID;
	}

	public void setUniqueItemID(int uniqueItemID) {
		this.uniqueItemID = uniqueItemID;
	}

	@Override
	public int compareTo(InventoryItem o) {
		return uniqueItemID - o.uniqueItemID; // returns array in ascending order
	}

	@Override
	public String toString() {
		return "ID: " + uniqueItemID + " item: " + name;
	}
}