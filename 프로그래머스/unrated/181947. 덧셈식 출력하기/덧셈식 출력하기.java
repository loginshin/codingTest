import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 두 정수 a와 b 입력받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 입력 받은 두 정수를 더하여 결과를 출력
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);

        // 스캐너 닫기
        sc.close();
    }
}
