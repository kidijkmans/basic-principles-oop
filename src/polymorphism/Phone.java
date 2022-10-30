package polymorphism;

/*
 * Polymorphism = perform a single action in different ways
 * 
 * Polymorphism through method overriding (runtime or object polymorphism)
 * Override the parent class methods in the child classes
 */

// Parent class 'Phone'
public class Phone {

    public void makePhoneCall() {
        System.out.println("Making a phone call");
    }
}

// Child class 'SmartPhone'
class SmartPhone extends Phone {

    public void makePhoneCall() {
        System.out.println("Making a phone call with VoIP");
    }
}

// Child class 'Landline'
class Landline extends Phone {

    public void makePhoneCall() {
        System.out.println("Making a phone call using copper wires");
    }
}

/*
 * Runtime polymorphism demo
 */
class RunPhone {
    public static void main(String[] args) {

        Phone smartphone = new SmartPhone();
        smartphone.makePhoneCall(); // will use the method in the child class 'SmartPhone'

        Phone landline = new Landline();
        landline.makePhoneCall(); // will use the method in the child class 'Landline'
    }
}
