package project;

public class IfApp {
    public static void main(String[] args)
    {
        String id = "Invidam";
        String passwd = "q1w2e3r4!";
        System.out.println("Hello, World!");
        String inputId = args[0];
        String inputPasswd = args[1];
        //if(inputId == MASTER)
        if(!inputId.equals(id))
            System.out.println("who are u?");
        else if(inputPasswd.equals(passwd))
            System.out.println("Hi master ^0^");
        else 
            System.out.println("are u master?");
    }
}
