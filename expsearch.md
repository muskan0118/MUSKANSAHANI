Task 1
Array:
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
[0, 1, 2, 3, 4,   5,  6,  7,  8,  9]

Key = 18

1. Exponential jumps = 4
2. Range found = 4 to 8
3. Binary Search steps = 3
4. Final index = 8

Task 2
Array:
[5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
[0, 1, 2, 3, 4,  5,  6,  7,  8,  9, 10] //index

Key = 35

Write:
Jump 1: i=1, 10<35
Jump 2: i=2, 15<30
Jump 3: i=4, 20<35

Range: 4 to 10

Binary Search: left = 4, right =10, mid = 7
               arr[7] == 35

Answer: 35 found at index 7


Task 3
Array:
[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21]
[0, 1, 2, 3, 4,  5,  6,  7,  8,  9, 10] //index

Key = 21

i = 1, 3<21
i = 2, 5<21
i = 4, 9<21
i = 8, 17<21
i = 16, X

Range = 8 to 10

Binary Search Iteration 1
left=8, right=10, mid=9, arr[9]= 19<21
Binary Search Iteration 2
left = 10, right = 10, mid = 10, arr[10]=21==key

Final Answer
21 found at index 10

Task 4
Array:
[ 10,20,30,40,50,60,70,80,90,100]
[ 0 , 1, 2, 3, 4, 5, 6, 7, 8, 9] //index

Key = 70

Find:
n = 9
Exponential Jumps = 3
Range = index 4 to 9
Mid Values Checked 
mid = 6

Final Index = 6

Task 5 (Element Not Present)
Array:
[ 2,4,6,8,10,12,14,16,18,20]
[ 0,1,2,3, 4, 5, 6, 7, 8, 9] //index

Key = 15

Exponential Jumps:3

Range Found: 3 to 9

Binary Search Steps: 3
left=3, right=9, mid=6
left=7,right=9,mid=8
left=7,right=7, mid=7
Not found

Why Element Not Found? Because the number was not present in the array
Output = -1





