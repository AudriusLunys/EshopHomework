package EshopMain;


import LoginFiles.Login;


import java.io.FileNotFoundException;
import java.util.Scanner;


public class EshopMain {


    public static void main(String[] args) throws FileNotFoundException {


        // tikrinam userio login
        Scanner scanner = new Scanner(System.in);
        System.out.println("********  LOGIN  ********");
        System.out.println("**PLEASE ENTER USERNAME**");
        String username = scanner.next();
        System.out.println("**PLEASE ENTER PASSWORD**");
        String password = scanner.next();

        Login login = new Login(false, "temp", "temp");
        if (login.verifyLogin(username, password, "C:\\Users\\Audrius\\IdeaProjects\\EshopHomework\\src\\main\\java\\LoginFiles\\LoginData.txt")) {
            System.out.println("WE OFFER THIS STUFF TODAY");

            ProductsList products = new ProductsList();
            Cart cart = new Cart();
            products.printStoreItems();
            System.out.println("************* SELECT  ITEMS ************** ");
            System.out.println("                                           ");
            System.out.println("*** ENTER PRODUCT ID TO ADD ITEM TO CART** ");
            cart.addProductToCartByPID(getUserInput());
            cart.printCartItems();
            System.out.println("***WANT MORE STUFF YOU GREEDY BASTARD ?   1->YES , 2->NO  *****");
            while (scanner.hasNextInt()) {
                if (scanner.nextInt() == 1) {
                    System.out.println("*** ENTER PRODUCT ID TO ADD ITEM TO CART** ");
                    ;
                    cart.addProductToCartByPID(getUserInput());
                    cart.printCartItems();
                    System.out.println("***WANT MORE STUFF ? GREED IS GOOD !?   1->YES , 2->NO  *****");
                } else {
                    orderConfirmation();
                    break;
                }
            }

        }


    }


    private static void orderConfirmation() {
        Scanner s = new Scanner(System.in);
        System.out.println("**** ORDER CONFIRMATION ****");
        System.out.println("**PLEASE ENTER SHIPPING ADRESS***");
        s.nextLine();
        System.out.println("******************************");
        System.out.println("******ORDER CONFIRMED*********");
        System.out.println("******************************");
        System.out.println("  THANK YOU                   ");
        System.out.println("         4 SHOPPING           ");
        System.out.println("         IN   QUAHOG MALL     ");
        System.out.println("                              ");
        System.out.println("electronic shopping place ...  ");
        System.out.println("      something something ... ");
        System.out.println("      COME BACK SOON !!       ");
        System.out.println("******************************");
    }

    private static int getUserInput() throws NumberFormatException {
        int pick = 0;
        Scanner in = new Scanner(System.in);
        pick = Integer.parseInt(in.nextLine());
        return pick;
    }

}




































