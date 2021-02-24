package project;

public class LoopApp {
    public static void main(String[] args)
    {
        int i = 0;
        while(i < 5)
        {
            System.out.println(++i + "번");
        }
        for(i=0; i<5;++i)
            System.out.println((i+1) + "번");
        
        
    }
}
