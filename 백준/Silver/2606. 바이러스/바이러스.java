import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] virus;
    static int node,line,count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        arr = new int[node+1][node+1];
        virus = new boolean[node+1];
        
        for(int i=0; i<line; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(1);
        System.out.println(count);

    }

    static void dfs(int a){
        virus[a] = true;

        for(int i=1; i<=node; i++){
            if(arr[a][i] == 1 && !virus[i]){
                dfs(i);
                count++;
            }
        }
    }
}
