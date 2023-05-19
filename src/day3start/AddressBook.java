package day3start;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void addContact(){

        Contacts contact = new Contacts();

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

        list.add(contact);
    }

    void editContact() {

        System.out.print("\nEnter First Name: ");
        String firstName = scanner.next();

        for (Contacts contact : list){

            if (firstName.equals(contact.getFirstName())){

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
            else
                System.out.println("Contact Not Found");
        }
    }

    void deleteContact(){
        System.out.print("\nEnter First Name: ");
        String firstName = scanner.nextLine();

        for (Contacts contact : list){

            if (firstName.equals(contact.getFirstName())){

                list.remove(contact);
                System.out.println("Contact deleted successfully");
                break;
            }
            else
                System.out.println("Contact Not Found");
        }
    }

    void displayContact(){

        if(list.isEmpty()){
            System.out.println("Address Book is Empty");
        }
        else {
            for (Contacts contact : list) {
                System.out.println(contact);
            }
        }
    }
}