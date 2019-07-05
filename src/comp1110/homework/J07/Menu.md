One simple way of making a program user-friendly is by using the menu-driven approach.
Under this approach, the user is presented with a menu listing all the choices available
to her. This makes sure that even though the user can access all features of a particular program, she
has the option of interacting with only the desired ones at any given point in time.

Within the `comp1110.homework.J07` package of the `comp1110-homework` project,
create a class `Menu` that implements the following methods: -

1. `public static int findRange(int[] array)` which takes in an an array of integers as the input
and returns range of the values i.e. the difference between the maximum and the minimum values

2. `public static int getMax(int[] array)` which takes in an array of integers as the input
and returns the highest value as the output

3. `public static int getSecondHighest(int[] array)` which takes in an array of integers as the input 
and returns the second highest value as the output


On startup, your program should prompt the user by providing the following menu:

    Please enter:
    1 to find range of the scores
    2 to find the maximum score
    3 to find the second highest score
    
After receiving the user's choice of operation, the program reads an integer `N` (size of the array)
followed by the `N` elements of the array itself in as many lines. These are then fed to the appropriate
method which produces the desired result. However, if the user's choice was invalid in the first place
then print `"Invalid Option Selected"` instead of taking in an array

    Sample Input 1               Sample Output 1
    1                            2
    3
    1
    2
    3             
         
    Sample Input 2               Sample Output 2
    2                            3
    3
    1
    2
    3
    
    Sample Input 3              Sample Output 3
    4                           "Invalid Option Selected"
    
    
Test your solution using the `J07` test.

Once you have it working, add and commit your work.
