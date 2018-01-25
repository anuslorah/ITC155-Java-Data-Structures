P. 901/ ex 6

6. Write an addSorted method for the generic linked list from Display 15.8 such that the method adds a new node in the correct location so that the list remains in sorted order.  Note that this will require that the type parameter T extend the Comparable interface.  Write a suitable test program.


Sample Output:

List has 3 nodes.
Apples 1
Bananas 2
Cantaloupe 3
End of list.


Notes and Hints:

-The addSorted method is the only new method you need to add to the class from the chapter.

-T needs to be modified to extend Comparable.

-Use the following starter classes/code:



Entry.java
// Implement comparable so the LinkedList3 class can compare two
// Entry objects.

public class Entry implements Comparable {
    private String item;
    private int count;

    public Entry(String item, int count) {
        this.item = item;
        this.count = count;
    }

    @Override
    public String toString() {
        return (item + " " + count);
    }

    /**
     * This method must be implemented since Entry implements
     * Comparable.  It simply compares the two strings stored in
     * "item".
     *
     * @param otherObject
     *            item to compare to this object.
     */
    @Override
    public int compareTo(Object otherObject) throws ClassCastException {
        if (otherObject == null) {
            throw new ClassCastException("An Entry object expected.");
        } else if (getClass() != otherObject.getClass()) {
            throw new ClassCastException("An Entry object expected.");
        } else {
            Entry otherEntry = (Entry) otherObject;
            return (item.compareTo(otherEntry.item));
        }
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            Entry otherEntry = (Entry) otherObject;
            return (item.equals(otherEntry.item) && (count == otherEntry.count));
        }
    }
}

LinkedList3.java
/**
 * The addSorted method is the only new method added to this class
 * from the chapter.  T has been modified to extend Comparable.
 */
public class LinkedList3<T extends Comparable> {
    private static class Node<T> {
        private T data;
        private Node<T> link;

        public Node() {
        }

        public Node(T data, Node<T> link) {
            this.data = data;
            this.link = link;
        }
    } // End of Node<T> inner class

    private Node<T> head;

    public LinkedList3() {
        head = null;
    }

    /**
     * Adds a node at the start of the list with the specified data.
     * The added node will be the first node in the list.
     */
    public void addToStart(T item) {
        head = new Node<T>(item, head);
    }

    /**
     * Adds a node to the list so the list is in sorted order.  This
     * is done by searching for a node whose value is greater than
     * the new item to insert.  The new item is then placed before
     * the greater node.
     *
     * @param itemData
     *            new data to add to the list. It must be a class
     *            that implements Comparable.
     */
    public void addSorted(T item) {
        // TODO Add your code here.
        throw new RuntimeException("Implement me!");
    }

    /**
     * Removes the head node and returns true if the list contains at
     * least one node.  Returns false if the list is empty.
     */
    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.link;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the number of nodes in the list.
     */
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

    /**
     * Finds the first node containing the target item, and returns a
     * reference to that node.  If target is not in the list, null is
     * returned.
     */
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

    /**
     * Finds the first node containing the target and returns a
     * reference to the data in that node.  If target is not in the
     * list, null is returned.
     */
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

    /**
     * For two lists to be equal they must contain the same data
     * items in the same order.  The equals method of T is used to
     * compare data items.
     */
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

