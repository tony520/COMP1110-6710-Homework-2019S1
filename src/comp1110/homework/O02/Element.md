Within the `comp1110.homework.O02` package of the `comp1110-homework` project,
create an enum `Element` that stores information about chemical elements.  You
only need to implement the first five elements, and you only need to record
the atomic weight, the group, and the period (listed in the table below).
* The enum will have a constructor with signature `Element(int weight, int group, int period)`.
* The enum will have a private instance field `facts` that is an array of `int`
* The constructor will initialize the instance field to be an array of size three,
and then initialize its elements to be the weight, group, and period of
the element, respectively.
* The enum will have a getter method `getFacts()` that returns the `int[]`, representing
the three values: weight, group, and period for the given elment.
* Implement this class (if you wish you may implement a main method that demonstrates its use).

Once you have it working, add and commit your work.

| Element   | Weight   |  Group  | Period  |
| --------- | -------- | ------- | ------- |
| H         | 1        | 1       | 1       |
| He        | 2        | 18      | 1       |
| Li        | 3        | 1       | 2       |
| Be        | 4        | 2       | 2       |
| B         | 5        | 13      | 2       |
