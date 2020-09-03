# Cross-IDE ROS Integration Tool

This VS Code extension adds checkings and warnings over ROS configuration files:

## package.xml
Only works with version 3.

Constraints: 
* Checks that all compulsory tags are included (`name`, `version`, `description`, `maintainer` and `license`).
* Verifies that the singleton tags are not repeated.

## CMakeLists.txt

Constraints:

* Exactly one CMakeMinimumRequired
* Exactly one ProjectInstruction instruction
* There cannot be FindPackages with the same name

Linking constraints:
* The name of the package should match with the one in the `package.xml` file.

Suggestions:
* Packages not `REQUIRED` are suggested to be so. 

## Python

* The executables should match with the defined at the CMakeLists.