
public class LinkedList3<T extends Comparable> {
   
	//inner Node<T> class
	private static class Node<T> {
        private T data;
        private Node<T> link;

        public Node() {
        }

        public Node(T data, Node<T> link) {
            this.data = data;
            this.link = link;
        }
    } 

    private Node<T> head;

    public LinkedList3() {
        head = null;
    }

     // Add a node to the start of the list
    
    public void addToStart(T item) {
        head = new Node<T>(item, head);
    }

    //add a node and sort the list by data (greatest value at the top of the list)
    
    public void addSorted(T itemData)
    {
		if (head == null)
		{
	        head = new Node<T>(itemData, head);
		}
	    else
	    {
			//look for a node where the new data is greater 
	    	//than the current data and insert in between
			Node<T> previous = null;
			Node<T> current = head;
			T itemAtPosition;
			while (current != null)
			{
				itemAtPosition = current.data;
				if (itemAtPosition.compareTo(itemData) >= 0)
				{
					// The item to insert should go before
					// itemAtPosition.  But check if this is
					// the head of the list.
					if (previous == null)
					{
						// Insert at the head
						head = new Node<T>(itemData, head);
						break;
					}
					else
					{
						// Insert somewhere in the middle
						Node<T> newNode =
							new Node<T>(itemData, previous.link);
						previous.link = newNode;
						break;
					}
				}
				// Move to next node
				previous = current;
				current = current.link;
			}
			// If we reach the end of the list, add to the end
			if (current == null)
			{
				Node<T> newNode =
					new Node<T>(itemData, null);
				previous.link = newNode;
			}
		}
    

    	
    }

    //remove the head node and returns true if the list contains at
    //least one node.  Returns false if the list is empty
    
    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.link;
            return true;
        } else {
            return false;
        }
    }

    //return the number of nodes in the list.
    
    public int size() {
        int count = 0;
        Node<T> position = head;

        while (position != null) {
            count++;
            position = position.link;
        }

        return count;
    }

    public boolean contains(T item) {
        return (find(item) != null);
    }

    //find the first node containing the target item, and returns a
    //reference to that node.  If target is not in the list, null is returned
    
    private Node<T> find(T target) {
        Node<T> position = head;
        T itemAtPosition;
        while (position != null) {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(target)) {
                return position;
            }
            position = position.link;
        }

        // The target was not found.
        return null;
    }

    //find the first node containing the target and returns a
    //reference to the data in that node.  If target is not in the
    //list, return null
    
    public T findData(T target) {
        return find(target).data;
    }

    public void outputList() {
        Node<T> position = head;
        while (position != null) {
            System.out.println(position.data);
            position = position.link;
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
    }

    //to have two lists equal, they must contain the same data
    //items in the same order.  The equals method of T compares data items
     
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            LinkedList3<T> otherList = (LinkedList3<T>) otherObject;
            if (size() != otherList.size()) {
                return false;
            }

            Node<T> position = head;
            Node<T> otherPosition = otherList.head;
            while (position != null) {
                if (!(position.data.equals(otherPosition.data))) {
                    return false;
                }
                position = position.link;
                otherPosition = otherPosition.link;
            }

            // No mismatch was found.
            return true;
        }
    }
}