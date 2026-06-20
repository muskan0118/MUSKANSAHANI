5 Radix Sort Dry Run Tasks! 

Task 1 — Trace Pass 1 (Ones digit)
Array = {329, 457, 657, 839, 436, 720, 355}

Find the ones digit of each number
and place them in buckets 0-9

Q1. Which bucket does 329 go in? 
-> bucket 9
Q2. Which bucket does 720 go in? 
-> bucket 0
Q3. Write the array after 
    collecting all buckets (0→9)
-> Array = {720,355,436,457,657,329} 


Task 2 — Trace Pass 2 (Tens digit)
Use the result array from Task 1

Find the tens digit of each number
and place them in buckets 0-9

Q1. Which bucket does 720 go in?
-> Bucket 2
Q2. Which bucket does 436 go in?
-> Bucket 3
Q3. Write the array after 
    collecting all buckets (0→9)
-> Array ={720,329,436,355,457,657}    

Task 3 — Trace Pass 3 (Hundreds digit) — Final
Use the result array from Task 2

Find the hundreds digit of each number
and place them in buckets 0-9

Q1. Write the final sorted array
-> Array={329,355,436,457,657,720}
Q2. Verify — is it correctly 
    sorted ascending?
-> yes


Task 4 — Find max digits needed
Array = {5, 802, 34, 6721, 9}

Q1. What is the maximum number 
    in this array?
-> 6721
Q2. How many digits does it have?
-> 4
Q3. How many passes will 
    Radix Sort need?
-> 4   


Task 5 — Think (Discussion)
Array = {8, 4, 1000000, 7, 2}

Q1. How many digits does 
    1000000 have?
-> 7    
Q2. How many total passes 
    will Radix Sort need 
    for this array?
-> 7    
Q3. Is Radix Sort efficient 
    for this array? Why or why not?
-> No, because there is only number in th array with 7 digits and others are single digit,
so we need 7 passes for just one digit. Therefore, it is unnecessary. 


