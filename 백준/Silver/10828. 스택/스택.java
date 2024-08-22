import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stackInt = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String st1 = st.nextToken();

            if(st1.equals("push")){
                int st2 = Integer.parseInt(st.nextToken());

                stackInt.push(st2);
            }

            if(st1.equals("pop")){

                if(stackInt.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    int pop = stackInt.pop();
                    sb.append(pop).append("\n");
                }
                
            }

            if(st1.equals("size")){
                int size = stackInt.size();

                sb.append(size).append("\n");
            }

            if(st1.equals("empty")){
                if(stackInt.isEmpty()){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }

            if(st1.equals("top")){
                if(stackInt.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    int top = stackInt.peek();

                    sb.append(top).append("\n");
                }

            }

        }

        System.out.println(sb);

    }
}
