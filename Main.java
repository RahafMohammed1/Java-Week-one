import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //        1.Write a program that prints the numbers from 1 to 100 such that:
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("-----------------------------------------------");
//        2.Write a Java program to reverse a string.
        Scanner s1 = new Scanner(System.in);
        String str;
        System.out.println("Please enter a string to reverse it");
        str = s1.nextLine();
        String c = "";
        for (int k = str.length() - 1; k >= 0; k--) {
            c = c + str.charAt(k);

        }
        System.out.println(c);
        System.out.println("-----------------------------------------------");
//        3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
        Scanner s3 = new Scanner(System.in);
        int pi;
        System.out.println("Please enter a positive integer to print the multiplication table of it or 0 for Quit");
        do {
            pi = s3.nextInt();
            if (pi > 0) {
                for (int s = 1; s <= 10; s++) {
                    int multi = s * pi;
                    System.out.println(pi + "X" + s + "=" + multi);
                }
            } else if (pi == 0) {
                break;
            } else {
                System.out.println("the negative number is not valid input please inter positive number or 0 for quite");
            }
        } while (pi != 0 && pi < 0);
        System.out.println("-----------------------------------------------");
//        4.Write a program to find the factorial value of any number entered through the keyboard.
        Scanner s2 = new Scanner(System.in);
        int N;
        int factorial = 1;
        int m = 1;
        System.out.println("Please enter a number to find the factorial value of it or 0 for Quit");
        N = s2.nextInt();
        if (N != 0) {
            while (m <= N) {
                factorial = factorial * m;
                m++;
            }
            System.out.println("the factorial value of " + N + " = " + factorial);
        } else {
            System.out.println("the program is Quit");
        }
//        5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        Scanner s4 = new Scanner(System.in);
        int number;
        int power;
        int result = 1;
        System.out.println("Please enter the number");
        number = s4.nextInt();
        System.out.println("Please enter the power ");
        power = s4.nextInt();
        while (power != 0) {
            result = result * number;
            power--;
        }
        System.out.println("the result = " + result);
        System.out.println("-----------------------------------------------");
//        6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        Scanner s5 = new Scanner(System.in);
        int num;
        int sumeven = 0;
        int sumodd = 0;
        System.out.println("Please enter set of integers and 0 if you want stop entering number");
        do {
            num = s5.nextInt();
            if(num>=0) {
                if (num != 0) {
                    if (num % 2 == 0) {
                        sumeven = sumeven + num;
                    } else {
                        sumodd = sumodd + num;
                    }
                } else {
                    break;
                }
            }else {
                System.out.println("the negative number is not valid input please inter integer number or 0 for quit");
            }

        } while (num != 0);
        System.out.println("sum of even number = " + sumeven);
        System.out.println("sum of odd number = " + sumodd);
        System.out.println("-----------------------------------------------");

//       7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
        Scanner s6 = new Scanner(System.in);
        int num2;
        boolean r=true;
        System.out.println("Please enter an integer number to check if it prime or not");
        num2 = s6.nextInt();
        if (num2 >= 2) {
            for (int n = 2; n <= num2 / 2; n++) {
                if (num2 % n == 0) {
                   r=false;
                   break;
                }else
                {
                    r=true;
                }
                }
        }
        if(r==false) {
            System.out.println("the number is not prim number");
        }else
        {
            System.out.println("the number is a prim number");
        }
        System.out.println("-----------------------------------------------");

//        8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        Scanner s7 = new Scanner(System.in);
        int num3;
        int PC=0;
        int NC=0;
        int zeros=0;
        System.out.println("Please enter any number you want or type 1111 to stop");
        do {
            num3=s7.nextInt();
            if(num3!=1111)
            {
                if(num3>0){PC++;}
                else if (num3<0) {NC++;}
                else if (num3==0) {zeros++;}
            }else {
                break;
            }
        }while (num3!=1111);
        System.out.println("the count of positive = "+PC);
        System.out.println("the count of negative = "+NC);
        System.out.println("the count of zeros = "+zeros);
        System.out.println("-----------------------------------------------");

//        9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
        for(int w=1;w<=4;w++)
        {
            System.out.println("Week "+w);
            for(int d=1;d<=7;d++)
            {
                System.out.println("Day "+d);
            }
        }
//        10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
        Scanner s8 = new Scanner(System.in);
        String word;
        boolean flag=true;
        System.out.println("Please enter a word to check if it a palindrome or not");
        word=s8.nextLine();
        for(int s=0;s<=word.length()-1;s++)
        {
          for(int f=word.length()-1;f>=0;f--)
          {
              if(word.charAt(s)!=word.charAt(f))
              {
                  flag=false;
              }
              else {
                  flag=true;
              }

          }

        }
        if (flag==true) {
            System.out.println("the word is palindrome word");
        } else
        {
            System.out.println("the word is not palindrome");
        }
    }
    }


