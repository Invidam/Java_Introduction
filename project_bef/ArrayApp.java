package project;

public class ArrayApp {
    public static void main(String[] args)
    {
        
        int[] arr = {1,2,3};
        System.out.println(arr[1]);
        System.out.println(arr.length);
        
        String[] users = new String[3];
        users[0] = "hsp";
        users[1] = "invidam";
        users[2] = "anac";
        
        for(int i=0;i<users.length;++i)
            System.out.println("<li>" + users[i] + "</li>");
    }
}
