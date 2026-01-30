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
