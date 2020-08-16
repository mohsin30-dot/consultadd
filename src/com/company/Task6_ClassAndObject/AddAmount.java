package com.company.Task6_ClassAndObject;


public class AddAmount
{
    //Data member amount is initialized to 50
    int amount = 50;

    //Default constructor which does not add any amount to data member amount
    public AddAmount() {
        amount = amount + 0;
    }

    //Constructor with parameter which add amount to data member amount
    public AddAmount(int x) {
        amount = amount + x;
    }

    //Static data member to count no of transaction done
    static int noofTransaction = 0;
    {
        noofTransaction += 1;
    }
    public static void main(String[] args) {
        //Creating two objects of class AddAmount
        AddAmount object1 = new AddAmount();
        AddAmount object2 = new AddAmount(50);

        //Displaying the amount of two objetcs

        System.out.println("The amount in saving box after 1st object is created: " + object1.amount);
        System.out.println("The amount in saving box after 2nd object is created: " + object2.amount);

        //Displaying total number of transaction
        System.out.println("Total number of transaction in saving box are: " + AddAmount.noofTransaction);
    }
}
