Run-length encoding (RLE) is often regarded as the simplest form of loss less data compression in which runs
of data (that is, sequences where in the same data value occurs repeatedly in consecutive positions) are stored
as a single data value and count, rather than the stretched-out raw form.

In this exercise, you will be writing a string-based implementation of RLE. For a string which
consists of duplicate characters placed in neighbouring positions, replace the duplicates with
the count of repetitions. e.g. If in a String, the character `x` runs for 5 positions, then
replace this `"xxxxx"` with `"x5"`.

Within the `comp1110.homework.J11` package of the `comp1110-homework` project,
create a class `CompressString` that reads in the string to be compressed from the console 
and then on a new line, prints the compressed version of the input.

`Note: ` The input string can contain any characters (including blank) except for digits


    Sample Input 1               Sample Output 1
    aaaaabbbbwwwccc              a5b4w3c3
        
 
    Sample Input 2               Sample Output 2
    aaabbccds                    a3b2c2ds
    
    
    Sample Input 3               Sample Output 3
    Abcd                         Abcd


Test your solution using the `J11` test.

Once you have it working, add and commit your work.
