import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_004 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int arrNo = Integer.parseInt(stringTokenizer.nextToken()); //2차원 배열 크기
        int qNo = Integer.parseInt(stringTokenizer.nextToken()); //질의 개수

        int[][] A = new int[arrNo+1][arrNo+1];
        for(int i = 1; i <=arrNo; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= arrNo; j++){
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        int[][] D = new int[arrNo+1][arrNo+1];
        for(int i = 1; i <=arrNo; i++){
            for (int j = 1; j <= arrNo; j++){
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }
        for (int q = 0; q < qNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            int sum = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            System.out.println(sum);
        }
    }
}
