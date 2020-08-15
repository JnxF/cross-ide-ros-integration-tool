# Cross-IDE ROS Integration Tool

The Robot Operating System (ROS) is an open-source, meta-operating system for building robots. It provides the services expected from an operating system, from hardware abstraction, low-level device control and message-passing between processes to package management. All these features are extremely useful for senior programmers and domain experts to implement and deploy large software projects as many different tools and functionalities are available. However, at the same time, inexperienced programmers often suffer a steep learning curve due to the overwhelming and noticeable quantity of intertwined artifacts necessary to execute even a minimum working example. For experienced programmers, the complexity increases with the number of used artifacts as well.

Some tools have been developed to alleviate this introduction pain, like ROS Package Generator, which scaffolds code that the user has to fill out afterwards. However, none of them provide support for completing or keeping consistency of the resulting blanks.

In this Research Project I implement an integration tool for managing ROS artifacts that integrates with most of the modern IDEs. The main goal is giving consistency to the users' code: raising warnings and IDE suggestions which are the result of examining the relationships and dependencies among ROS artifacts. Therefore, relationships are made explicit and thus it is easier to detect errors.

**Keywords**: Robot Operating System, Language Server Protocol, dependencies.
