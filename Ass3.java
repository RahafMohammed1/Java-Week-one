import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Ass3 {
    public static void main(String[] args) {
        //1.Write a Java program to test if the first and the last element of an array of integers are same.The length of the array must be greater than or equal to 2
        int[] arr = {1, 2, 3, 4, 5, 6, 5};
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println(Arrays.toString(arr));
            System.out.println("the first and the last element of the array are same.");
        } else {
            System.out.println(Arrays.toString(arr));
            System.out.println("the first and the last element of the array are not same.");
        }
        System.out.println("-----------------------------------------------");

        //2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
        int[] arr1 = {1, 4, 17, 7, 25, 3, 100};
        int k;
        Scanner s1 = new Scanner(System.in);
        System.out.println("please enter number k(1-6) to find the k largest elements in a given array");
        k = s1.nextInt();
        int[] arrmax = new int[k];
        for (int i = 0; i < k; i++) {
            int max = arr1[0];
            int index = 0;
            for (int j = 1; j < arr1.length; j++) {
                if (arr1[j] > max) {
                    max = arr1[j];
                    index = j;

                }
            }
            arr1[index] = 0;
            arrmax[i] = max;
        }
        System.out.println("max= " + Arrays.toString(arrmax));
        System.out.println("-----------------------------------------------");

        //3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        int[] arr2 = {1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        for (int m = 0; m < arr2.length; m++) {
            sum = sum + arr2[m];
        }
        int avrage = sum / arr2.length;
        ArrayList<Integer> ag = new ArrayList();

        for (int v = 0; v < arr2.length; v++) {
            if (arr2[v] > avrage) {
                ag.add(arr2[v]);
            }

        }
        System.out.println("the Array" + Arrays.toString(arr2));
        System.out.println("the avrage = "+avrage);
        System.out.println("the numbers greater than avrage:" + ag);
        System.out.println("-----------------------------------------------");
        //4.Write a Java program to get the larger value between first and last element of an array of integers.
        int[] arr3 = {20, 30, 40};
        if (arr3[0] > arr3[arr3.length - 1]) {
            System.out.println("the Array" + Arrays.toString(arr3));
            System.out.println("Larger value between first and last element:" + arr3[0]);
        } else {
            System.out.println("the Array" + Arrays.toString(arr3));
            System.out.println("Larger value between first and last element: (" + arr3[arr3.length - 1] + " )");
        }
        System.out.println("-----------------------------------------------");

        //5.Write a Java program to swap the first and last elements of an array and create a new array.
        int[] arr4 = {20, 30, 40};
        System.out.println("the array before swapping\n"+Arrays.toString(arr4));
        int ele1;
        int ele2;
        ele1 = arr4[0];
        ele2 = arr4[arr4.length - 1];
        arr4[0] = ele2;
        arr4[arr4.length - 1] = ele1;
        int[] arr5=arr4;
        System.out.println("New array after swapping the first and last elements:");
        System.out.println(Arrays.toString(arr5));
        System.out.println("-----------------------------------------------");

//        6.Write a Java program to find all of the longest word in a given dictionary.
        String[] str = {"cat", "dog", "red", "is", "am" };
        ArrayList<String> a = new ArrayList();
        int maximum = str[0].length();
        for (int h = 0; h < str.length; h++) {
            if (str[h].length() >= maximum) {
                maximum = str[h].length();
                a.add(str[h]);
            }
        }
        System.out.println(" the dictionary: "+Arrays.toString(str));
        System.out.println("the longest word in it Result: "+a);
        System.out.println("-----------------------------------------------");

       // 7.Write a menu driven Java program with following option:
        int num;
        int num1;
        int size;
        Scanner s2 = new Scanner(System.in);
        System.out.println("please enter the size of array");
        size=s2.nextInt();
        int[]list=new int[size];
        do {
            System.out.println("please enter number from menue\n1.Accept elements of an array\n2.Display elements of an array\n3.Search the element within array\n4.Sort the array\n5.To Stop");
            num=s2.nextInt();
            if(num==1)
            {
                System.out.println("please enter integer as elements of array");
                for(int u=0;u<list.length;u++){
                    num1=s2.nextInt();
                    list[u]=num1;
            }} else if (num==2) {
                System.out.println("the Array :"+Arrays.toString(list));
            } else if (num==3) {
                int ese=0;
                System.out.println(" please enter element to Search it  within array");
                ese=s2.nextInt();
                int flag=0;
                for(int x=0;x<size;x++)
                {
                    if(list[x]==ese)
                    {
                        flag=1;
                        break;
                    }else
                    {
                        flag=0;
                    }
                }
                if(flag==1) {
                    System.out.println(ese + " is found in array ");
                } else
                {
                    System.out.println(ese + " is not found in array ");
                }

            } else if (num==4) {
                System.out.println(" the Array before sorting : "+Arrays.toString(list));
               for(int i=0;i<list.length;i++)
               {
                   for(int j=i+1;j<list.length;j++)
                   {
                       int tmp=0;
                       if(list[i]>list[j])
                       {
                           tmp = list[i];
                           list[i] = list[j];
                           list[j] = tmp;
                       }
                   }
               }
                System.out.println(" the Array after sorting : "+Arrays.toString(list));
            } else if (num==5) {
              break;
            }else
            {
                System.out.println("the number from menu it's onlly allowed ");
            }

        }while (num!=5);
        System.out.println("-----------------------------------------------");

        //8. Write a program thats displays the number of occurrences of an element in the array.
        int digit=0;
        int[]arrt={1,1,1,3,3,5};
        System.out.println(" the Array : "+Arrays.toString(arrt));
        for(int d=0;d< arrt.length;d++)
        {
            int count=0;
            if(arrt[d]!=digit) {
                for (int s = 0; s < arrt.length; s++) {
                    if(arrt[d]==arrt[s])
                    {
                        count++;
                        digit=arrt[d];

                    }

                }
                System.out.println(digit +" occurs "+count+" times");
            }

        }
        System.out.println("-----------------------------------------------");

//9. Write a program that places the odd elements of an array before the even elements.
        Scanner s3= new Scanner(System.in);
        ArrayList<Integer>aar=new ArrayList();
        ArrayList<Integer>apos=new ArrayList();
        ArrayList<Integer>aneg=new ArrayList();
        int n;

        System.out.println("enter a 7 positiv or nrgativ integars or zeros ");
        for (int i=0;i<7;i++) {
            n= s3.nextInt();
            if (n >= 0) {
                apos.add(n);
            }else
            {
                aneg.add(n);
            }
        }
        for (int element :aneg)
        {
            aar.add(element);
        }
        for (int element :apos) {
            aar.add(element);
        }

        System.out.println( "the array after places the odd elements of an array before the even elements: \n"+aar);
        System.out.println("-----------------------------------------------");

                //10. Write a program that test the equality of two arrays.
                int[] arrone = {2, 3, 6, 6, 4};
                int[] arrtow = {2, 3, 6, 6, 4};
                System.out.println("is the array : " + Arrays.toString(arrone) + "\nand the Array : " + Arrays.toString(arrtow) + "\nequal to each other? ");
                boolean flag = true;
                for (int i = 0; i < arrone.length; i++) {
                    if (arrone[i] == arrtow[i]) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
                if (flag == true) {
                    System.out.println("(true)the tow arrays is equal to each other");
                } else {
                    System.out.println("(false) the tow arrays is not equal to each other");
                }
            }
        }

