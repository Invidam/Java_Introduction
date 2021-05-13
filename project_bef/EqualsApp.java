package project;

public class EqualsApp {
    public static void main(String[] args)
    {
        int p1 = 1;
        int p2 = 1;
        if(p1 == p2)
            System.out.println("Hello, Primative!");
        String s1 = new String("qwer");
        String s2 = new String("qwer");
        
        
        if(s1 == s2) 
            System.out.println("Hello, Non Primative!");
    }
}
