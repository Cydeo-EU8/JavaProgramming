package week04;


import java.util.ArrayList;

public class TJMaxx {
    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that are sold in TJMaxx
     */

    private ArrayList<Item> items;
    private ArrayList<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        items = new ArrayList<Item>();
        onSaleItems= new ArrayList<OnSaleItem>();

    }

    /**
     * adds an item object to regularItems list
     * @param itemName
     */

        public void addItem(Item itemName){
            this.items.add(itemName);
        }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param itemName
     */

    public void addOnSaleItem(OnSaleItem itemName){
        this.onSaleItems.add(itemName);
    }

    /**
     * getter for regularItems
     * @return
     */
        public ArrayList<Item> getItems(){
            return this.items;
        }

    /**
     * getter for onSaleItems
     * @return
     */

        public ArrayList<OnSaleItem> getOnSaleItems(){
            return onSaleItems;
        }

    /**
     * return count of regularItem object
     * @return
     */

    public int getCountItems(){
        return items.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */

    public int getCountOnSaleItems(){
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */


    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */


    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */


    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */


    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */

}
