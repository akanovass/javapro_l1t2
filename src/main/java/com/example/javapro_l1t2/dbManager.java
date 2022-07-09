package com.example.javapro_l1t2;

import java.util.ArrayList;

public class dbManager {
    private static ArrayList<User> users = new ArrayList<>();

    static{
        users.add(new User("Ilyas","Zhuanyshev","IT",550000));
        users.add(new User("Aybek","Bagit","Management",650000));
        users.add(new User("Alibek","Serikov","HR",350000));
        users.add(new User("Madina","Assetova","PR",440000));
        users.add(new User("Anel","Mukhamedjanova","HR",468000));
        users.add(new User("Shyryn","Akanova","IT",700000));
    }

    public static ArrayList<User> getAllUsers(){
        return users;
    }
}
