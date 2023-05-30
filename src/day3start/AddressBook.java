package day3start;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class AddressBook {
    ArrayList<Contacts> list = new ArrayList<>();
    Contacts contacts = new Contacts();
    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter Person Name: ");
        String name = scanner.nextLine();

        if (isDuplicate(name)) {
            System.out.println("Duplicate entry. This person already exists in the address book.");
            return;
        }
    }

    boolean isDuplicate(String name) {
        System.out.println("Enter first name");
        String firstName = scanner.next();
        for (Contacts contact : list) {
            if (Contacts.getfirstName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }


    boolean editContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter First Name: ");
        String firstName = scanner.next();

        for (Contacts contact : list) {

            if (firstName.equals(contact.getFirstName())) {

                System.out.println("\nContact Found\n");
                System.out.println("Edit Contact Details....\n");

                System.out.print("Enter First Name: ");
                contact.setFirstName(scanner.nextLine());

                System.out.print("Enter Last Name: ");
                contact.setLastName(scanner.nextLine());

                System.out.print("Enter Phone Number: ");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.print("Enter Email-ID: ");
                contact.setEmail(scanner.nextLine());

                System.out.print("Enter address: ");
                contact.setAddress(scanner.nextLine());

                System.out.print("Enter City: ");
                contact.setCity(scanner.nextLine());

                System.out.print("Enter State: ");
                contact.setState(scanner.nextLine());

                System.out.print("Enter Zip-code: ");
                contact.setZip(scanner.nextLine());
                break;
            }

        }
        return false;
    }

    void deleteContact() {
        System.out.print("\nEnter First Name: ");

        String firstName = scanner.nextLine();

        for (Contacts contact : list) {

            if (firstName.equals(contact.getFirstName())) {

                list.remove(contact);
                System.out.println("Contact deleted successfully");
                break;
            } else
                System.out.println("Contact Not Found");
        }
    }

    void displayContact() {

        if (list.isEmpty()) {
            System.out.println("Address Book is Empty");
        } else {
            for (Contacts contact : list) {
                System.out.println(contact);
            }
        }
    }

    public static void searchPersonByCityOrState(Map<String, AddressBook> addressBooks, String keyword) {
        List<Contacts> searchResults = new ArrayList<>();
        for (AddressBook addressBook : addressBooks.values()) {
            List<Contacts> contacts = addressBook.getContacts();
            for (Contacts person : contacts) {
                if (person.getCity().equalsIgnoreCase(keyword) || person.getState().equalsIgnoreCase(keyword)) {
                    searchResults.add(person);
                }
            }
        }
        if (searchResults.isEmpty()) {
            System.out.println("No matching contacts found in the specified city or state.");
        } else {
            System.out.println("Search Results:");
            for (Contacts person : searchResults) {
                System.out.println(person);
            }
        }

    }

    public List<Contacts> getContacts() {
        return (List<Contacts>) contacts;
    }
}