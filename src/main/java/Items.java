/**
 * Items
 * - the head item class managing the basic functions of all items
 * created 23/11/21
 * @author Ben Dale
 * no copyright
 */

/**
 * import
 */

public class Items {

    private String itemTypeID; /* stores the type of item (would this be needed if we need a specific item id which should already be unique?) */
    private int itemID; /* stores the ID of the item */
    private int itemCount = 0; /* stores the number of items in existanse accros the class */

    public Items(String typeID) {
        itemID = itemCount;
        itemCount ++;
        itemTypeID = typeID;
    }

    public String getItemType() {
        return itemTypeID;
    }
}
