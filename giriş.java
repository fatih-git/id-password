import java.util.Scanner;

/**
 * @author fatih-git
 */

public class giriş {

    public static void main(String[] args) {

        String userID="fatih", password="fatih123";
        String inputUser, inputPassword;
        String select;

        Scanner input=new Scanner(System.in);

        System.out.print("Please enter your ID: ");
        inputUser=input.nextLine();

        System.out.print("Please enter your password: ");
        inputPassword=input.nextLine();

        if (inputUser.equals(userID) && inputPassword.equals(password)){
            System.out.println("ID and password is true.");
        }
        else if(!inputUser.equals(userID)){
            System.out.println("User name is wrong!");
        }
        else if(!inputPassword.equals(password)){
            System.out.println("Password is worng!");

            System.out.print("Do you want to change password? (Yes:Y; No:N): ");
            select=input.nextLine();

            if (select.equals("Y") || select.equals("y")){
                System.out.print("Please enter new password: ");
                inputPassword=input.nextLine();

                if(!inputPassword.equals(password)){
                    password=inputPassword;
                    System.out.println("Password changed!");
                }
                else{
                    System.out.println("New password can't be same with last password!");
                }

            }else if(select.equals("N") || select.equals("n")){
                System.out.println("Password changing denied!");
            }else{
                System.out.println("Entered wrong character!");
            }

        }

    }

}