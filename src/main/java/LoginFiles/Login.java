package LoginFiles;

import java.io.File;
import java.util.Scanner;

public class Login {
    private boolean found;
    private String tempUsername;
    private String tempPassword;

    public Login(boolean found, String tempUsername, String tempPassword) {
        this.found = found;
        this.tempUsername = tempUsername;
        this.tempPassword = tempPassword;
    }


    private static Scanner scn;

    public static boolean verifyLogin(String username, String password, String filepath) {
        boolean found = false;
        String tempUsername;
        String tempPassword;

        try {
            scn = new Scanner(new File(filepath));
            scn.useDelimiter("[,\n]");

            while (scn.hasNext() && !found) {
                tempUsername = scn.next();
                tempPassword = scn.next();
                if (tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())) {
                    found = true;
                }
            }
            scn.close();
            if (found != true) {
                System.out.println("***************************************");
                System.out.println("Incorrect Login! YOU SHALL NOT PASS !!!");
                System.out.println("***************************************");

            } else {
                System.out.println(" WEEEE - Login successful !! ");
                System.out.println("******************************");
                System.out.println("  WELCOME                     ");
                System.out.println("           TO                 ");
                System.out.println("              QUAHOG MALL     ");
                System.out.println("                              ");
                System.out.println("electronic shopping place ...   ");
                System.out.println("      something something ... ");
                System.out.println("                              ");
                System.out.println("******************************");
                System.out.println("******Happy shopping !********");
                System.out.println("                              ");
            }

        } catch (Exception e) {
            System.out.println("error");
        } return found;
    }


}
