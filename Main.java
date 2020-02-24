import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //숫자를 받겠다 
        int writeNumber = sc.nextInt(); // 처음 받은 숫자를 저장

        int[] area = new int[writeNumber]; // 처음받은 숫자만큼 배열 공간 생성

        for(int i = 0; i < writeNumber; i++){
            area[i] = sc.nextInt(); // 처음 받은 숫자만큼 배열 번호에 맞게 저장
        }

        Arrays.sort(area);
        
        System.out.println(area[0]);
        System.out.println(area[area.length - 1]);

        sc.close();

    }
}