import java.util.Arrays;
public class SortInventoryItemApp {

	public static void main(String[] args) {
		
		InventoryItem item1 = new InventoryItem(1, "trombone");
		InventoryItem item2 = new InventoryItem(71, "guitar");
		InventoryItem item3 = new InventoryItem(188, "piano");
		InventoryItem item4 = new InventoryItem(15324, "xylophone");
		InventoryItem item5 = new InventoryItem(13, "violin");

		InventoryItem[] items= {item1, item2, item3, item4, item5};
		
		//array before sorting
		System.out.println("Before sorting: ");
		for (InventoryItem inventoryItem:items) {
			System.out.println(inventoryItem);
		}
		System.out.println();

		//array after sorting
		Arrays.sort(items);
		System.out.println("After sorting: ");
		for (InventoryItem inventoryItem:items) {
			System.out.println(inventoryItem);
		}
	}
}