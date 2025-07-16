# 🧮 Array Problems – Data Structures & Algorithms

This repository contains a collection of array-based problems solved using Java. These problems help in understanding the basics and advanced concepts of arrays, one of the most important data structures in programming and interviews.

---

## ✅ Topics Covered

- Array basics and syntax  
- Reversing an array  
- Finding max and min elements  
- Palindrome checks  
- Sorting arrays  
- Rotating arrays  
- Subarray problems (Kadane’s Algorithm)  
- Prefix sum and sliding window techniques  

---

## 📁 Folder Structure

```
array/
├── ReverseArray.java
├── PalindromeCheck.java
├── MaxMinElement.java
├── RotateArray.java
├── KadaneAlgorithm.java
└── ...
```

---

## 🚀 How to Run

1. Install Java (JDK 8 or above)
2. Compile and run any file using:
   ```bash
   javac FileName.java
   java FileName
   ```

---

## 💡 Sample Problem – Reverse Array

```java
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

## 📚 Resources

- [GeeksforGeeks - Array](https://www.geeksforgeeks.org/array-data-structure/)
- [LeetCode Array Problems](https://leetcode.com/tag/array/)
- [Java Array Tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

---

## 🧑‍💻 Author

**Sandhya V**  
CSE Student | DSA Learner | Future Developer 💻  
*Feel free to connect or contribute!*

---

⭐ If you found this helpful, don't forget to star the repo and share with others!