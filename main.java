import java.util.Scanner;
public class main
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int x=in.nextInt();    
        switch(x)
        {
            case 0:{System.out.println("Wybrales 0");break;}
            case 1:{System.out.println("Wybrales 1");break;}
            case 2:{System.out.println("Wybrales 2");break;}
            case 3:{System.out.println("Wybrales 3");break;}
            case 4:{System.out.println("Wybrales 4");break;}
            default:{System.out.println("Nie wybrales nic");break;}

        }
    }
}
