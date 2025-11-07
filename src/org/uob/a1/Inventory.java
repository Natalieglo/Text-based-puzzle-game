package org.uob.a1;

// Task 4 - Inventory.java
// The Inventory class stores the player’s inventory, and is essentially a wrapper around an
// array. It includes the maximum items you can store, the current number of items stored
// and an array to store the items in.

public class Inventory {

    private int maxItems;
    private int currentItems;
    private String[] items;
    final int MAX_ITEMS = 10;

    public Inventory() 
    {
        this.maxItems=MAX_ITEMS;
        this.currentItems=0;
        this.items=new String[maxItems];
    }
    public void addItem(String item)
    {
        //if there is space in the inventory add the item
        if (currentItems<maxItems) 
        {
            items[currentItems]=item;
            currentItems++;
        }
    }
    public int hasItem(String item)
    {
        //Returns the position of the item in the
        //array if it is in the array. Otherwise it returns -1

        for (int i=0; i<currentItems; i++) 
        {
            if (items[i].equals(item)) {
                return i;
            }
        }
        return -1;

    public void removeItem(String item)
    {
        //Removes a specified item while
        //ensuring there are no empty elements in the array
        int pos=hasItem(item);
        if (pos!=-1)
        {
            // *****complete later*****
        }
    

    }
    public String displayInventory()
    {
        //Returns a String of all items separated
        //by spaces (note that there is a space after the last item as well)
        String inventory="";
        for (int i=0; i<currentItems; i++)
        {
            inventory+=items[i]+" ";
        }
        return inventory;
    }
}