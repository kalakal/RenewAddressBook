package day3start;
import java.util.Scanner;

public class AddressBook {

    Contacts contact = new Contacts();
    static Scanner scanner = new Scanner(System.in);
        public void addContact() {
            Scanner scanner = new Scanner(System.in);

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
        }
    void editContact() {


        System.out.print("\nEnter First Name: ");
        String firstName = scanner.next();

        if (firstName.equals(contact.getFirstName())){

            System.out.println("Contact Found");
            System.out.println("Edit Contact Details....");

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
        }
        else
            System.out.println("Contact Not Found");
    }


    void deleteContact(){
        String firstName = scanner.next();

        System.out.print("\nEnter First Name: ");

        if (firstName.equals(contact.getFirstName())){
            contact=null;
            System.out.println("Contact Deleted");
        }
        else
            System.out.println("Contact Not Found");
    }

        Contacts displayContact() {
            return contact;
        }

    }

