import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static int M,N;
    static int[][] bug;
    static boolean[][] visit;
    
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int TestCase = Integer.parseInt(br.readLine());

        for(int c = 0; c < TestCase; c++){
            int count = 0;
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            bug = new int[M][N];
            visit = new boolean[M][N];

            int K = Integer.parseInt(st.nextToken());

            for(int i = 0; i < K; i++){
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                bug[X][Y] = 1;
            }

            for(int i = 0; i < M; i++){
                for (int j = 0; j < N; j++){
                    if(bug[i][j] == 1 && !visit[i][j]){
                        bfs(i,j);

                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[] {x, y});

        while(!queue.isEmpty()){
            int X = queue.peek()[0];
            int Y = queue.peek()[1];

            visit[X][Y] = true;
            queue.poll();

            for(int i = 0; i < 4; i++){
                int cx = X + dx[i];
                int cy = Y + dy[i];

                if(cx >= 0 && cy >= 0 && cx < M && cy < N ){
                    if(!visit[cx][cy] && bug[cx][cy] == 1){

                        queue.offer(new int[] {cx,cy});
                        visit[cx][cy] = true;
                    }
                }
            }
        }
    }
}