package gov.oupp.training.java.corejava.questions.nov15;


class Library{
    public void checkOutBook(){
        System.out.println("Check out book");
        updateInventory();
    }
    private void updateInventory(){
        System.out.println("Calling the inventory method");
    }
}
public class TestLibrary {
    public static void main(String[] args) {
        Library library1=new Library();
        library1.checkOutBook();
    }
}
