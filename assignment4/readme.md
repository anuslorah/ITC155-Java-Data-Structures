P.758 ex. 2

2. Listed next is the skeleton for a class named InventoryItem.  Each inventory item has a name and a unique ID number:
class InventoryItem
{
    private String name;
    private int uniqueItemID;
}
Flesh out the class with the appropriate accessors, constructors, and mutators.  The uniqueItemID’s are assigned by your store and can be set from outside the InventoryItem class — your code does not have to ensure that they are unique.  Next, modify the class so that it implements the Comparable interface.  The compareTo() method should compare the uniqueItemID’s; e.g., the InventoryItem with item ID 5 is less than the InventoryItem with ID 10.  Test your class by creating an array of sample InventoryItem’s and sort them using a sorting method that takes as input an array of type Comparable.

*Hint: 
Use the Generalized Selection sort for an array of type Comparable from the textbook, chapter 13, p. 725.


Sample Output:

Here is the inventory prior to sorting:
ID: 40  Name: Cape
ID: 21  Name: Spiderman Suit
ID: 59  Name: Power Ring
ID: 3  Name: Bulletproof Bracelets
ID: 39  Name: X-Ray Goggles

Here is the inventory after sorting:
ID: 3  Name: Bulletproof Bracelets
ID: 21  Name: Spiderman Suit
ID: 39  Name: X-Ray Goggles
ID: 40  Name: Cape
ID: 59  Name: Power Ring

