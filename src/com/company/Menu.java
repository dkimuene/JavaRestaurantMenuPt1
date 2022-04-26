package com.company;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    // an empty constructor, it just creates an empty list for the menuItems and uses the current time for lastUpdated
    public Menu() {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = new ArrayList<MenuItem>();
    }

    // a constructor that allows the user to create the menu with a pre-existing list of menuItems
    public Menu(ArrayList<MenuItem> items) {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = items;
    }

    // getter for .lastUpdated
    public Date getLastUpdated() {
        return lastUpdated;
    }

    // getter for .getMenuItems()
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // no setters --- as of now I don't think there is any reason to overwrite the properties

    //2.
    // newMenuItems(menuItem)
    // if menuItem.isNew() then return New Menu Item
    // else return



    //3.
    //getMenuLastUpdated()
    //return updated (lastUpdate)

    //4.a
    // printMenuItem(menuItem)
    // print out menuItem's name price, description, and category

    //4.b
    //printMenu()
    // Get the Menu Arraylist
    // Loop through each one
    // call printMenuItem

    //menuItemIsEqual(menuItem1, menuItem2)
    // compare menuItem1 and menuItem2 by the name, price,description, and category



}