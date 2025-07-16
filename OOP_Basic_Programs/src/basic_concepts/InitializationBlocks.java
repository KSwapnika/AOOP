package basic_concepts;

class Demo {
    static 
    {
        System.out.println("Static Block"); // runs only once when class is loaded
    }

    {
        System.out.println("Instance Block"); // runs every time object is created
    }

    Demo() {
        System.out.println("Constructor");
    }
}
public class InitializationBlocks {

	    public static void main(String[] args) {
	        new Demo();
	        new Demo();
	    }

}
