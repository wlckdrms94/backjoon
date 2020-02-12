import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originNumber = sc.nextInt(); // 최초값 받아오기 ex ) 26
        int left = originNumber / 10; // 2 저장
        int right = originNumber % 10; // 6 저장

        int cycleResult = 0; // 사이클 돈 횟수 구하기
        int A = originNumber / 10; // A 에 저장된 값에서 10을 나눠서 B에 저장 앞쪽값은 한번만 구하면 된다
        int B = originNumber % 10; // 저장
        int C,D;
        while (true) {
            cycleResult++; //사이클 1회 추가
            
            C = A + B ; // A+B
            D = C % 10; // C 의 끝자리 구하기
            A = B;
            B = D;
            
            if(A == left && B == right){ // A 와 B 가 원래 숫자와 완벽히 일치할때까지 구해라 이놈아
                System.out.print(cycleResult);
                break;
            }
        }
        sc.close();
    }
}