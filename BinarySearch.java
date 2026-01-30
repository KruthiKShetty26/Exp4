<<<<<<< HEAD
import java.util.Scanner;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};
        int key = sc.nextInt();
        int l = 0, h = a.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] == key) {
                System.out.println("Found at index " + m);
                return;
            } else if (a[m] < key)
                l = m + 1;
            else
                h = m - 1;
        }
        System.out.println("Not found");
        sc.close();
    }
}
=======
BINARY SEARCH ALGORITHM

Binary Search is a searching algorithm used in a sorted array.
It works by repeatedly dividing the search interval in half.

Steps:
1. Find the middle element.
2. If target == middle, return index.
3. If target < middle, search left half.
4. If target > middle, search right half.

Time Complexity:
Best Case: O(1)
Average Case: O(log n)
Worst Case: O(log n)
>>>>>>> ae3e43243c958b2a18ee43eedee7419b679143fc
