import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();

        }

        Arrays.sort(arr,new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2){
                if(Integer.parseInt(s1[0]) == Integer.parseInt(s2[0])){
                    if(Integer.parseInt(s1[1]) > Integer.parseInt(s2[1])){
                        return 1;
                    } else if(Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])){
                        return 0;
                    } else {
                        return -1;
                    }
                }
                else {
                    return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
                }   
            }
        });

        for(int i=0;i<N;i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
