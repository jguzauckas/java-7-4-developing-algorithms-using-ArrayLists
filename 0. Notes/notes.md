# Developing Algorithms Using ArrayLists

Just like with arrays, there are many problems we can solve using ArrayLists. Below, we go over some common problems and the algorithms we can apply to solve them. Some are new to ArrayList objects, many are covered again from arrays.

---

## New to `ArrayList` Objects

### Inserting Elements

Sometimes, we have problems that require us to systematically add elements to an ArrayList. One example of such a problem is "if this element is not present, add it to the `ArrayList`".

As our example, let's say we are provided an `ArrayList` that stores `Integer` values, and are provided the key value of `5`.

We want to add the element `5` to our `ArrayList` only if it is not present. This would utilize the following steps:
- Create a `boolean` value set to `false`.
- Iterate over the `ArrayList`:
    - If the element is found, set a `boolean` to `true`.
    - If the element is not found, do nothing.
- If the element is present somewhere, do nothing.
- If the element was not present anywhere, add it to the `ArrayList`.

Here is what this could look like from the `NotesInsert1.java` file:

```java
public static void add5(ArrayList<Integer> intList) {
    boolean isMissing = true;
    for (int num : intList) {
        if (num == 5) {
            isMissing = false;
        }
    }
    if (isMissing) {
        intList.add(5);
    }
}
```

This algorithm uses a **`boolean` flag** to *remember* if the element was ever present in the list. Once the element is found once, the flag variable `isMissing` is set to `false`, and can never again be set to `true` (though it can keep getting set to `false`). This is an appropriate use of a `for-each` loop since it does not modify the ArrayList until after the loop!

The alternative example of such a problem is "every one of this element should be immediately followed by that element in the `ArrayList`".

As our example, let's say we are working with a `String` `ArrayList`. The problem would say "every instance of `"Hello"` should have the element right after it be `"World"`". This means that we need to check for the `String` `"Hello"` and if it is ever found, check if the next element is `"World"`, and if it isn't, insert it there.

This would follow these steps:
- Iterate over the `ArrayList`:
    - Check if the current element is `"Hello"`:
        - If it is, check if the next element is `"World"`:
            - If it is, do nothing.
            - If it is not, insert `"World"` there.
        - If it is not, do nothing.

Here is what this could look like from the `NotesInsert2.java` file:

```java
public static void addWorld(ArrayList<String> strList) {
    for (int i = 0; i < strList.size(); i++) {
        if (strList.get(i).equals("Hello")) {
            if (i + 1 >= strList.size() || !strList.get(i + 1).equals("World")) {
                strList.add(i + 1, "World");
            }
        }
    }
}
```

Note the use of `i + 1 >= strList.size()` in the second `if` statement. This is a short-circuit evaluation for when we are at the end of the `ArrayList` object (if the last element is `"Hello"`, we already know that there is no `"World"` after it, so we should insert it anyways.)

Additionally, this was not an appropriate situation to use a `for-each` loop, as we were inserting new elements and we needed access to the index to compare values that were next to each other.

### Deleting Elements

A common problem with `ArrayList` objects is to systematically remove all elements that meet a given criteria.

As an example, let's take an `ArrayList` of `Double` values and remove all negative numbers from the list.

This would follow these steps:
- Iterate over the `ArrayList`:
    - Check if the current element is negative:
        - If it is, remove it and decrement the loop control variable.
        - If it is not, do nothing.

Here is what this could look like from the `NotesRemove1.java` file:

```java
public static void removeNegatives(ArrayList<Double> doubleList) {
    for (int i = 0; i < doubleList.size(); i++) {
        if (doubleList.get(i) < 0) {
            doubleList.remove(i);
            i--;
        }
    }
}
```

Whenever we remove elements in the middle of an `ArrayList`, we have to modify the loop control variable to make up for some new element moving into that index and needing to be checked.

---

## Array Algorithms Modified

