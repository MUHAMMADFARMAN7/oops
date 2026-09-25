package app;

import model.AccessBox;

public class OutsideCheck {
    public static void main(String[] args) {
        AccessBox box = new AccessBox();
        box.printInside(); 
        System.out.println("open: " + box.open);

        
    }
}