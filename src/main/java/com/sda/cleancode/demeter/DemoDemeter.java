package com.sda.cleancode.demeter;

import com.sda.cleancode.demeter.contract.IAddress;
import com.sda.cleancode.demeter.contract.IHouse;
import com.sda.cleancode.demeter.contract.IPerson;
import com.sda.cleancode.demeter.domain.Address;
import com.sda.cleancode.demeter.domain.House;
import com.sda.cleancode.demeter.domain.Person;

public class DemoDemeter {

    public static void main(String[] args) {

        IAddress address = new Address(
                "0234", "2B",
                "unirii", "Bucharest",
                "Romania", "Romania");
        IHouse house = new House(address, "yellow", 100.0);
        IPerson person = new Person("andrei", house);

        // violates the Demeter Law
        System.out.println(
                person.getHouse()   // house object
                        .getAddress()   // address object
                        .getZipCode());   // string zip code


        // respects the Demeter Law
        System.out.println(person.getZipCode());
    }
}
