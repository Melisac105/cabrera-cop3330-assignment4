/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Melissa Cabrera
 */

package ucf.assignments;

public class Item {

    private String description;
    private String dueDate;

    public Item(String description, String dueDate) {
        this.description = description;
        this.dueDate = dueDate; // format as shared
    }

    //getter method for item description
    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        //setter method for item description using "this."
    }

    //getter method for due date
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        //setter method for due date using "this."
    }
}
