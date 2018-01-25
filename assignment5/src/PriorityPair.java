import java.util.ArrayList;

class PriorityQueue<T> {
	public static class  PriorityPair<T> {
		private T item;
		private int priority;

		// Constructor sets the private instance variables.

		public PriorityPair(T item, int priority) {
			this.priority = priority;
			this.item = item;
		}

		//Accessor methods
		
		public T getItem() {
			return item;
		}

		public int getPriority() {
			return priority;
		}

		//Mutator methods
		
		public void setItem(T newItem) {
			item = newItem;
		}

		public void setPriority(int newPriority) {
			priority = newPriority;
		}
		
		@Override
		public String toString() {
			return "Item: " + item + " queue #: " + priority;
		}
	}

	private ArrayList<PriorityPair> queue;

	public PriorityQueue() {
		queue = new ArrayList<PriorityPair>();
	}

	public void add(T item, int priority) {
		
		PriorityPair<T> items = new PriorityPair<T>(item, priority);
		
		//add items to queue
		
		queue.add(items);
		System.out.println("Added item: " + item + " priority " + priority);
	}

	public PriorityPair<T> remove() {
		
		if (queue.size()==0) {
			return null;
		}
		//compare items and return highest priority item
		
		PriorityPair<T> highestPriority = queue.get(0);
		
		for (int i = 1; i < queue.size(); i++) {
			if (queue.get(i).getPriority() > highestPriority.getPriority()){
		
				//this is new highest priority
				
				highestPriority = queue.get(i);
			}
		}
		//remove highest priority item
		
		queue.remove(highestPriority);
		return highestPriority;
	}
}