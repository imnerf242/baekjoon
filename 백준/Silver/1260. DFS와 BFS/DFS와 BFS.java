import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] tf;
    static int N,M,V;
    static StringBuilder sb_dfs= new StringBuilder();
    static StringBuilder sb_bfs= new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        arr = new int[1001][1001];
        tf = new boolean[1001]; 

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        dfs(V);
        System.out.print(sb_dfs);

        System.out.println();

        tf = new boolean[1001];
        bfs(V);

        System.out.print(sb_bfs);

        
    }

    static void bfs(int a) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(a);
        tf[a] = true;

        sb_bfs.append(a).append(" ");
        while(!queue.isEmpty()){
            int temp = queue.poll();

            for(int i =1; i <= N; i++){
                if(arr[temp][i] == 1 && !tf[i]){
                    queue.offer(i);
                    tf[i] = true;
                    sb_bfs.append(i).append(" ");
                }
            }
        }

    }

    static void dfs(int a){
        tf[a] = true;
        sb_dfs.append(a).append(" ");

        for(int i = 1; i<= N; i++){
            if(arr[a][i] == 1 && !tf[i]){
                tf[i] = true;

                dfs(i);
            }
        }

    }
}
