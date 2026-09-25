package model;

public class SamePackageCheck {
    public static void main(String[] args) {
        AccessBox box = new AccessBox();
        System.out.println("open: " + box.open);
        System.out.println("family: " + box.family);
        System.out.println("packageOnly: " + box.packageOnly);

       
    }
}