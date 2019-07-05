In this exercise, you will solve a route planning problem using a [greedy
algorithm](https://en.wikipedia.org/wiki/Greedy_algorithm).

A truck driver must visit a number of locations that are defined by Cartesian
coordinates (x, y). Given some starting coordinates, the driver must visit
each location once and only once. In this exercise, you will implement a
simple solution in which the driver always chooses to visit the nearest
location that they have not already visited.

Within the `comp1110.homework.C01` package of the `comp1110-homework` project,
create a class `RoutePlanner` that stores information about the target locations.

The `RoutePlanner` class must include the following:

* A nested class `Location` that contains the instance variables `double
xCoord` and `double yCoord`
* A constructor `RoutePlanner()` that creates a new instance of `RoutePlanner`.
* A method `void addLocation(Location loc)` that adds a location to be visited.
* A method `public List<Location> calculateRoute(double startX, double startY)`, 
that returns a list of all the locations that is sorted as follows:
  * The `Location` at index 0 is the closest `Location` to the starting 
coordinates `(startX, startY)`.
  * Each following `Location` is the closest `Location` (that has not already
been visited) to the `Location` at the preceding index. If there are multiple
locations that are equally close, the one that was added first is used.

NOTE: The truck driver must visit each location once and only once, so you can't
reuse a `Location`.

Examples:

    Sample Input 1:
    locations = [(1.0, 2.0), (3.0, 3.0), (1.5, 1.5)]    
    ===
    calculateRoute(0.0, 0.0) == [(1.5, 1.5), (1.0, 2.0), (3.0, 3.0)]

    Sample Input 2:
    locations = [(0.0, 0.0), (2.0, 2.0), (1.0, 1.0)]    
    ===
    calculateRoute(-1.0, 1.0) == [(0.0, 0.0), (1.0, 1.0), (2.0, 2.0)]

    Sample Input 3: 
    locations = [(-2.0, -2.0), (2.0, 2.0)]             
    ===
    calculateRoute(0.0, 0.0) ==  [(-2.0, -2.0), (2.0, 2.0)]

    Sample Input 4:
    locations = []
    ===
    calculateRoute(0.0, 0.0) ==  []

NOTE: To calculate distance, use the Euclidean (straight-line) distance formula:

(distance)^2 = (x2 - x1)^2 + (y2 - y1)^2

where x1 and y1 are the current x- and y-coordinates respectively, and x2 and y2
are the x- and y-coordinates to reach, respectively.

Test your solution using the `C01` test.

Once you have it working, add and commit your work.