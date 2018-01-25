//Anu Slorah Assignment 5
public class PriorityApp {

	public static void main(String[] args) {

		 PriorityQueue<String> pairs = new PriorityQueue<String>();

		 pairs.add("One", 1);
		 pairs.add("Five", 5);
		 pairs.add("Seven", 7);
		 pairs.add("Three", 3);
		 pairs.add("Eight", 8);
		 
		 System.out.println();
		 
		 PriorityQueue.PriorityPair<String> s;
			do
			{
				s = pairs.remove();
				if (s!=null)
				{
					System.out.println("Removed : " + s.getItem() + " priority: " + s.getPriority());
				}
			} while (s!=null);
	}//main
}//class

