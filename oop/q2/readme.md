Quiz 2.


Overview:


This repository contains a java implementation of quiz 2 in the OOP course.
The program demonstrates a specific transformation between two lists (integers and strings) using a mathematical formula.

_**Problem Description_**

The puzzle involves two lists:

1. list1: A list of integers (positions 0-12)

2. list2: A list of strings (positions 0-17)


We need to  discover and implement the formula that maps integer values from list1 to string values from list2

the formula was found to be:

**String Index = Integer Value × 2 - 1**

This means for each integer value in list1,
we multiply it by 2, subtract 1,
and use the result as an index to retrieve a string from list2.

****Implementation Details**

**Program Structure****

`Main method: Sets up the lists with predefined values and demonstrates the solution
 applyFormula method: Applies the discovered formula to map integers to strings
 printList method: helper method for displaying list contents`

**Algorithm**

**The algorithm works as follows:**

Initialize list1 with predefined integer values (7, 9, 7, 5, 6, 8, 6, 8, 5, 3, 5, 9, 3)

Initialize list2 with predefined string values (CzD, zSz34, MTF6, etc.)

**For each integer value in list1:**

Calculate the index using the formula: index = value * 2 - 1

Retrieve the string at the calculated index from list2

Add the string to the result list


**Code Features**

**Exception Handling**: The program validates indices to prevent IndexOutOfBoundsException

**Flexible Design**: Although initialized with predefined values, the applyFormula method works with any valid input lists

**Clear Output**: The program provides detailed output showing each step of the transformation



