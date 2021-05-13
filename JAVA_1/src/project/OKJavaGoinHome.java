package project;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
import java.util.Scanner;
public class OKJavaGoinHome {
    
    public static void main(String[] args) {
        
        //String path = JOptionPane.showInputDialog("Enter a path");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        
        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
        
        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();
        
        // Light on
        Lighting hallLamp = new Lighting(id + "/ Hall Lamp");
        hallLamp.on();
        
        Lighting floorLamp = new Lighting(id + "/ floor Lamp");
        floorLamp.on();
    }
}
