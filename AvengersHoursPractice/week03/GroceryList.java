package week03;

import java.util.ArrayList;

public class GroceryList { // blueprint for all my shopping Lists

    private ArrayList<String> groceryList;

    // this will act like a setter method
    public GroceryList(){
        groceryList = new ArrayList<>();
    }

    public void addGroceryList(String item){
        groceryList.add(item);
    }

    // will act like a getter
    @Override
    public String toString() {
        String list="You have "+ groceryList.size()+" items in your grocery list";

        for (int i = 0; i < groceryList.size(); i++) {
            list+="\n"+(i+1)+"."+ groceryList.get(i);
        }

    return list;
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+ (position+1)+ " has been modified" );
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
// if you find an item you would be curious of index of the item
        String searchResult = "Not Found";

        int position = groceryList.indexOf(searchItem);
        // if I find item it will return index of it, otherwise we will get -1

        if(position>=0){
            searchResult = searchItem+ " item found at line "+(position+1);
        }

        return searchResult;
    }
}
