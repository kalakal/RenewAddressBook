package day3start;
import java.util.Scanner;

public class AddressBook {

    Contacts contact = new Contacts();

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

    Contacts displayContact() {
        return contact;
    }
}
