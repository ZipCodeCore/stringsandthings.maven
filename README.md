# Strings and Things

* **Purpose**
    * To gain familiarity with `String` objects
* **Description**
    * This application has been provisioned with JUnit tests and boilerplate classes, and method stubs.
    * Complete the method-stub implementation to achieve 100% test-pass rate.

## What was that String thing again?

(You're sooo confused, aren't you? There are so many new ideas and concepts to learn.  It's okay.  You're doing great.  You're going to be fine.  Right?)

In Java, a string is an object that represents a sequence of characters. Strings are widely used in Java programming, and there are many built-in methods that can be used to manipulate strings. To create a string in Java, you can use the String class and assign a value to it using double quotes. For example:

```java
String zicodeString = "Zipcode Rocks!";
```

This creates a new string object with the value "Zipcode Rocks!".

Once you have created a string, you can use various methods to manipulate it, such as `length()`, `charAt()`, `substring()`, and many others.

Here's a brief description of each of those methods:

`length()`: This method returns the length of the string, which is the number of characters it contains. For example, `"zipcode".length()` would return 7.
But if you called `"Zipcode Rocks!".length()` it would return 14.

`charAt()`: This method returns the character at a specified index in the string. The index is zero-based, so the first character is at index 0. For example, "zipcode".charAt(2) would return 'p'. (remember, you always start counting at 0)

`substring()`: This method returns a substring of the original string, starting at a specified index and optionally ending at another specified index. For example, "zipcode".substring(1, 4) would return "ipc". And if you wanted to get "Rocks" from "Zipcode Rocks!" (which is also zicodeString), you could use zicodeString.substring(8, 13).

These are just a few of the many methods available for manipulating strings in Java. Other common methods include `indexOf()`, `toUpperCase()`, `toLowerCase()`, `replace()`, and `trim()`. So there is plenty more to learn, eventually.


## How to Download

### Part 1 - Forking the Project
* To _fork_ the project, click the `Fork` button located at the top right of the project.


### Part 2 - Navigating to _forked_ Repository
* Navigate to your github profile to find the _newly forked repository_.
* Copy the URL of the project to the clipboard.

### Part 3 - Cloning _forked_ repository
* Clone the repository from **your account** into the `~/dev` directory.
    * if you do not have a `~/dev` directory, make one by executing the following command:
        * `mkdir ~/dev`
    * navigate to the `~/dev` directory by executing the following command:
        * `cd ~/dev`
    * clone the project by executing the following command:
        * `git clone https://github.com/MYUSERNAME/NAMEOFPROJECT`

### Part 4 - Check Build
* Ensure that the tests run upon opening the project.
    * You should see `Tests Failed: ${number-of-tests} of ${number-of-tests} tests`
* Execute the command below to run `JUnit` tests from the command line.
    * `mvn package -Dmaven.test.failure.ignore=true`

## There are a bunch of Tests in this lab

You'll need to "pass" them all. 
(Wait, how do I run the tests? I'm glad you asked.  You can run the tests by right-clicking on the file `StringThingsTest.java` and selecting `Run 'StringThingsTest'`.)
(Maybe you are starting to get this?)

## Writing the code

You need to write code in `StringThings.java` to make the tests pass.  You can do this by writing code in the methods that are already there.  You can also add new methods if you want to.  (You don't have to, but you can if you want to.)

## How to Submit

### Part 1 -  _Pushing_ local changes to remote repository
* from a _terminal_ navigate to the root directory of the _cloned_ project.
* from the root directory of the project, execute the following commands:
    * add all changes
        * `git add .`
    * commit changes to be pushed
        * `git commit -m "method whatChaMaCallIt complete"`
    * push changes to your repository
        * `git push -u origin main`

### Part 2 - Submitting assignment

* make sure your last commit, after you have finished, is labelled `finished`
* are you getting what needs to be done at the end of the lab?
* don't overthink this.  it's just a way for us to see that you're getting it.
