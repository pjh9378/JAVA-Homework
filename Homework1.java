//sum+=num   > (sum=sum+num)

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("정수를 입력하세요:");
        int num1=sc.nextInt();
        sum+=num1;
        System.out.printf("현재까지 입력한 정수들의 합:%d\n",sum);

        System.out.println("정수를 입력하세요:");
        int num2=sc.nextInt();
        sum+=num2;
        System.out.printf("현재까지 입력한 정수들의 합:%d\n",sum);

        System.out.println("정수를 입력하세요:");
        int num3=sc.nextInt();
        sum+=num3;
        System.out.printf("현재까지 입력한 정수들의 합:%d\n",sum);

        System.out.println("정수를 입력하세요:");
        int num4=sc.nextInt();
        sum+=num4;
        System.out.printf("현재까지 입력한 정수들의 합:%d\n",sum);

        System.out.println("정수를 입력하세요:");
        int num5=sc.nextInt();
        sum+=num5;
        System.out.printf("현재까지 입력한 정수들의 합:%d\n",sum);



    }
}