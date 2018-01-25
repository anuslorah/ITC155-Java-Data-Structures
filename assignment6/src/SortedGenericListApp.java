// Anu Slorah

public class SortedGenericListApp {

	public static void main(String[] args) {

		LinkedList3<Entry> list  = new LinkedList3<Entry>();
		
		Entry entry2 = new Entry("bananas", 2);
		list.addSorted(entry2);
		
		Entry entry1 = new Entry("apples", 1);
		list.addSorted(entry1);
		
		Entry entry3 = new Entry("cantaloupe", 3);
		list.addSorted(entry3);
		
		Entry entry4 = new Entry("bread", 5);
		list.addSorted(entry4);

		Entry entry5 = new Entry("anis seed", 4);
		list.addSorted(entry5);
		
		System.out.println("List has: " + list.size() + " nodes");
		list.outputList();
		System.out.println("End of list");
	
	}
}
