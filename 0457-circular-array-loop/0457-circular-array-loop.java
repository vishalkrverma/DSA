class Solution {

    private int nextIndex(int[] nums, int current){
        int n = nums.length;
        return ((current + nums[current]) % n + n) % n; // handle negative moves
    }

    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0) continue;

            int slow = i, fast = i;
            boolean forward = nums[i] > 0;

            while(true){
                // move slow one step
                int nextSlow = nextIndex(nums, slow);
                if(nums[nextSlow] == 0 || (nums[nextSlow] > 0) != forward) break;

                // move fast one step
                int nextFast = nextIndex(nums, fast);
                if(nums[nextFast] == 0 || (nums[nextFast] > 0) != forward) break;

                // move fast second step
                nextFast = nextIndex(nums, nextFast);
                if(nums[nextFast] == 0 || (nums[nextFast] > 0) != forward) break;

                slow = nextSlow;
                fast = nextFast;

                if(slow == fast){
                    // check for loop length > 1
                    if(slow == nextIndex(nums, slow)) break;
                    return true;
                }
            }

            // mark all nodes along this path as 0 to prevent revisiting
            int index = i;
            while(nums[index] != 0 && (nums[index] > 0) == forward){
                int next = nextIndex(nums, index);
                nums[index] = 0;
                index = next;
            }
        }

        return false;
    }
}
