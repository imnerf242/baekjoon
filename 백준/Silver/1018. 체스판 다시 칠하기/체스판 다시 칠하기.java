import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        arr = new boolean[M][N];

        for(int i=0; i<M; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true; // W일때
                }
                else{
                    arr[i][j] = false; // B일때 
                }
            }
        }

        int M_row = M-7;
        int N_col = N-7;

        for(int i=0; i<M_row; i++){
            for(int j=0; j<N_col; j++){
                findmin(i,j);
            }
        }
        System.out.println(min);
   }
   public static void findmin(int x,int y){
    int count = 0 ;
    int end_x = x + 8;
    int end_y = y + 8;

    boolean xy = arr[x][y];

    for (int i=x; i<end_x; i++){
        for(int j=y; j<end_y; j++){
            if(arr[i][j] != xy){
                count++;
                }

            xy = !xy;
            }
        xy = !xy;
        }

        count = Math.min(count, 64-count);

        min = Math.min(min, count);
   }
}
