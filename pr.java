 import java.util.Scanner;
public class pr {
public static void main( String []arge){
    System.out.print("input your name:  ");
    Scanner n=new  Scanner (System.in);
    Scanner i=new  Scanner (System.in);
    String name =n .next();
    System.out.print("input your age:  ");
    int age =i .nextInt();
    System.out.print("input your film Type(action , horror , comedy)  :  ");
    String t =n .next();
    if (age<18){
       if (t .equals("horror")  || t.equals("actoin") ){
            System.out.println("you are below age");}
        else{
                    System.out.print("do you have sale card : (y/n)");
        String s=n.next();
        if(s.equals("y")){
            System.out.println("you have 50% sale your ticket =50 pe"); 
        }
        else {
            System.out.println("your ticket =100 pe");
        }
        System.out.println("are you sure : (y/n)");
        String q= n.next();
        if(q.equals("y")){
            System.out.println("thankes  \n your name is:  "+ name+"\nyour age is :   "+age+"\n your Type of film is: "+t); 
        }
    }
        }
    else{
        System.out.print("do you have sale card : (y/n)");
        String s=n.next();
        if(s.equals("y")){
            System.out.println("you have 50% sale your ticket =50 pe"); 
        }
        else {
            System.out.println("your ticket =100 pe");
        }
        System.out.println("are you sure : (y/n)");
        String q= n.next();
        if(q.equals("y")){
            System.out.println("thankes  \n your name is:  "+ name+"\nyour age is :   "+age+"\n your Type of film is: "+t); 
        }
    }
}
   }





