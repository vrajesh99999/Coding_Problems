import java.util.ArrayList;
// this function will not handle duplicates
public class numberArrayPermutation {
    public static ArrayList<int[]> permutationNumbers(int a[]){
        ArrayList<int[]> result =  new ArrayList<>(); // result
        result = permuteNumbers(a, 0, result);
        return result;
    }
    public static ArrayList<int[]> permuteNumbers(int a[],int start,ArrayList<int[]> result){
        if(start>=a.length){
            result.add(a.clone()); // using clone to add because we are using same reference
        }else{
            for(int i=start;i<a.length;i++){
                swap(a,start,i);
                permuteNumbers(a,start+1,result);
                swap(a,start,i); // swap again because using same array next
                // time sp place swapped elements to its correct positions
            }
        }
        return result;
    }
    private static void swap(int[] a, int start, int i) {
        int temp = a[start];
        a[start] = a[i];
        a[i] = a[start];
    }

    public static void main(String args[]){
        int a[]={1,2,3,4};
        ArrayList<int[]> result = permutationNumbers(a);
            System.out.println(result.size());


    }
}
