import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> que = new LinkedList<>();

        for(int i = 0; i < N; i++){
            que.offer(i+1);
        }

        while(que.size() > 1){
            que.poll();

            int temp = que.poll();
            que.add(temp);
        }

        System.out.println(que.poll());
    }
}
