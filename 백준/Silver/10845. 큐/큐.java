import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            String st1 = st.nextToken();

            if(st1.equals("push")){
                int st2 = Integer.parseInt(st.nextToken());
                queue.add(st2);
            }

            if(st1.equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    int pop = queue.poll();
                    sb.append(pop).append("\n");
                }

            }
            
            if(st1.equals("size")){
                int size = queue.size();
                sb.append(size).append("\n");
            }

            if(st1.equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }

            if(st1.equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    int front = queue.peek();
                    sb.append(front).append("\n");
                }
            }

            if(st1.equals("back")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    int back = ((LinkedList<Integer>) queue).getLast();
                    sb.append(back).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
