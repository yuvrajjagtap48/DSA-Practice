// Brute Force Approach
// Time Complexity: O(n^2)

// public class RainWater {
//     public static int maxArea(int height[]) {
//         int max = 0;
//         for(int i=0; i < height.length ; i++){
//             for(int j = i+1; j<height.length; j++){
//                 int breadth = Math.abs(j - i);  //abs => absolute value 
//                 int length = Math.min(height[i], height[j]);
//                 int area = breadth * length;
//                 max = Math.max (area, max);
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int height[] = {1,8,6,2,5,4,8,3,7};
//         System.out.println("The maximum area of water that can be trapped is: " + maxArea(height));
//     }
// }



//Using two pointer approach
// Time Complexity: O(n)

public class RainWater {
    public static int maxArea(int height[]) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left <= right) {
            int area = 0; 
            int length = Math.min(height[left], height[right]);
            int breadth = Math.abs (left - right);
            area = breadth * length;
            max = Math.max(area, max);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println("The maximum area of water that can be trapped is: " + maxArea(height));
    }
}