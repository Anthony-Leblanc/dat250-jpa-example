# Experiment 2

This project is an introduction to the creation of databases with Java, an experiment some tools usable to create those.

## Intallation :

I encounter so specific problem during the installation of the persistance.

## JPA :

To write the code, I have been using ItelliJ IDEA, because this software as the advantage to create the databases locally to show the schema of the relation between the datas.
To use it correctly I should download all the dependencies necessary to the project : JPA, JDK, Maven and lombock. The sofware being nicely developped shows the errors from these dependencies that are not installed in it. By clicking in those errors it shows how to install the dependencies. So I encounter no particular difficulties to install them.
To create the database, I started to read the schema of the subject and completed the classes to match with it. While doing that some errors appears that was from the MainTest that named the attributes of the class differently than in the diagram. So I have just adapted the name of the attribute to match with the MaintTest class.

## Inspection of database ;

To verifie the databases, I have created a main that load the attributes of the different classes to match with this diagram :

![image](https://user-images.githubusercontent.com/83810301/190598539-1b1ec256-9f71-49f2-8675-e7b97cb0db4b.png)

To see if it match correctly with my test, I create the one corresponding to my code :

![image](https://user-images.githubusercontent.com/83810301/190598465-be00f6cc-aa09-4b4b-8b07-c63c2f714df2.png)

I think that the datas are upload correclty despite the double arrow between the Person class and the CreditCard class that should have been mono directional.

## Issues :

I didn't encounter particular issues. But I have a miss understanding of an error that I get in ItelliJ that I don't have in Eclipse :

![image](https://user-images.githubusercontent.com/83810301/190602387-ef261cdd-7c5e-4972-84fc-c238567d563d.png)

But even with this error the code runs without problems.

### Side Note : 

This lab assignement was done in collaboration with the following people : Aeneas RUS LIN and Jingwen CHEN
