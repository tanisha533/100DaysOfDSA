import java.util.*;
public class f {
    public static int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=nums[0];
        while (slow!=fast){
            slow=nums[slow]; //+1
            fast=nums[fast]; //+1
           }
           return slow;

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,5,3};
        System.out.println(findDuplicate(arr));

    }
}
