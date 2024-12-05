//Time complexity : O(n log k ) where k is capcacity of heap and insertion of n elements in the heap takes O(log k) time
// Space complexity : O(K)
import java.util.PriorityQueue;


public class KthLargestElement {
    public static  int findKthLargestLElement(int[] nums, int k){
        // min heap to store only k elements

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for ( int i =0; i < nums.length; i++){
            minHeap.add(nums[i]); // add the current element to the min heap
            // if the size of the  min heap exceed k, remove the smallest element
            if(minHeap.size() >k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args){
        int nums [] = {3,2,3,1,2,4,5,5,6};
        int k = 3;
        System.out.println("The " + k + "-th largest element is: " + findKthLargestLElement(nums, k));
    }

}
