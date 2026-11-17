
package eventregistration;


public class EventRegistration {

 
    public static void main(String[] args) {
WorkshopRegistration system = new WorkshopRegistration();

    try {
   System.out.println("Processing workshop registration...");
   system.registerParticipant("Sara", 16);
    } 
    catch (InvalidAgeException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}  
