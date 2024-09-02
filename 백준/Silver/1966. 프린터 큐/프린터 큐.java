import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();

        PriorityQueue<Integer> prque = new PriorityQueue<>(Collections.reverseOrder());
            
            st = new StringTokenizer(br.readLine());
            for(int j =0; j< N; j++){
                int a = Integer.parseInt(st.nextToken());
                
                queue.add(new int[] {a , j});
                prque.add(a);
            }
            
            int count = 0;
            while(!queue.isEmpty()){
                int[] arr = queue.poll();
                if(arr[0] == prque.peek()){
                    prque.poll();
                    count++;

                    if(arr[1] == M){
                        break;
                    }
                }
                else{
                    queue.add(arr);
                }
            }
            System.out.println(count);
        }
    }
}
