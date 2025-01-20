import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i< N; i++){
            int a = Integer.parseInt(br.readLine());
            switch (a) {
                case 0:
                    if(minHeap.isEmpty()){
                        System.out.println("0");
                    }
                    else{
                        int b = minHeap.poll();
                        System.out.println(b);
                    }
                    break;
            
                default:
                    minHeap.add(a);
                    break;
            }
        }

       

    }
}
