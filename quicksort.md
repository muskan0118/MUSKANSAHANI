Quick Sort Dry Run (Java)

Array:
[5, 3, 8, 4, 2]

Take the last element as the pivot.

Pass 1 :
Pivot = 2

5 > 2
3 > 2 
8 > 2
4 < 2 

All elements are greater than 2.
Place pivot at the beginning.
Array becomes:
[2, 3, 8, 4, 5]

Pass 2:
Sort right side [3, 8, 4, 5]
Pivot = 5

3 < 5 ✔
8 > 5
4 < 5 ✔

Array becomes:
[2,3,4,5,8]

left side sort [3,4]
3 > 4
left array becomes [3,4]

Final Sorted Array
[2,3,4,5,8]





