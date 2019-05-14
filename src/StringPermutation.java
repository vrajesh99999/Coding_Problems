import java.util.ArrayList;

public class StringPermutation {
    public static ArrayList<String> permutation(String s){
        ArrayList<String> result = new ArrayList<>();
        result = permute("",s,result);
        return result;
    }
    public static ArrayList<String> permute(String prefix,String suffix, ArrayList<String> result){
        if(suffix.length()==0){
            result.add(prefix);
        }else{
            for(int i=0;i<suffix.length();i++){
                permute(prefix+suffix.charAt(i),suffix.substring(0,i)+suffix.substring(i+1,suffix.length()),result);
            }
        }
        return result;
    }
    public static void main(String args[]){
        ArrayList<String> result = permutation("ABC");
        System.out.println(result);
    }


}
