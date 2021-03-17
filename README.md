# Voicemod_QA

#### Acceptance Test Plan

<https://docs.google.com/document/d/1XU8Xe4zFV9n_S0kuSOxl9ngDJOF93OpWaf3TxzodoB8/edit?usp=sharing>

#### Sonar

<https://drive.google.com/file/d/1WVwoeohv4mwCj6qJ5pdHg2ModNpQbH3v/view?usp=sharing>

#### Structure of the project

This project consists basically of two parts: main and tests. 

- **Main: ** First, it contains the configuration to run Selenium and the basic functions and methods to use in Pages. Here are also the Const (where we declare the elements and their locators) and the Pages (the logic that is used on each page).
The suite is located inside the resources folder
- **Tests: ** The tests to be run

#### Run test
    $ git clone https://github.com/juanvisanc/Voicemod_QA.git
    $ cd Voicemod_QA
    $ mvn clean -DtestSuite="src/main/resources/suite/testng.xml" test

Note: If you run from windows or mac you have to change the file TestSetConfig.java `String os = "linux";` for `String os = "mac"` or `String os = "windows";`  It has been tested with linux