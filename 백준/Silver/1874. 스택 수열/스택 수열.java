import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        boolean check = true;
        while(n-->0){
            int num = Integer.parseInt(br.readLine());

            if(stack.isEmpty()){
                stack.push(count);
                sb.append("+\n");
                count++;
            }

            if(stack.peek() < num){
                while (stack.peek() < num){
                    stack.push(count);
                    sb.append("+\n");
                    count++;
                }
            }

            if(stack.peek() == num){
                sb.append("-\n");
                stack.pop();
            }

            else{
                check = false;
            }

        }

        if(check == false){
            sb.setLength(0);
            sb.append("NO");
        }
        
        System.out.println(sb);
    }
}