The following were traditional array algorithms that we can modify to work with `ArrayList` objects as well. For each, both the array and `ArrayList` versions are shown, and details are limited except to note the significant changes made to work with `ArrayList` objects instead of arrays.

### Minimum

From the `NotesMinimum1.java` file:

```java
public static double findMinimum(double[] arr) {
    double minimum = arr[0];
    for (double val : arr) {
        if (val < minimum) {
            minimum = val;
        }
    }
    return minimum;
}

public static double findMinimum(ArrayList<Double> list) {
    double minimum = list.get(0);
    for (double val : list) {
        if (val < minimum) {
            minimum = val;
        }
    }
    return minimum;
}
```

### Maximum

From the `NotesMaximum1.java` file:

```java
public static double findMaximum(double[] vals) {
    double maximum = vals[0];
    for (double val : vals) {
        if (val > maximum) {
            maximum = val;
        }
    }
    return maximum;
}

public static double findMaximum(ArrayList<Double> list) {
    double maximum = list.get(0);
    for (double val : list) {
        if (val > maximum) {
            maximum = val;
        }
    }
    return maximum;
}
```

### Sum

From the `NotesSum1.java` file:

```java
public static int sumAges(Person[] people) {
    int sum = 0;
    for (Person person : people) {
        sum += person.getAge();
    }
    return sum;
}

public static int sumAges(ArrayList<Person> peopleList) {
    int sum = 0;
    for (Person person : peopleList) {
        sum += person.getAge();
    }
    return sum;
}
```

### Average

From the `NotesAverage1.java` file:

```java
public static double findAverage(int[] nums) {
    int sum = 0;
    for (int num : nums) {
        sum += num;
    }
    return (double) sum / nums.length;
}

public static double findAverage(ArrayList<Integer> intList) {
    int sum = 0;
    for (int num : intList) {
        sum += num;
    }
    return (double) sum / intList.size();
}
```

### Mode

From the `NotesMode1.java` file:

```java
public static double findMode(double[] vals) {
    double mode = vals[0];
    int numTimes = 1;
    for (double val1 : vals) {
        int tempTimes = 0;
        for (double val2 : vals) {
            if (val1 == val2) {
                tempTimes++;
            }
        }
        if (tempTimes > numTimes) {
            mode = val1;
            numTimes = tempTimes;
        }
    }
    return mode;
}

public static double findMode(ArrayList<Double> doubleList) {
    double mode = doubleList.get(0);
    int numTimes = 1;
    for (double val1 : doubleList) {
        int tempTimes = 0;
        for (double val2 : doubleList) {
            if (val1 == val2) {
                tempTimes++;
            }
        }
        if (tempTimes > numTimes) {
            mode = val1;
            numTimes = tempTimes;
        }
    }
    return mode;
}
```

### An Element with a Property

From the `NotesOneElementCondition1.java` file:

```java
public static boolean containsEven(int[] nums) {
    for (int num : nums) {
        if (num % 2 == 0) {
            return true;
        }
    }
    return false;
}

public static boolean containsEven(ArrayList<Integer> intList) {
    for (int num : intList) {
        if (num % 2 == 0) {
            return true;
        }
    }
    return false;
}
```

### All Elements with a Property

From the `NotesAllElementsCondition1.java` file:

```java
public static boolean allNegative(int[] nums) {
    for (int num : nums) {
        if (num >= 0) {
            return false;
        }
    }
    return true;
}

public static boolean allNegative(ArrayList<Integer> intList) {
    for (int num : intList) {
        if (num >= 0) {
            return false;
        }
    }
    return true;
}
```

### Access All Consecutive Pairs of Elements

From the `NotesConsecutivePairs1.java` file:

```java
public static boolean isIncreasing(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < nums[i - 1]) {
            return false;
        }
    }
    return true;
}

public static boolean isIncreasing(ArrayList<Integer> intList) {
    for (int i = 1; i < intList.size(); i++) {
        if (intList.get(i) < intList.get(i - 1)) {
            return false;
        }
    }
    return true;
}
```

### Determine the Presence or Absence of Duplicate Elements

