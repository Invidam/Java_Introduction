package project;

public class variable{
    public static void main(String[] args) {
        int a = 1; // number (integer)
        System.out.println(a);
        double b = 1;
        System.out.println(b);
        
        int d = (int)1.0;
        String s = Integer.toString(a);
        s = s + 1;
        System.out.println(s.getClass());
    }
}