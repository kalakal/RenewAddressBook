package day3start;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to our AddressBook Problems");


        Contacts contact = new Contacts();

        contact.setFirstName("Sayed");
        contact.setLastName("Faizan");
        contact.setAddress("Rajouri");
        contact.setCity("Jammu");
        contact.setState("Jammu kashmir");
        contact.setZip("185231");
        contact.setPhoneNumber("(+91) 9906276508");
        contact.setEmail("sayed@faizan.com");

        System.out.println(contact.getFirstName() + " " +contact.getLastName());
        System.out.println(contact.getPhoneNumber());
        System.out.println(contact.getEmail());
        System.out.println(contact.getAddress() + ",");
        System.out.println(contact.getCity() + ", " + contact.getState());
        System.out.println(contact.getZip());
        AddressBook addressBook = new AddressBook();

        addressBook.addContact();
        System.out.println(addressBook.displayContact());
    }
}

