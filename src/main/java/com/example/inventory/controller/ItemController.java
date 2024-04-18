/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.inventory.controller;

import com.example.inventory.model.Item;
import com.example.inventory.service.ItemJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ItemController {

    @Autowired
    private ItemJpaService itemService;

    @GetMapping("/items")
    public ArrayList<Item> getItems() {
        return itemService.getItems();
    }

    @GetMapping("/items/{itemId}")
    public Item getItemById(@PathVariable("itemId") int itemId) {
        return itemService.getItemById(itemId);
    }

    @PostMapping("/items")
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @DeleteMapping("/items/{itemId}")
    public void deleteItem(@PathVariable("itemId") int itemId) {
        itemService.deleteItem(itemId);
    }

    @PutMapping("/items/{itemId}")
    public Item updateItem(@PathVariable("itemId") int itemId, @RequestBody Item item) {
        return itemService.updateItem(itemId, item);
    }
}
