import java.util.Scanner;
public class t{
    public static void main (String []arge){
        float x,y;
        String o,q;
        while (true){
            Scanner num =new Scanner(System.in);
            Scanner op  =new Scanner(System.in);
            System.out.print("input 1num =  ");
            x= num.nextFloat();
            System.out.print("input the op =  ");
            o=op.next();
            System.out.print("input 2num =  ");
            y= num.nextFloat();
            if(o.equals("+")){
                System.out.println(x+y);
            }
            else if(o.equals("-")){
                System.out.println(x-y);
            }
            else if(o.equals("*")){
            System.out.println(x*y);
            }
            else if(o.equals("/")){
                System.out.println(x/y);
            }   
            System .out.print("again  =  ");
            Scanner a = new Scanner(System.in);
            q=a.next();
            if (q.equals("no")){
                System.out.println("thankes ");
                break;
            }
      }      
    }
}