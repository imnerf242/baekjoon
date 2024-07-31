import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[][] person = new int[15][15];

        for(int i=0; i<15; i++){
            person[0][i] = i;
            person[i][1] = 1;
        }

        for(int i=1; i<15; i++){ //층
            for(int j=2; j<15; j++){ //호
                person[i][j] = person[i-1][j] + person[i][j-1] ;
            }
        }

        for(int i = 0; i< T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(person[k][n]);
        }

    }
}
