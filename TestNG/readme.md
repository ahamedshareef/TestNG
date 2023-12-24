# TestNG tutorial

1. we should have test suite
2. test classes ->class -> test classs files



3. we have different tests using <test name= "Personal Loan"></>
4. you can use methods in side class to specifially run some methods
methods
excludes -> excludes the methods 
include -> incldes the methods
5. HOw to execute on Pachakge level using regular expression.
<exclude name ="Mobile*">



examples given below:

<classes>
<class>taib.Basics<class>
<class name="taib.CarLoan"/>
</classes>

## All aboout Annotations:

1. @Test -> these are used for testing methods - this is one unit of test.
2. @BeforeTest -> Will execute before executing any/all @test methods. i want to execute first like 
The scope will belong to one test name in the xml, it will not execute for different test name where its java class is not present.
example:
test name = Car Loan
has BeforeTest -> starts and ends for all the tests in this scope.

test name = Home Loan
does not have Before test in any class
3. Similarly when you use @BeforeSuite and @AfterSuite, it will execute before and after each suite in the xml
the scope is to the Suite where these classes are executed.
before suite runs before BeforeMethod when run in indugial classes.

Questions -> what will happen if i use more than 1 beforeSuite or afterSuite methods. methods.

4. BeforeMethod -> run before every @Test.

what is the differece bt BeforeMethod and BeforeTest 
BeforeTest -> before the tests start and it referes to the xml file.
BeforeMethod -> class level scope is only to specific class. it will still execute in class scope when triggered from xml.

5. @BeforeClass -> scope is class level but run only once in that class.


## Groups:
1. @Test(groups={"Smoke"})






