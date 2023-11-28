package gov.oupp.training.java.corejava.questions.nov25;

public class QuestionNo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShoppingCart shoppingCart=new ShoppingCart(100,20,2000);

        ShoppingCart shoppingCart1= (ShoppingCart) shoppingCart.clone();

        System.out.println(shoppingCart);
        System.out.println(shoppingCart1);
    }
}
