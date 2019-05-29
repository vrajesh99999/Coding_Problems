import java.util.ArrayList;
//will not handle duplicates
public class StringPermutation {
    public static ArrayList<String> permutationForString(String s){
        ArrayList<String> result = new ArrayList<>();
        result = permuteOnlyForString("",s,result);
        return result;
    }// this function is only works for string(Because it is mutable) not for array numbers
    public static ArrayList<String> permuteOnlyForString(String prefix,String suffix, ArrayList<String> result){
        if(suffix.length()==0){
            result.add(prefix);
        }else{
            for(int i=0;i<suffix.length();i++){
                permuteOnlyForString(prefix+suffix.charAt(i),suffix.substring(0,i)+suffix.substring(i+1,suffix.length()),result);
            }
        }
        return result;
    }
    public static void main(String args[]){
        ArrayList<String> result = permutationForString("AA");
        System.out.println(result);
    }
}
