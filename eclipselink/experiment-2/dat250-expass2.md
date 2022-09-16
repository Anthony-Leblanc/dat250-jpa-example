# Experiment 2

This project is an introduction to the creation of databases with Java, and to experiment with some tools to create them.

## Installation :

I encountered some specific problems during the installation of the JPA.

## JPA :

To write the code, I used ItelliJ IDEA, because this software has the advantage of creating databases locally and to show the schema of the relation between data.
To use it correctly I downloaded all the necessary dependencies to the project : JPA, JDK, Maven and lombock. The software being well developed, shows the missing dependencies. By clicking on those errors, it shows how to install the dependencies. So I didn't encounter any particular difficulties when installing them.
To create the database, I started by reading the schema of the subject and completed the classes to match with it. While doing that, some errors appeared in the MainTest, it named the attributes of the class differently than in the diagram. So I just adapted the name of the attribute to match with the MaintTest class.

## Inspection of database ;

To verify the databases, I created a main that loaded the attributes of the different classes to match with this diagram :

![image](https://user-images.githubusercontent.com/83810301/190598539-1b1ec256-9f71-49f2-8675-e7b97cb0db4b.png)

To see if it matched correctly with my test, I displayed the schema that corresponded with my code with Intellij :

![image](https://user-images.githubusercontent.com/83810301/190598465-be00f6cc-aa09-4b4b-8b07-c63c2f714df2.png)

I think that the data was uploaded correctly despite the double arrow between the Person class and the CreditCard class when it was supposed to be mono directional.

## Issues :

I didn't encounter any particular issues. But I had a misunderstanding of an error that I got in IntelliJ that I didn't have in Eclipse :

![image](https://user-images.githubusercontent.com/83810301/190602387-ef261cdd-7c5e-4972-84fc-c238567d563d.png)

But even with this error the code runs without problems.

### Side Note : 

This lab assignment was done in collaboration with the following people : Aeneas RUS LIN and Jingwen CHEN
