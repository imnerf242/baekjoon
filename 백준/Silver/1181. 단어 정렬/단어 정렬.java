import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<String>();
        for(int i=0; i<num; i++){
            set.add(br.readLine());
        }

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }

        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                int s1 = o1.length();
                int s2 = o2.length();

                if(s1>s2){
                    return 1;
                }
                else if(s1<s2){ 
                    return -1;
                }
                else {
                    int headValue =o1.compareTo(o2);
                    return headValue;
                }

            }

        });

        for(String s:list){
            System.out.println(s);
        }
    }
}