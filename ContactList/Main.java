package Phone;

import java.util.Scanner;

public class Main {
    public static Contactlist contactlist = new Contactlist("0123456789");
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Starting phone...");
        printAction();
        boolean start = false;
        while (!start) {
            System.out.println("6 to show available action:");
            int input = in.nextInt();
            in.nextLine();
            switch (input) {
                case 0:
                    System.out.println("Shuting down...");
                    start = true;
                    break;
                case 1:
                    contactlist.printList();
                    break;
                case 2 :
                    addnewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }
    }
        public static void printAction () {
            System.out.println("Please choose action:");
            System.out.println("0 - to shutDown\n" +
                    "1 - to print contacts\n" +
                    "2 - to add a new contact\n" +
                    "3 - to update an existing contact\n" +
                    "4 - to remove and existing contact\n" +
                    "5 - query for existing contact\n" +
                    "6 - to print a list of available actions.");
            System.out.println("Choose Your Action: ");
        }
        public static void addnewContact(){
            System.out.println("Enter contact name:");
            String name = in.nextLine();
            System.out.println("Enter phone number");
            String phone = in.nextLine();
            Contact contact1 = new Contact(name,phone);
            System.out.println("New Contact Added: name = "+ name + " , phone=" + phone );
        }
        public static void updateContact(){
            System.out.println("Enter existing contact name : ");
            String name = in.nextLine();
            Contact excontact = contactlist.queryContact(name);
            if (excontact == null){
                System.out.println("can't found contact");
                return;
            }
            System.out.println("Name is :" + excontact.getName() + "The phone number is : " + excontact.getPhone());

        }
        public  static void removeContact() {
            System.out.println("Enter exitsting contact name : ");
            String name = in.nextLine();
            Contact excontact = contactlist.queryContact(name);
            if (excontact == null) {
                System.out.println("Can't not found contact !");
                return;
            } else {
                contactlist.removeContact(excontact);
                System.out.println("Contact deleteting sucessfully");
            }
        }
        public static  void queryContact(){
                System.out.println("Enter exitsting contact name : ");
                String name = in.nextLine();
                Contact excontact = contactlist.queryContact(name);
                if(excontact == null ){
                    System.out.println("can't find contact");
                    return;
                } else {
                    System.out.println("Name : " + excontact.getName()+
                            " Phone Number is: " + excontact.getPhone());
                }
            }

}
