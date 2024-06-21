import java.util.Scanner;

public class N_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //시험 과목 개수
        int A[] = new int[N]; //점수
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        long max = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];
            sum += A[i]; //총 합 구하기
        }
        System.out.println(sum*100.0/max/N);
    }
}
