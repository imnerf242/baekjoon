import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] tree = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(st.nextToken());
            tree[i] = a;
        }

        Arrays.sort(tree);
        System.out.println(binarysearch(M,tree));
    }

    public static int binarysearch(int M, int[] tree){
        int start = 0;
        int end = tree[tree.length - 1];
        int result = 0;

        while(start <= end){
            long sum = 0;
            int mid = (start + end) /2;

            for(int i = 0; i<tree.length; i++){
                if(tree[i] > mid){
                    sum += tree[i] - mid;
                }
            }

            if(sum >= M){
                result = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }  
        return result;
    }
}
