package comproproject;

import java.util.Scanner;

public class PhoneBookApp {

    public static void main(String[] args) {
        int select;
        int count = 0;
//        PhoneBook newBook = null;
        String menuStr = "1. add phone number \n"
                + "2. delete list \n"
                + "3. edit phone book \n"
                + "4. show all list\n"
                + "0. exit \n"
                + "==============================================================";
        Scanner sc = new Scanner(System.in);
        System.out.println(menuStr);

        do {
            System.out.println("Select menu : ");
            select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    
                    System.out.println("Enter your tel-phone: ");
                    String input0 = sc.nextLine();
                    int input1 = Integer.parseInt(input0);
                    System.out.println("Enter your name: ");
                    String input2 = sc.nextLine();
                    
                    System.out.println("Enter your E-mail: ");
                    String input3 = sc.nextLine();
                    PhoneBook phoneBook = new PhoneBook(input1,input2,input3);
                    phoneBook.setTelNummber(input1);
                    phoneBook.setName(input2);
                    phoneBook.setEmail(input3);
                    System.out.println(phoneBook.toString());
                    break;
                case 2:
                    System.out.println(menuStr);
                    System.out.println("Enter name you want to delete : ");

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        } while (select != 0);
    }

}
