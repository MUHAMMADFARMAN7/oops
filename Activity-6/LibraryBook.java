public class LibraryBook {
    private int totalCopies = 0;
    private int borrowedCopies = 0;
    private boolean configured = false;

    public boolean configure(int total) {
        if (!configured && total > 0) {
            this.totalCopies = total;
            this.configured = true;
            return true;
        }
        return false;
    }

    public boolean borrow() {
        return borrow(1);
    }

    public boolean borrow(int n) {
        if (n > 0 && n <= getAvailable()) {
            borrowedCopies += n;
            return true;
        }
        return false;
    }

    public boolean returnCopies(int n) {
        if (n > 0 && n <= borrowedCopies) {
            borrowedCopies -= n;
            return true;
        }
        return false;
    }

    public int getAvailable() {
        return totalCopies - borrowedCopies;
    }

    public int getBorrowed() {
        return borrowedCopies;
    }
}