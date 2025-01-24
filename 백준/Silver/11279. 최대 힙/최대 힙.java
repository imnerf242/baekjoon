import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int a  = Integer.parseInt(br.readLine());
            switch (a) {
                case 0:
                    if(!queue.isEmpty()){
                        int b = queue.poll();
                        System.out.println(b);
                    }
                    else{
                        System.out.println(0);
                    }
                    
                    break;
                
                default:
                    queue.add(a);
                    break;
            }
        }
    }
}
