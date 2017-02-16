package com.fdmgroup.pensions.task3;

/**
 * Created by Jackes Afonso on 15/02/2017.
 */
public class Client {

    public static void main(String[] args){

        Person account = new Person("John","Smith", 28/06/1993);
        System.out.println(account.getFirstName());
        System.out.println(account.getLastName());
        System.out.println(account.getDateOfBirth());

        Person janeAccount = new Person("Jane","Doe", 05/01/1950);
        System.out.println(janeAccount.getFirstName());
        System.out.println(janeAccount.getLastName());
        System.out.println(janeAccount.getDateOfBirth());

        Person FredAccount = new Person("Fred","Bloggs", 12/12/1949);
        System.out.println(FredAccount.getFirstName());
        System.out.println(FredAccount.getLastName());
        System.out.println(FredAccount.getDateOfBirth());






    }


}
