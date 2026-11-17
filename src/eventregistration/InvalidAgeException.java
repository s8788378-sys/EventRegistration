package eventregistration;
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String name, int age) {
   super("Sorry " + name + ", age " + age + " is not allowed. You must be 18 or older.");
    }
}
