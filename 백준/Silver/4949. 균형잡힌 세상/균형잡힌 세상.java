import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();    
        
        while(true){
            String s = br.readLine();
            
            Stack<Character> stack = new Stack<>();

            if(s.equals(".")){
                break;
            }
            
            for(int i =0; i < s.length(); i++){
                char ch = s.charAt(i);

                if(ch == '(' || ch =='['){
                    stack.push(ch);
                }

                else if( ch == ')' ){
                    if(stack.isEmpty()){
                        stack.push(ch);
                        break;
                    }
                    else {
                        if(stack.peek() == '('){
                            stack.pop();
                        }
                        else{
                            break;
                        }
                    }
                }
                else if( ch == ']' ){
                    if(stack.isEmpty()){
                        stack.push(ch);
                        break;
                    }
                    else {
                        if(stack.peek() == '['){
                            stack.pop();
                        }
                        else{
                            break;
                        }
                    }
                }
            }
            if(stack.isEmpty()){
                sb.append("yes").append("\n");
            }
            else{
                sb.append("no").append("\n");
            }

        }
        System.out.println(sb);
       
    }
}