From the `NotesDuplicates1.java` file:

```java
public static boolean areDuplicates(double[] vals) {
    for (double val1 : vals) {
        int tempTimes = 0;
        for (double val2 : vals) {
            if (val1 == val2) {
                tempTimes++;
            }
        }
        if (tempTimes >= 2) {
            return true;
        }
    }
    return false;
}

public static boolean areDuplicates(ArrayList<Double> doubleList) {
    for (double val1 : doubleList) {
        int tempTimes = 0;
        for (double val2 : doubleList) {
            if (val1 == val2) {
                tempTimes++;
            }
        }
        if (tempTimes >= 2) {
            return true;
        }
    }
    return false;
}
```

### Determine the Number of Elements Meeting Criteria

From the `NotesNumberCriteria1.java` file:

```java
public static int howManyOldPeople(Person[] people) {
    int count = 0;
    for (Person person : people) {
        if (person.getAge() > 60) {
            count++;
        }
    }
    return count;
}

public static int howManyOldPeople(ArrayList<Person> peopleList) {
    int count = 0;
    for (Person person : peopleList) {
        if (person.getAge() > 60) {
            count++;
        }
    }
    return count;
}
```

### Shift Elements Left/Right

From the `NotesShift1.java` file:

```java
public static void shiftLeft(int[] nums) {
    int first = nums[0];
    for (int i = 0; i < nums.length - 1; i++) {
        nums[i] = nums[i + 1];
    }
    nums[nums.length - 1] = first;
}

public static void shiftLeft(ArrayList<Integer> intList) {
    intList.add(intList.remove(0));
}

public static void shiftRight(ArrayList<Integer> intList) {
    intList.add(0, intList.remove(intList.size() - 1));
}
```

This one has a significant change, because removing an element from the beginning of the list successfully shifts all indices to the left by `1`, and all we have to do is add that element back on to the end of the list. We can do the same thing to the right by taking the element at the end and inserting it at the beginning of the list.

### Reverse the Order of Elements

From the `Notes1.java` file:

```java
public static void reverse(int[] nums) {
    for (int i = 0; i < nums.length / 2; i++) {
        int temp = nums[i];
        nums[i] = nums[nums.length - i - 1];
        nums[nums.length - i - 1] = temp;
    }
}

public static void reverse(ArrayList<Integer> intList) {
    for (int i = 0; i < intList.size() / 2; i++) {
        intList.set(i, intList.set(intList.size() - i - 1, intList.get(i)));
    }
}
```

This one also gets drastically shortened due to our ability to swap in-place with the `set` method for `ArrayList` objects.

---

## Traversing Multiple `ArrayList` Objects Simultaneously

Some problems require traversing multiple `String`, array, or `ArrayList` object simultaneously.

Some situations will have more than one `ArrayList` objects that are paired together, meaning that they should have the same `size()` and the same index across the lists is related. We used this with arrays early on to demonstrate how we could use paired arrays to store the same information as an object (two arrays for `int` and `String` that store `age` and `name` values for people instead of a `Person` object.

When we are in a situation with these paired `ArrayList` objects, traversal is only based on one of the objects, but the index applies to all objects. As such, we will not use `for-each` loops in these situations, as we use the index to work between `ArrayList` objects.

Let's say I am storing the ages of people in the `ageList` variable and the names of those same people in the `nameList` variable. I want to print out the names of all people who are `18` years or older and therefore can vote in the U.S. Here is an example of this from the `NotesMultipleSimultaneous1.java` file:

```java
public static void printOver18(ArrayList<Integer> ageList, ArrayList<String> nameList) {
    for (int i = 0; i < ageList.size(); i++) {
        if (ageList.get(i) >= 18) {
            System.out.println(nameList.get(i));
        }
    }
}
```

Notice that our loop was based on `ageList`, but since these `ArrayList` objects are paired, we have a mutual understanding that if an index is valid/useful for one of the `ArrayList` objects, it must be good for the other(s).

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
