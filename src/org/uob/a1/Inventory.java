package org.uob.a1;

//FINISHED

// Task 4 - Inventory.java
// The Inventory class stores the player’s inventory, and is essentially a wrapper around an
// array. It includes the maximum items you can store, the current number of items stored
// and an array to store the items in.

public class Inventory {

    private int maxItems;
    private int currentItems; //position of next available space in inventory
    private String[] items;
    private String[] itemDescriptions;
    final int MAX_ITEMS = 10;

    public Inventory() 
    {
        this.maxItems=MAX_ITEMS;
        this.currentItems=0;
        this.items=new String[maxItems];
        this.itemDescriptions = new String[maxItems];
        
    }
    public void addItem(String item, String itemDescription)
    {
        //Adds an item to the array if there is space
        if (currentItems<maxItems) 
        {
            items[currentItems]=item;
            itemDescriptions[currentItems] = itemDescription;
            currentItems++;
        }
    }
    public int hasItem(String item)
    {
        //Returns the position of the item in the
        //array if it is in the array. Otherwise it returns -1

        for (int i=0; i<currentItems; i++) 
        {
        //error handling so that it compares the item in inventory

            //if (items[i]==item) 
            if (items[i].equalsIgnoreCase(item))
            {
                return i;
            }
            
        }
        return -1;
    }

    public void removeItem(String item)
    {
        //Removes a specified item while
        //ensuring there are no empty elements in the array
        //have to shift items down to fill the gap
        int pos=hasItem(item);
        if (pos!=-1)
        {
            for (int i=pos;i<currentItems-1;i++)
            {
                items[i]=items[i+1];
                itemDescriptions[i]=itemDescriptions[i+1];
            }
            items[currentItems-1]=null; 
            itemDescriptions[currentItems-1]=null;
            currentItems--; 
        }
    

    }
    public String displayInventory()
    {
        //Returns a String of all items separated
        //by spaces (note that there is a space after the last item as well)
        String inventory="";
        for (int i=0; i<currentItems; i++)
        {
            inventory+=items[i]+", ";
        }
        return inventory;
    }

    public String getItemDescription(String item) {
        int pos = hasItem(item);
        if (pos != -1) return itemDescriptions[pos];
        return null;
}
}