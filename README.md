Print all the combinations of elements in matrix of size m * n.
Sample Example:
1   3   5
2   6   7  

Expected Output:
2 , 1
2 , 3
2 , 5
6 , 1
6 , 3
6 , 5
7 , 1
7 , 3
7 , 5

Rules:
- Every combination starts from bottom of matrix and proceeds towards top. It may switch columns though.
- Every combination should have number of elements equal to number of rows.
- A combination can't have an element from the same row present twice.
- Number of columns and rows could vary. So solution has to be generic.
