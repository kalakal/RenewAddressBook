package day3start;

import java.util.*;

import static day3start.AddressBook.searchPersonByCityOrState;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("***| Address Book System |***\n");

        Scanner sc = new Scanner(System.in);

        Map<String, AddressBook> addressBooks = new HashMap<>();

        boolean isOpen = true;

        while (isOpen) {
            System.out.println("\nSelect Operation....");
            System.out.println("1. Create New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Exit Address Book System");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the new address book: ");
                    sc.nextLine();
                    String newAddressBookName = sc.nextLine();
                    if (addressBooks.containsKey(newAddressBookName)) {
                        System.out.println("An address book with the same name already exists.");
                    } else {
                        AddressBook newAddressBook = new AddressBook();
                        addressBooks.put(newAddressBookName, newAddressBook);
                        System.out.println("New address book '" + newAddressBookName + "' created.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the name of the address book: ");
                    sc.nextLine();
                    String selectedAddressBookName = sc.nextLine();
                    AddressBook selectedAddressBook = addressBooks.get(selectedAddressBookName);
                    if (selectedAddressBook != null) {
                        performAddressBookOperations(selectedAddressBook);
                    } else {
                        System.out.println("No address book found with the given name.");
                    }
                    break;

                case 3:
                    isOpen = false;
                    break;
            }
        }
    }

    private static void performAddressBookOperations(AddressBook addressBook) {
        Scanner sc = new Scanner(System.in);

        boolean isAddressBookOpen = true;

        while (isAddressBookOpen) {
            System.out.println("\nSelect Operation....");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Go Back to Main Menu");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;

                case 2:
                    addressBook.editContact();
                    break;

                case 3:
                    System.out.print("Enter the city or state to search: ");
                    sc.nextLine();
                    String searchKeyword = sc.nextLine();
                    Map<String, AddressBook> addressBooks = null;
                    searchPersonByCityOrState(addressBooks, searchKeyword);
                    break;

                case 4:
                    addressBook.displayContact();
                    break;

                case 5:
                    isAddressBookOpen = false;
                    break;
            }
        }
    }
}


