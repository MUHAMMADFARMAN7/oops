public class Demo {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook();
        LibraryBook book2 = new LibraryBook();

        System.out.println("--- Setup ---");
        System.out.println("Book 1 configure(3): " + book1.configure(3));
        System.out.println("Book 2 configure(1): " + book2.configure(1));
        System.out.println("Book 2 Available: " + book2.getAvailable());

        System.out.println("\n--- Execution Sequence (Book 1) ---");
        printState("configure(3)", true, book1);

        execBorrow(book1, 2);
        execBorrow(book1, 2);
        execReturn(book1, 1);
        execReturn(book1, 2);

        boolean singleBorrow = book1.borrow();
        printState("borrow()", singleBorrow, book1);

        boolean reconfig = book1.configure(10);
        printState("configure(10) [Re-attempt]", reconfig, book1);
    }

    private static void execBorrow(LibraryBook book, int n) {
        boolean res = book.borrow(n);
        printState("borrow(" + n + ")", res, book);
    }

    private static void execReturn(LibraryBook book, int n) {
        boolean res = book.returnCopies(n);
        printState("returnCopies(" + n + ")", res, book);
    }

    private static void printState(String action, boolean result, LibraryBook book) {
        System.out.printf("Action: %-25s | Result: %-5b | Borrowed: %d | Available: %d%n",
                action, result, book.getBorrowed(), book.getAvailable());
    }
}