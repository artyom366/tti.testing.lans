package linear.sygnal.coding;

import java.util.HashSet;

/**
 * Created by artyom on 15.6.10.
 */
public class Distinct {

    public boolean containsDuplicate(int[] nums) {

        if(nums==null || nums.length==0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }

        return false;
    }
}
