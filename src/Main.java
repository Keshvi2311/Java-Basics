import java.util.Scanner;



public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        var a = 2;
        var b = 40;

        var sum = a+b;
        System.out.println("Sum is : " + sum);

        if (sum > 50) {
            System.out.println("System generated the sum greater than 50");
        }

        else {
            System.out.println("System generates the sum less than 50");
        }

        for(int i = 0 ; i<=20 ; i++){
            System.out.println(i);
        }

        System.out.println(a*b);

        if (a%2 == 0) {
            System.out.println(a + " is even number");
        }
        else if (a%2 != 0){
            System.out.println(a + " is odd number");
        }
        else {
            System.out.println(a + " is nothing");
        }

        int x =10;
        int y = 500;
        int z = 1000;

        if (x>y){
            if (x>z){
                System.out.println(x + " is largest");
            }
            else{
                System.out.println(z + " is largest");
            }
        }
        else{
            if(y>z){
                System.out.println(y + " is largest");
            }
            else{
                System.out.println(z + " is largest");
            }
        }


//        int year = 2005;
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println(year + " is leap year");
        }
        else {
            System.out.println(year + " is non leap year");
        }

        int marks = 80;

        if (marks >= 90) {
            System.out.println(marks + " is >= 90 so you got A+");
        }
        else if (marks >= 80 && marks < 90){
            System.out.println(marks + " is >= 80 so you got B+");
        }
        else if (marks >= 70 && marks < 80){
            System.out.println(marks + " is >= 70 so you got C+");
        }
        else if (marks >= 60 && marks < 70){
            System.out.println(marks + " is >= 60 so you got D+");
        }
        else {
            System.out.println(marks + " is < 60 so you failed");
        }

        int number = -8;

        if (number < 0){
            System.out.println(number + " is negative");
        }
        else if (number > 0){
            System.out.println(number + " is positive");
        }
        else{
            System.out.println(number + " is zero");
        }

        System.out.println("Enter a number");
        float num = sc.nextFloat();

        if (num  >= 90) {
            System.out.println(num + " is >= 90 so you got A+");
        }
        else if (num >= 80 && num < 90){
            System.out.println(num + " is >= 80 so you got B+");
        }
        else if (num >= 70 && num < 80){
            System.out.println(num + " is >= 70 so you got C+");
        }
        else if (num >= 60 && num < 70){
            System.out.println(num + " is >= 60 so you got D+");
        }
        else {
            System.out.println(num + " is < 60 so you failed");
        }

        System.out.println("Enter number for factorial:");
        int fact = sc.nextInt();

        if (fact < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            int factorial = 1;
            while (fact > 0) {
                factorial = factorial * fact;
                fact--;
            }
            System.out.println("Factorial is: " + factorial);
        }


        System.out.println("Enter P");
        int p = sc.nextInt();
        System.out.println("Enter q");
        int q = sc.nextInt();
        System.out.println("Enter symbol");
        char r = sc.next().charAt(0);;

        switch (r){
            case '+' : {
                System.out.println(p+q);
                break;
            }
            case '-' : {
                System.out.println(p-q);
                break;
            }
            case '*' : {
                System.out.println(p*q);
                break;
            }
            case '/' : {
                if (q != 0) {
                    System.out.println("Result: " + (p / q));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            }
            default:
                System.out.println("Invalid operator");

        }


    }
}