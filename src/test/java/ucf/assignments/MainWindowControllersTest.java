package ucf.assignments;

import org.junit.jupiter.api.Test;


class MainWindowControllersTest {

    @Test
    void addNewToDoList() {
        //set expected ToDoList object
        //call 'addNewToDoList' method
        //check if ToDoList object exists
        //call 'fail' if object does not exist
    }

    @Test
    void removeToDoList() {
        //set expected ToDoList object
        //call 'removeToDoList' method
        //check if ToDoList object still exists
        //call 'fail' if object still exists
    }

    @Test
    void displayAllItems() {
        //call the displayAllItems method
        //this method will get the items from todolist
        //will display all items to screen
        //assert all items with console output
    }

    @Test
    void displayIncompleteItems() {
        //call the displayIncompleteItems method
        //this method will get the items from todolist
        //will display all incomplete items to screen
        //assert all items with console output
    }

    @Test
    void displayCompleteItems() {
        //call the displayCompleteItems method
        //this method will get the items from todolist
        //will display all complete items to screen
        //assert all items with console output
    }

    @Test
    void saveAllItemsSingleToDoList() {
        //call saveAllTasksSingleToDoList method
        //this method will be called when user will click save all tasks
        //all the tasks of a todolist will be get
        //then all tasks of to do list will be written to a file
        //assert if file exist
    }

    @Test
    void saveAllToDoLists() {
        //call saveAllToDoLists method
        //this method will loop through all the todolists
        //it will create text files for each to do list
        //then it will store all the todolists on storage
        //assert if files exist
    }

    @Test
    void loadSingleToDoList() {
        //call loadSingleToDoList method
        //through this method a to do list will be loaded
        //user will select a text file from external storage
        //then the text file wil be loaded into a todolist
        //assert if size of arraylist is same as of file
    }

    @Test
    void loadMultipleToDoLists() {
        //call loadSingleToDoList method
        //through this method multiple to do lists will be loaded
        //user will select multiple text files from external storage
        //then the text files wil be loaded into a todolists
        //assert if size of arraylist is same as of no of files
    }
}