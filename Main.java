import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int num1;
        int num2;
        //1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
        System.out.println("Please enter the first number.");
        num1=s.nextInt();
        System.out.println("Please enter the second number.");
        num2=s.nextInt();
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+"x"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(num1/num2));
        System.out.println(num1+"mod"+num2+"="+(num1%num2));
        System.out.println("-----------------------------------------------");

        //2.Write a Java program to convert a given string into lowercase .
        Scanner s2=new Scanner(System.in);
        System.out.println("Please enter string to convert it into lowercase.");
        String Sentence=s2.nextLine();
        System.out.println("The String after converting\n"+ Sentence.toLowerCase());
        System.out.println("-----------------------------------------------");

        // 3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        Scanner s3=new Scanner(System.in);
        System.out.println("Please enter string");
        String sent=s3.nextLine();
        System.out.println("Please enter the index of the character you want me to print.");
        num1=s3.nextInt();
        if(num1<=sent.length()) {
            System.out.println("the character is :" + sent.charAt(num1));
        }
        else
        {
            System.out.println("enter index less than or equal to "+sent.length());
        }
        System.out.println("-----------------------------------------------");

        /*4.Write a Java program to accept a number and check the number is even or not.
        Prints 1 if the number is even or 0 if the number is odd. (use if-statement)*/
        Scanner s4=new Scanner(System.in);
        int num3;
        System.out.println("Enter a number to check whether it is odd or even.");
        num3=s4.nextInt();
        if ((num3%2)==0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        System.out.println("-----------------------------------------------");

        // 5.Write a program that checks the role of the user
        Scanner s5=new Scanner(System.in);
        System.out.println("Enter your role");
        String role=s5.nextLine();
        if(role.equalsIgnoreCase("admin"))
        {
            System.out.println("welcome admin");
        }
        else if(role.equalsIgnoreCase("user") )
        {
            System.out.println("welcome user");
        }
        else if(role.equalsIgnoreCase("superuser") )
        {
            System.out.println("welcome superuser");
        }
        System.out.println("-----------------------------------------------");

        //6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
        int N1,N2,N3,sum;
        Scanner s6=new Scanner(System.in);
        System.out.println("Please enter the first number.");
        N1=s6.nextInt();
        System.out.println("Please enter the second number.");
        N2=s6.nextInt();
        System.out.println("Please enter the third number.");
        N3=s6.nextInt();
        sum=N1+N2;
        System.out.println("Is the sum of two integers equal to a third integer??\n"+(sum==N3));
        System.out.println("-----------------------------------------------");

        //Take three numbers from the user and print the greatest number.
        int Nm1,Nm2,Nm3;
        Scanner s7=new Scanner(System.in);
        System.out.println("Please enter the first number.");
        Nm1=s7.nextInt();
        System.out.println("Please enter the second number.");
        Nm2=s7.nextInt();
        System.out.println("Please enter the third number.");
        Nm3=s7.nextInt();
       if(Nm1>=Nm2&&Nm1>=Nm3)
        {
            System.out.println("The greatest: "+Nm1);
        }
        else if(Nm2>=Nm1&&Nm2>=Nm3)
        {
            System.out.println("The greatest: "+Nm2);
        }
       else
       {
           System.out.println("The greatest: "+Nm3);
       }
        System.out.println("-----------------------------------------------");
       /*8.Write a Java program that keeps a number from the user
       and generates an integer between 1 and 7 and displays the name of the weekday.
        */
        Scanner s8=new Scanner(System.in);
        System.out.println("Please enter the number of the day of the week that you want");
        int num5=s8.nextInt();
       switch(num5)
       {
           case 1:
               System.out.println("Sunday");
               break;
           case 2 :
               System.out.println("monday");
               break;
           case 3:
               System.out.println("Tuesday");
               break;
           case 4:
               System.out.println("Wednesday");
               break;
           case 5:
               System.out.println("Thursday");
               break;
           case 6:
               System.out.println("Friday");
               break;
           case 7:
               System.out.println("Saturday");
               break;
           default:
               System.out.println("please enter number from 1-7");
               break;

       }
    }
}