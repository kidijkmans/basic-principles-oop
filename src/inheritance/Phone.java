package inheritance;

/*
 * Inheritance = inheriting properties and behaviours from a parent class
 */

/*
 * Parent class 'Phone'
 */
public class Phone {

    public void makePhoneCall() {
        System.out.println("Making a phone call");
    }

}

/*
 * 'SmartPhone' extends 'Phone'
 * -> makes 'SmartPhone' a child class of 'Phone'
 * Will inherit the methods from the parent class
 */
class SmartPhone extends Phone {

    public void browseTheInternet() {
        System.out.println("Browsing the internet");
    }

}

/*
 * Inheritance demo
 */
class RunSmartPhone {
    public static void main(String[] args) {

        SmartPhone smartphone = new SmartPhone();

        smartphone.makePhoneCall(); // method inherited from the parent class

    }
}
