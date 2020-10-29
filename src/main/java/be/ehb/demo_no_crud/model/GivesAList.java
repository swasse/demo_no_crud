package be.ehb.demo_no_crud.model;

import java.util.ArrayList;

public class GivesAList {

    public static ArrayList<User> givesList(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Jos", "jos@email.be"));
        users.add(new User("Karel", "karel@email.be"));
        return users;
    }
}
