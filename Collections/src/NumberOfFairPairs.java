import java.util.Arrays;

public class NumberOfFairPairs {

    public static void main(String[] args) {

        System.out.println(countFairPairs(new int[]{1,7,9,2,5},11,11));

    }

    public static long countFairPairs(int[] nums, int lower, int upper) {


        Arrays.sort(nums);
       for(int e :nums ){
           System.out.print(e+" ");
       }
        System.out.println();
        System.out.println("========================");

        long count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]>=lower && nums[i]+nums[j]<=upper){
                    count++;
                }
            }


        }
        return count;



    }
}
