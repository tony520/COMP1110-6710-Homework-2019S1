This exercise is focused on making you more familiar with the usage of the lambda
expressions in conjunction with Functional Interfaces (namely `IntPredicate`)

We already know that the following piece of code allows us to evaluate IntPredicate for a
particular input value.

    private static boolean applyPredicate(int value, IntPredicate predicate) {
          return predicate.test(value);
    }
It tells us whether our integer value satisfies the condition conveyed by the
predicate. e.g. 
    
    applyPredicate(2, x -> x > 100) returns false because 2 is not greater than 100
    applyPredicate(15, x -> (x % 5 == 0)) returns true because 15 is divisible by 5

Within the `comp1110.homework.J09` package of the `comp1110-homework` project,
create a class `TeenCount` that implements the method `public static int[] teenLess(int[] array)`
which takes in an array of integers as the input, applies the appropriate predicate over all the elements of 
the array and then returns a new array containing only those values which are not teens i.e. values which
don't lie between `13 and 19 inclusive`. Feel free to use the `applyPredicate()` method in your program

You can write a main method to test your code, if you may wish to.

    Sample Input 1               Sample Output 1
    {13, 15, 4, 5}               {4, 5}
 
    Sample Input 2               Sample Output 2
    {13, 19, 13, 14}             {}
    
    Sample Input 3               Sample Output 3
    {4, 3, 9, 0}                 {4, 3, 9, 0}

Test your solution using the `J09` test.

Once you have it working, add and commit your work.
