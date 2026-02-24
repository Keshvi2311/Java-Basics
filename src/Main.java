public class Main{
    public static void main(String[] args){
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


        int year = 2005;

        if (year %4 == 0){
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

    }
}