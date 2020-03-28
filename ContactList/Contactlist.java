package Phone;

import java.util.ArrayList;
import java.util.List;

public class Contactlist {
    private String phone;
    private ArrayList<Contact> myContacts;
    public  Contactlist(String phone){
        this.phone = phone;
        this.myContacts = new ArrayList<Contact>();
    }
    public void addContact(Contact contact){
        myContacts.add(contact);
    }
    /// find position
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }
    /// find name
    public int searchContact(String contactName){
        for(int i =0; i < this.myContacts.size(); i++) {
            Contact contacts = this.myContacts.get(i);
            if(contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    /// query
    public Contact queryContact(String name) {
        int position = searchContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }
        return null;
    }
    public void updateContact(Contact oldContact , Contact newContact){
        int Position = myContacts.indexOf(oldContact);
        if (Position < 0 ){
            System.out.println(oldContact.getName() + " not found");
        } else {
            myContacts.set(Position, newContact);
            System.out.println(oldContact.getName() + "was replaced with " + newContact.getName());
        }
    }
    public void removeContact(Contact contact){
        int Position = myContacts.indexOf(contact);
        if (Position < 0){
            System.out.println(contact.getName() + "was delete");
        } else {
            System.out.println("Not found contact");
        }
    }
    public void printList() {
        System.out.println("Contact list");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + " ." +
                    this.myContacts.get(i).getName() +
                    " -> " + this.myContacts.get(i).getPhone());
        }
    }
}
