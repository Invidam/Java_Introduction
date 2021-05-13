package project;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OKJavaGoinHome {
    
    public static void main(String[] args) {
        
        // Elevator call
        Elevator myElevator = new Elevator("HWAPO APT 608");
        myElevator.callForUp(1);
        
        // Security off
        Security mySecurity = new Security("HWAPO APT 608");
        mySecurity.off();
        
        // Light on
        Lighting hallLamp = new Lighting("HWAPO APT 608 / Hall Lamp");
        hallLamp.on();
        
    }
}
