import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UniqueAndRefactor {
    public static void main(String[] args) {
        String str="rahahullau";

//        Method 1
        Set<Character> uni= new LinkedHashSet<>();
        Set<Character> dup= new LinkedHashSet<>();
        for(int i=0;i< str.length();i++){
            if(uni.contains(str.charAt(i))){
                if(!dup.contains(str.charAt(i)))
                    dup.add(str.charAt(i));
            }else {
                uni.add(str.charAt(i));
            }
        }

        System.out.println(uni);
        System.out.println(dup);

//        Method 2
        Map<Character,Integer> nofDup=new LinkedHashMap<>();
        for(int i=0;i< str.length();i++){
            if(!nofDup.containsKey(str.charAt(i))){
                nofDup.put(str.charAt(i),1);
            }else{
                nofDup.put(str.charAt(i),nofDup.get(str.charAt(i))+1);
            }
        }
        System.out.println(nofDup);

    }
}