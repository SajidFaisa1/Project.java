package project;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Convert c1= new Convert();
        Interface1 in1=new Interface1();
//        String b= sc.next();

         in1.message();

        int n,x,c;
        n=sc.nextInt();


               do {

                   if ( n==1) {
                  in1.option();

                   x=sc.nextInt();//user input for option selection

                   if(x==1){
                       System.out.println("Enter USD=");
                       c1.usdToBdt();
                   }
                   else if(x==2) {
                       System.out.println("Enter BDT=");
                       c1.bdtToUsd();
                   }
                   else if(x==3) {
                       System.out.println("Enter USD=");
                       c1.usdToInr();

                   }
                   else if (x==4) {
                       System.out.println("Enter INR=");
                       c1.inrToUsd();
                   }
                   else if(x==5){
                       System.out.println("Enter USD=");
                       c1.usdToAud();
                   }
                   else if (x==6){
                       System.out.println("Enter AUD=");
                       c1.audToUsd();
                   }
                   else if (x==7) {
                       System.out.println("Enter USD=");
                       c1.usdToPkr();
                   } else if (x==8) {
                       System.out.println("Enter PKR=");
                       c1.pkrToUsd();

                   }
                   else if (x==9) {
                       System.out.println("Enter USD=");
                       in1.usdToCad();

                   } else if (x==10) {
                       System.out.println("Enter CAD=");
                       in1.cadToUsd();
                   }
                       else if (x==11) {
                       System.out.println("Enter USD=");
                       in1.usdToQar();
                   } else if (x==12) {
                       System.out.println("Enter QAR=");
                       in1.qarToUsd();
                   }
                       else {
                       System.out.println("Invalid Number");
                   }

                   }
                   else {
                       System.out.println("Invalid Number");
                       break;
                   }
                   System.out.println("Press '1' For Main Menu");
                   System.out.println("Press Any Number to exit Exit");

                   c= sc.nextInt();

               }while (c==1);

    }

}


