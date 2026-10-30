import java.util.Scanner;

public class Homework4 {

    int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        int small = m;
        int large = n;
        if (n < m) {
            small = n;
            large = m;
        }
        return gcd(small, large % small);
    }


    int gcdLoop(int m, int n) {
        int a = m;
        int b = n;
        while (b != 0) {
            int small = a;
            int large = b;
            if (b < a) {
                small = b;
                large = a;
            }
            a = small;
            b = large % small;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Homework4 h = new Homework4();
        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("두 수의 최대공약수는 " + h.gcd(m, n) + "입니다.");
        System.out.println("(반복문 버전: " + h.gcdLoop(m, n) + ")");
    }
}