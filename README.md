JUnitSuiteCallOrder
===================

This project is an example of running 3 test classes as a suite in parallel using 3 different methods:

    1. Gradle forking tests by class: Shows forking behavior and healthy test report.

    2. JUnits experimental ParallelComputer forking tests by class: Shows forking behavior
   but fails to provide a complete report of test class members in the test group.

    3. JUnits Test Suite running sequential showing that Gradle cannot fork its test tasks: Shows
   that Gradle cannot fork a class that it thinks is a single class from the exterior.

=====================

This project includes a runProjectMenu.bat script so that you can run it from the command
line with little effort.
