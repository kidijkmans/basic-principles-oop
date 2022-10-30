package polymorphism;

/*
 * Polymorphism = perform a single action in different ways
 * 
 * Polymorphism through method overloading (compile time or functional polymorphism)
 * Multiple of the same method (browserTheInternet), but different parameters
 */
public class Computer {

    public void browseTheInternet() {
        System.out.println("Browsing the internet: www.google.com"); // default start screen
    }

    public void browseTheInternet(String website) {
        System.out.println("Browsing the internet: " + website);
    }

}

/*
 * Compile time polymorphism demo
 */
class RunComputer {
    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.browseTheInternet();
        computer.browseTheInternet("www.github.com");

    }
}
