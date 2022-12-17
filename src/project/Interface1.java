package project;
import java.util.Scanner;
public class Interface1 implements More_Currency{
    Scanner sc=new Scanner(System.in);
    public void usdToCad(){
        double usd= sc.nextDouble();
        System.out.println("Canadian Dollar="+usd*1.36);
    }
    public void cadToUsd(){
        double cad= sc.nextDouble();
        System.out.println("American Dollar="+cad*0.73);

    }
    public void usdToQar(){
        double usd= sc.nextDouble();
        System.out.println("Qatari Rial="+usd*3.64);

    }
    public void qarToUsd(){
        double qar= sc.nextDouble();
        System.out.println("American Dollar="+qar*0.27);

    }
    public void message() {


        System.out.println("WELCOME To Currency Converter");
        System.out.println("Enter '1' To Start");



    }
    public void option(){
        System.out.println("Select Any Option");
        System.out.println("1.US Dollar To Bangladeshi Tk");
        System.out.println("2.Bangladeshi Tk TO US Dollar");
        System.out.println("3.US Dollar To Indian Rupee");
        System.out.println("4.Indian Rupee To US Dollar");
        System.out.println("5.US Dollar to Australian Dollar");
        System.out.println("6.Australian Dollar To US Dollar");
        System.out.println("7.US Dollar To Pakistani Rupee");
        System.out.println("8.Pakistani Rupee To US Dollar");
        System.out.println("9.US Dollar to Canadian Dollar");
        System.out.println("10.Canadian Dollar to US Dollar");
        System.out.println("11.US Dollar to Qatari Rial");
        System.out.println("12.Qatari Rial To US Dollar");
    }
//    String b= sc.next();
}
