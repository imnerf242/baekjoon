import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] visit;
    static int N,M,V;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        arr = new int[1001][1001];
        visit = new boolean[1001]; 

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

        visit = new boolean[1001];
        System.out.println();
        bfs(V);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visit[start] = true;
        System.out.print(start + " ");

        while(!queue.isEmpty()){
            start = queue.poll();

            for(int i =1; i <= N; i++){
                if(arr[start][i] == 1 && !visit[i]){
                    queue.offer(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }

    }

    static void dfs(int a){
        visit[a] = true;
        
        System.out.print(a + " ");

        for(int i = 1; i<= N; i++){
            if(arr[a][i] == 1 && !visit[i]){
                visit[i] = true;

                dfs(i);
            }
        }

    }
}
