package com.online.restaurant.app;
import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;
import com.online.restaurant.app.*;
public class Appliction {
    public static void main(String[] args) {
        Customer rahul=new Customer(); //customer
        rahul.setName("Rahul");
        rahul.setAddress("plot. no 153 shyam nager pardi ");
        rahul.setEMAIL("firojdahake202@gmial.com");
        rahul.setCity("nagpur");
        rahul.setState("Maharashtra");
        rahul.setPhoneNumber(8668678783L);

        System.out.println("Customer details :");
        System.out.println("Name :"+ rahul.getName());
        System.out.println("City :"+ rahul.getCity());
        System.out.println("Addredd :"+ rahul.getAddress());
        System.out.println("State :"+ rahul.getState());
        System.out.println("Email :"+ rahul.getEMAIL());
        System.out.println("Number :"+ rahul.getPhoneNumber());
        System.out.println();


        Vendor haldiram=new Vendor(); //vender
        haldiram.setName("Haldiram");
        haldiram.setAddress("plot no.43 shyam nager pardi");
        haldiram.setCity("nahgpur");
        haldiram.setEmailid("haldiram2002@gmail.com");
        haldiram.setState("Maharashtra");
        haldiram.setPhonenumber(856235452);

        System.out.println("Vender details :");
        System.out.println("Name :"+ rahul.getName());
        System.out.println("City :"+ rahul.getCity());
        System.out.println("Addredd :"+ rahul.getAddress());
        System.out.println("State :"+ rahul.getState());
        System.out.println("Email :"+ rahul.getEMAIL());
        System.out.println("Number :"+ rahul.getPhoneNumber());



    }
}
