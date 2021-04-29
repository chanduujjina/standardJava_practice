# standardJava_practice


https://www.geeksforgeeks.org/differences-jdk-jre-jvm/
https://www.javatpoint.com/features-of-java

switch block
loops(for,while)
continue and break

Like function in c we have a method in java

C will support pass by value and pass by reference

But our java will only support pass by value there is no concept of pass by refrence

if you want to iterate numbers from 1 to 10
i=1;i<=10;i++
for(intialization;condtion;increment/decrement)
while(condition)
//todo
write a program to find factorial of a number

//todo
write a program to verify the given number is prime number

if the number is facing factor count =2

write a program to find the factors for a given numbers

usage of nested for loop
*
**
***


write a program to reverse a number
545
543

3*1+4*10+5*100
345

syntax for swich block

switch(type){
case "ADD":
a+b;
break;

case "DIV":
b/a;
break;
default 
break;
}

//equilateral triangle
//fibonacci series


//java can have pass by refrence

1.what is a method
what are the advantages of method

2.Namning convetions are required to create a method

3.Types of a method

User defined method
Predefined method

static method
non static method

method overloading

constructor 
-----------
Syntax
public ClassName(){
}

1.Default constructors
public ClassName(){
}
2.Parametorized constructor
public ClassName(int a ,int b){
this.a=a;
this.b=b;
}

1.Oject is a super class for classes
2.Object Methods

Data Types:
primitive
Wraper(Object)

int -0
Integer-null

boolean - false/true

Boolean - null

String(primitive or wraper and default value is null)
char -''
Character -null


double -0

Double-null

long -0

Long -null

float -0.0f

Float -null

debug shortcuts:
-----------------

f6-move to next line

f5-inside method

f8- next debug point

ctr+shift+i --to inspect the value of an expression or variable



1.Inheritance
2.Polymorphism
3.Encapsulation
4.Abstraction
5.class
6.Object


Inheritance:
------------

Base class(Parent class) and Derivied class(child or sub class)

1.Reausabilty
2.method oveerriding


Syntax:
--------

class Parent{
private String val;
}


class Child extends Parent{
main(){
Syso("val");
}

Method overriding:
Replacement of a functionality by the child class/derivied
Lets have use of Lombok
@Data(setter,getter,equsls,hashcode,tosting,parametorized constructor)
Builder
Employee emp1 = Employee.builder().id(1).name("chandu").build();


EmployeeInfo:
---------
You can hold sub class object with Super class refrence

method overriding

Java11,java 8,java 7

PolyMorphism:
-------------
1.Compile time(Method overrloading)

example
int m1(int a){
}
int m1(int a, int b){
return a+b;
}
2.Runtime time(Method override)


static keyword in java:
------------------
static varible
static block

static method

static variables ,static block will call/intialize at the time of class load
statuc method will with Class name


DesignPatterns:
-------------

SingleTon Design Pattern

I need to pull the data only once at the time of application load

DB Connectivity with Java:
-----------------------
Need Connection Object
JDBC Connection



Parent class

Child 1, Child 2

Reflection APi:
------------

Load the class dynamically and instatiate it

OOPS:
------
1.Inheritance
2.polymorphism
3.Encapsulation(Abstraction,Interface)

Method with having body -concrete method
method with definition but don't have body --> abstract method


Parent(Base),Child(Dervied class)

Interface

Objects methods:
--------------
1.HashCode
2.Equals
3.toString
4.wait(3 method)
5.notify(2 methods)
6.clone

MVC Design pattern

Model : which is came from db or some other external source
View:which is class having the things dislaying in the UI
Controller:which is the mapping class for the assocaited request


Todo
Cumcumber testing for Krishna

JUnit:
Power Mockito
Mockito

Build Tools:
Maven
Gtaddle

Version Control:
Git

Code governanace tools:

Sonar(PMD),JUNIT,Build tool,Check Style

Review Comments:
Check Styles
Code reusability
Code refactoring



PowerMockito and Mockito






