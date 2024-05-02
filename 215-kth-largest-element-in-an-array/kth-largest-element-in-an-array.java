class Solution {
    public int findKthLargest(int[] nums, int k) {


    //    Arrays.sort(nums);


        

    //     return nums[nums.length-k];

    //Above method is correct but they said without sorting so lets see
    //when we here about largest or smallest elements we want to use heap ds
    //https://chat.openai.com/c/df825d62-c478-4ad8-9b29-70bda1abc809
    PriorityQueue<Integer> queue=new PriorityQueue<>();
    //System.out.println("queue"+queue);
    for(int i:nums){
       // System.out.print("i "+i);
        queue.add(i);
        //System.out.print("queue add :"+queue);
        if(queue.size()>k){
            //System.out.print("size :"+queue.size());
            queue.remove();

           // System.out.print("queue remove :"+queue.remove());
        }
    } 

    return queue.remove();


        
    }
}