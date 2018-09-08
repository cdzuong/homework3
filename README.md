# homework3
Due on Wednesday, September 12 by 11:59pm

Use the following link to to create your private github repository for this assignment: 

The repository will be seeded with the skeleton code and test cases. To generate JavaDoc documentation, after checking out the starter
code from github, open it in IntellJ, select Tools from the menu and then "generate JavaDoc". You will be able to specify the output directory.

In this lab, you will practice using ArrayLists and loops, including nested loops. Fill in code in the following classes:
- ArrayListUtils
- StarPatterns
- Organization

Please read comments above each method. Do not modify class Employee, tests or the starter code except where the comments explicitly tell you to add your own code. Do not change the structure of the project.
Note that in class StarPatterns, you are required to use nested loops to get credit for the homework.

In StarPatterns, here are examples of the patterns you are expected to produce (note that your code is expected to work for any n):
drawSquare(9) should produce the following pattern (note that the number of stars depends on n, do not hardcode it!):

* * * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 

drawTwoTriangles(9) should produce the following pattern of stars and minuses (note that the number of stars and minuses depends on n, do not hardcode it!):
* - - - - - - - - 
* * - - - - - - - 
* * * - - - - - - 
* * * * - - - - - 
* * * * * - - - - 
* * * * * * - - - 
* * * * * * * - - 
* * * * * * * * - 
* * * * * * * * * 

drawThreeTriangles(9) should produce the following pattern:
- - - - * - - - - 
- - - * * * - - - 
- - * * * * * - - 
- * * * * * * * - 
* * * * * * * * * 

### Submission Instructions

- Your code must (a) compile without any errors, (b) run, and (c) produce the correct output. If the code does not compile or crashes when we run it on a lab machine, it will result in a 0 for the assignment. 
  Your code must also pass the tests (do NOT modify the tests; if you want to add your own tests, add them in a different test file). Please note that class StarPatterns does not have tests and needs to be tested manually. The instructor provided basic JUnit tests, but you are responsible for further testing your code. Passing the tests
  does not garantee that your code is bug-free!
- Your code needs to be committed to the correct github repository. Note that we cannot accept code submitted via Canvas or email. 
- Make sure your code follows the style guidelines described in StyleGuidelines.pdf (posted on Canvas). 
- This assignment is individual, no collaboration is allowed. You can go the professor, the TA or CS tutors for help.
