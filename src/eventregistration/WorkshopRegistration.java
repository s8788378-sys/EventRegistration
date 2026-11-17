package eventregistration;
public class WorkshopRegistration {
public void registerParticipant(String name, int age) throws InvalidAgeException {
boolean isValidAge = (age >= 18);

    if (!isValidAge) {
        throw new InvalidAgeException(name, age);
    }
    
    System.out.println("Welcome! " + name + " has been registered successfully.");
}
}
