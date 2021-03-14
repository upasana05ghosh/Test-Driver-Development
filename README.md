# Test-Driver-Development
Test Driver Development | Java | Maven | JUnit

## Introduction
Test Driven Development (TDD) is development approach in which 
 1. Test cases are developed first to test and validate all the use cases. 
 2. Inittially, all the test cases are going to fail as there isn't any code to support it.
 3. Then we will be writing our code.
 4. Few test cases will start to pass.
 5. We will write mode code and eventually all case test will get passed.
 6. We will be refactoring our code a little more and will test again.
 
In simple terms, test cases for each functionality are created and tested first and if the test fails then the new code is written in order to pass the test and making code simple and bug-free.

## Benefits of TDD


## Problem Statement: String Calculator
I used the following problem statement to create this TDD java application: https://osherove.com/tdd-kata-1
String Calculator

Create a simple class StringCalculator with a method public int add(string numbers) </br>
The method can take 0, 1 or 2 numbers, and will return their sum </br>
(for example: for an empty string it will return 0) </br>
      “” == 0 , “1” == 1 , “1,2” == 3 </br>
 
 ## Few snapshots of the code
 
 1. **Initial test cases failed**
 ![First Test Case Failed](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/01FirstTestCaseFailure.png)
 
 2. **Test cases success**
 ![First test case Success](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/02FirstTestCaseSuccess.png)
 
 3. **Delimite Test Case Failed**
 ![Delimite Test Case Failed](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/03DilimiterTestCaseFailed.png)
      
 4. **Delimite Test Case Passed**
 ![Delimite Test Case Passed](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/04DelimiterTestCasePassed.png)

 5. **Negative Number Exception Test Case Failed**
 ![Negative Number Exception Test Case](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/05ExpectedToThrowException.png)
 
 6. **Negative Number Exception Test Case Passed**
 ![Negative Number Exception Test Case Passed](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/06HandleNegativeException.png)

 7. **Displaying All Negative Numbers**
 ![Displaying All Negative Numbers](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/07DisplayAllNegativeNumbers.png)
 
 8. **Counter For Function Call**
 ![Counter For Function Call](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/08CounterForCalFunction.png)
 
 9. **Ignore Number That are Greater Than Thousand**
 ![Ignore Number Greater Than Thousand](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/09IgnoreNoGreaterThanThousandFailed.png)
 
 10. **All Test Cases Passed at the end**
 ![All Test Cases Passed at the end](https://github.com/upasana05ghosh/Test-Driver-Development/blob/main/10SuccessOnIgnoreCase.png)


# Reference
https://junit.org/junit5/docs/current/user-guide/
