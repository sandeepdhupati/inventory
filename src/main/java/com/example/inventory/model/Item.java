/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.inventory.model;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Item {

    @Id
    @Column(name = "itemid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    @Column(name = "itemname")
    private String itemName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "supplier")
    private String supplier;

    public Item() {
    }

    public Item(int itemId, String itemName, int quantity, String supplier) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
