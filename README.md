JUnitSuiteCallOrder
===================
This project uses the Gradle build system.  See the build.gradle file for details on the defined test tasks.

This project is an example of running 3 test classes as a suite in parallel using 3 different methods:

    1. Gradle forking tests by class: Shows forking behavior and 
       healthy test report. (see runTestSuite Gradle task)

    2. JUnits experimental ParallelComputer forking tests by 
       class: Shows forking behavior but fails to provide a 
       complete report of test class members in the test group.
       (see runParallelSuite Gradle task)

    3. JUnits Test Suite running sequential showing that Gradle
       cannot fork its test tasks: Shows that Gradle cannot fork
       a class that it thinks is a single class from the exterior.
       (see runSkipSuite Gradle task)


Other Info
=====================

This project includes a runProjectMenu.bat script so that you can run it from the command line with little effort.
