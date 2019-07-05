Within the `comp1110.homework.J14` package of the `comp1110-homework` project,
create a class `Shop` that maintains information about the inventory of a shop.

* Create an instance method, `void addItem(String name, int stock, int price)`
which is used to add to an internal data structure an item, how many of that
item are in the shop, and how much each costs, in cents.
* Create another instance method, `int totalStockValue()`, which uses the internal
data structure to return the sum of the value of all stock, as an `int`, in cents.
* Implement another instance method `void addItem(String name, int stock, int price,
int rate, int reorderdays)` which allows you to store not only the item name, stock
level and price, but also the rate (in items per day) that the item is usually sold,
and the number of days it takes to reorder the stock.
* Implement another instance method `HashMap reorder()` which returns a hash map
listing the name (key) and number (value) of all of the items that need to be reordered
today in order to ensure that the expected number of stock is always at least one
(ie sufficient to last until the order arrives, assuming average sales). Whenever an
item is ordered, seven days worth of average sales minus the current stock of that
item is always ordered.

Once you have it working, add and commit your work.
