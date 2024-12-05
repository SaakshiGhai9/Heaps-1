import java.util.PriorityQueue;
import java.util.Comparator;

public class KthLargestElementUsingMaxHeap {
    public static int KthLargestMax(int[] nums, int k) {
        int n = nums.length;
        int capacity = n - k + 1; // Max-Heap size should be n - k + 1

        // Create a max-heap with custom comparator for descending order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a; // Sort in descending order
            }
        });

        // Add elements to the heap
        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > capacity) {
                maxHeap.poll(); // Remove the largest element if size exceeds
            }
        }

        // The root of the heap is the k-th largest element
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 3;
        System.out.println("The " + k + "-th largest element is: " + KthLargestMax(nums, k));
    }
}
