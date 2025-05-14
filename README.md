# 📦 Java Insertion Sort Demo

A simple Java console application demonstrating the Insertion Sort algorithm for both integers (`int`) and floating-point numbers (`double`).

## 🧠 Project Description

This program:

- Generates an array of random `int` values
- Generates another array of random `double` values (rounded to 2 decimal places)
- Prints both arrays before and after sorting
- Sorts both arrays using the **Insertion Sort** algorithm

## 📁 Project Structure

```bash
src/
└── at/
    └── fhj/
        └── msd/
            └── App.java
```

## 🚀 Running the Program

### Prerequisites

- Java 8 or higher
- IDE like IntelliJ IDEA or use the command line

### Compile and Run

```bash
javac at/fhj/msd/App.java
java at.fhj.msd.App
```

## 📌 Sample Output

```text
Before:
[23, 87, 3, 45, 12, 78, 66, 11, 91, 4]
[88.23, 3.45, 77.11, 12.09, 45.76, 1.33, 90.0, 34.6, 23.43, 56.98]
After:
[3, 4, 11, 12, 23, 45, 66, 78, 87, 91]
[1.33, 3.45, 12.09, 23.43, 34.6, 45.76, 56.98, 77.11, 88.23, 90.0]
```

## 📚 Method Overview

| Method              | Description                                                   |
|---------------------|---------------------------------------------------------------|
| `printArray()`      | Prints an `int[]` array to the console                        |
| `printArrayDouble()`| Prints a `double[]` array to the console                      |
| `insertionSort()`   | Sorts an `int[]` array using the Insertion Sort algorithm     |
| `insertionSort2()`  | Sorts a `double[]` array using the Insertion Sort algorithm   |
| `printArray2()`     | Generic method to print any array (not used in main)          |

## 🧠 Insertion Sort – Algorithm Analysis

| Property            | Value                                       |
|---------------------|---------------------------------------------|
| **Best Case**        | 🕒 `O(n)` – when the array is already sorted |
| **Average Case**     | 🕒 `O(n²)`                                    |
| **Worst Case**       | 🕒 `O(n²)` – occurs when the array is in reverse order |
| **In-Place**         | ✅ Yes – operates directly on the input array |
| **Stable**           | ✅ Yes – does not reorder equal elements     |
| **Adaptive**         | ✅ Yes – performance improves with partially sorted input |

### 🔍 Explanation

- **In-place** ✅:  
  Insertion Sort modifies the array in place without requiring additional memory.

- **Stable** ✅:  
  Equal elements retain their original relative positions after sorting.

- **Adaptive** ✅:  
  The algorithm becomes more efficient if the input is already partially sorted, achieving close to linear time in the best case.

### 📌 Summary

Insertion Sort is intuitive and efficient for small or nearly sorted datasets. While it is not suitable for large, random data sets due to its quadratic time complexity, it shines when adaptiveness and stability are important.


## ✍️ Author

- Umejr Dzinovic
