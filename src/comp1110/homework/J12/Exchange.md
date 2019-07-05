Generics is such a powerful tool that it enables us to use types (classes and interfaces) as parameters to our methods.
Type parameters provide a way for you to re-use the same code with different inputs. This means that
we can transform our previously written algorithms so that they now perform on several types of inputs like Integers,
Doubles, Strings etc. rather than just ints or floats.

In this exercise, you shall have your first taste of writing a generic method in java
which lets you swap the positions of two different elements in an array. Notice how the type of the
array has been abstracted away, this is because the type is generic.

Within the `comp1110.homework.J12` package of the `comp1110-homework` project,
create a class `Exchange` that implements the method `public static <T> T[] swap(T[] a, int i, int j)`.
The method takes in a generic array along with two integers `i` and `j` representing the positions of the 
elements to be swapped. It then returns the updated array as the output.

Note: In case the positions of the elements to be swapped are invalid, the input array should remain unchanged.

    Sample Input 1               Sample Output 1
    {1, 3, 4, 5}                 {4, 3, 1, 5}
    0
    2
    
 
    Sample Input 2               Sample Output 2
    {1, 3, 4, 5}                 {1, 3, 4, 5}
    5
    2
 
    
    Sample Input 3               Sample Output 3
    {8, 4, 1, 9}                 {8, 4, 1, 9}
     -1
     3

Test your solution using the `J12` test.

Once you have it working, add and commit your work.
