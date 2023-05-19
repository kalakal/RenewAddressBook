package day3start;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("***| Address Book System |***\n");

        Scanner sc = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        boolean isOpen = true;

        while (isOpen) {

            System.out.println("\nSelect Operation....");
            System.out.println("1. Enter Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit Address Book");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;

                case 2:
                    addressBook.editContact();
                    break;

                case 3:
                    addressBook.deleteContact();
                    break;

                case 4:
                    addressBook.displayContact();
                    break;

                case 5:
                    isOpen = false;
                    break;
            }
        }
    }
}