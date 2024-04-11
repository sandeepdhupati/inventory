/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.inventory.repository;

import java.util.*;

import com.example.inventory.model.Item;

public interface ItemRepository {

    ArrayList<Item> getItems();

    Item getItemById(int itemId);

    Item addItem(Item item);

    Item updateItem(int itemId, Item item);

    void deleteItem(int itemId);
}
