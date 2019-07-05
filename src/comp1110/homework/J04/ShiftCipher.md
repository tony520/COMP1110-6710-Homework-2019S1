Within the `comp1110.homework.J04` package of the `comp1110-homework` project,
create a class `ShiftCipher` to implement a simple [Caesar or shift cipher](https://en.wikipedia.org/wiki/Caesar_cipher).

The program `ShiftCipher` should take two inputs from the terminal. 
The first should be a string of any length which contains any type of symbol (the *plaintext*). 
The second will be a *shift value* which should be between `0` and `25` inclusive (though you may design your program to be resilient to shifts beyond this value). 
The program should print the *cipher text*, in which each of the alphabetic characters in the string is _shifted_ by the given amount, for example:

Input | Shift Value | Result 
--- | --- | --- 
A | 0 | A 
A | 1 | B
A | 5 | F
Z | 1 | A

Lower case letters should be shifted in the same manner (meaning that a lower case letter should remain lower case, and an upper case should remain upper case).
All other characters (i.e. those that are not alphabetic) should remain unchanged.
Print the resulting shifted string to the terminal.

For example, given the input:

    Iacta alea est!
    3
    
the program should print the output:

    Ldfwd dohd hvw!

_Hint_ - You may want to consider the relationship between strings, arrays and ASCII values.

_Extension_ - Abstract your core shifting algorithm into a method/function which can accept positive or negative shift values.
Now write a decode method which given a cipher text and a known shift value returns the string to its original form.
Validate the relationship between your methods by ensuring that applying first the encode function and then the decode function (with the same shift) returns the original plaintext.

_Extension_ - Having completed the above extension, write your own test class which tests the identity relationship of your encoding and decoding methods for all possible characters and all possible shift values (between 0 - 25 inclusive).
Ensure that changing the behaviour of your encoding or decoding methods makes your test fail.
