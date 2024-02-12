# Java Assignment 004

**Instructions:**
1. Fork this repository to your GitHub account.
2. Clone the forked repository locally to your machine.
3. Create a new branch named Feature01.

## Multadd Computation

**Objective:**
Express computations more concisely using the "multadd" operation.

**Instructions:**
1. Create a new program called `Multadd.java` in the **src** directory.
2. Write a method called `multadd` that takes three doubles as parameters and returns `a * b + c`.
3. Write a main method that tests `multadd` by invoking it with a few simple parameters, like 1.0, 2.0, 3.0.
4. Also in main, use `multadd` to compute the following values:
    * $$\sin\left(\frac{\pi}{4}\right) + \frac{\cos\left(\frac{\pi}{4}\right)}{2}$$
    * $$\log_{10}(10) + \log_{10}(20)$$
5. Write a method called `expSum` that takes a double as a parameter and uses `multadd` to calculate:
    * $$xe^{-x} + \sqrt{1 - e^{-x}}$$
    * Hint: The method for raising \( e \) to a power is `Math.exp`.

**Expert Coder Tip:**
When writing a method that invokes another method you wrote, it is advisable to test the first method carefully before working on the second. Avoid debugging two methods simultaneously, which can be challenging.

**Note:**
One of the purposes of this exercise is to practice pattern-matching: the ability to recognize a specific problem as an instance of a general category of problems.

## Submission
Follow these steps for submission:
1. Create a Feature01 branch of your code if you haven't already.
2. Commit your working code and method implementations to your local copy/Feature01 branch.
3. Push it to your Remote/origin branch (i.e., GitHub: Feature01 -> origin/Feature01).
4. Issue a Pull request to my instructor repo.
5. **Make sure to COPY the Pull request URL and submit it for the lab/assignment in Canvas.**

