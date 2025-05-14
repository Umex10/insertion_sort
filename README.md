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

## Insertion Sort Explained

Here's a step-by-step explanation of how Insertion Sort works, using a simple integer array example:

### 🧩 Example Array
Let's sort this array: `[5, 2, 4, 6, 1, 3]`

### 🔍 Step-by-Step Process

1. **Initial State**  
   `[5, 2, 4, 6, 1, 3]`  
   (We consider the first element `5` as already "sorted")

2. **Pass 1 - Process element 2**  
   - Compare `2` with `5`  
   - `2 < 5` → Shift `5` right  
   - Insert `2` at position 0  
   Result: `[2, 5, 4, 6, 1, 3]`

3. **Pass 2 - Process element 4**  
   - Compare `4` with `5`  
   - `4 < 5` → Shift `5` right  
   - Compare `4` with `2`  
   - `4 > 2` → Insert `4` at position 1  
   Result: `[2, 4, 5, 6, 1, 3]`

4. **Pass 3 - Process element 6**  
   - Compare `6` with `5`  
   - `6 > 5` → No shift needed  
   Result: `[2, 4, 5, 6, 1, 3]`

5. **Pass 4 - Process element 1**  
   - Compare `1` with `6` → Shift `6` right  
   - Compare `1` with `5` → Shift `5` right  
   - Compare `1` with `4` → Shift `4` right  
   - Compare `1` with `2` → Shift `2` right  
   - Insert `1` at position 0  
   Result: `[1, 2, 4, 5, 6, 3]`

6. **Pass 5 - Process element 3**  
   - Compare `3` with `6` → Shift `6` right  
   - Compare `3` with `5` → Shift `5` right  
   - Compare `3` with `4` → Shift `4` right  
   - Compare `3` with `2` → Insert `3` at position 2  
   Result: `[1, 2, 3, 4, 5, 6]`

### 📊 Visualization

| Pass | Array State           | Action Taken                          |
|------|-----------------------|---------------------------------------|
| 0    | [5, 2, 4, 6, 1, 3]   | Initial state                         |
| 1    | [2, 5, 4, 6, 1, 3]   | Moved 2 before 5                      |
| 2    | [2, 4, 5, 6, 1, 3]   | Moved 4 between 2 and 5               |
| 3    | [2, 4, 5, 6, 1, 3]   | 6 stays in place                      |
| 4    | [1, 2, 4, 5, 6, 3]   | Moved 1 to the beginning              |
| 5    | [1, 2, 3, 4, 5, 6]   | Moved 3 between 2 and 4               |

### 🧠 Key Concept
Insertion Sort works by:
1. Dividing the array into "sorted" (left) and "unsorted" (right) parts
2. Taking the first element from the unsorted part
3. Finding its correct position in the sorted part by:
   - Comparing it with sorted elements (right to left)
   - Shifting elements to make space
   - Inserting it in the correct position

### ⏱️ Performance
For our example (6 elements):
- Total comparisons: 10
- Total shifts: 10
- This matches the average case complexity of O(n²)

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
