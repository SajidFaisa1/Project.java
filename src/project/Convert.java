package project;
import java.util.Scanner;
public  class Convert{
    Scanner sc=new Scanner(System.in);


    public void usdToBdt(){
        double usd= sc.nextDouble();
        System.out.println("Bangladeshi Tk" + "="+usd*103.2);
    }
    public void bdtToUsd(){
        double bdt= sc.nextDouble();
        System.out.println("American Dollar="+bdt*0.0097);
    }
    public void usdToInr(){
        double usd= sc.nextDouble();
        System.out.println("Indian Rupee="+usd*82.49);


    }
    public void inrToUsd(){
        double inr= sc.nextDouble();
        System.out.println("American Dollar="+inr*0.012);
    }

    public void usdToAud(){
        double usd= sc.nextDouble();
        System.out.println("Australian Dollar="+usd*1.49);
    }
    public void audToUsd(){
        double aud= sc.nextDouble();
        System.out.println("American Dollar="+aud*0.67);
    }
    public  void  usdToPkr(){
        double usd= sc.nextDouble();
        System.out.println("USD to Pakistani Rupee="+usd*224.56);
    }
    public void pkrToUsd(){
        double pkr= sc.nextDouble();
        System.out.println("PKR to American Dollar="+pkr*0.0044);
    }

}

