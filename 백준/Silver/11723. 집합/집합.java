import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] bool = new boolean[M];
        int a;

        while(M-- > 0){
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            switch(str){
                case "add":
                    a = Integer.parseInt(st.nextToken());
                    if(!list.contains(a)){
                        list.add(a);
                    }
                    break;
                
                case "remove":
                    a = Integer.parseInt(st.nextToken());
                    if(list.contains(a)){
                        list.remove(list.indexOf(a));
                    }
                    break;

                case "check":
                    a = Integer.parseInt(st.nextToken());
                    if(list.contains(a)){
                        sb.append(1).append("\n");
                    }
                    else{
                        sb.append(0).append("\n");
                    }
                    break;

                case "toggle":
                    a = Integer.parseInt(st.nextToken());
                    if(list.contains(a)){
                        list.remove(list.indexOf(a));
                    }
                    else{
                        list.add(a);
                    }
                    break;
                case "all":
                    list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));

                    break;
                case "empty":
                    list.clear();

                    break;  
            }
            
        }
        System.out.println(sb);
    }
}
