package org.example.creationalpattern;

public class Singleton {
    private static volatile Singleton instance;
    private String data;

    //Only access using public static main method
    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        //Thread safe -- Only one thread access at a time
        //Limiting synchronization of constructing a new instance of this field
        //Skipping Synchronization when retrieving an already created instance
        //Everytime we try to access this variable instance, we need to read it directly from main memory, so to, access it twice
        //Avoid that we create local instance and store it there, method overall performance by 40%
        Singleton result = instance;
        if (instance == null) {
            synchronized (Singleton.class) {
                if (result == null)
                    //A shared variable stored in memory can reference partially constructed object other threads consider it as initialized and use it
                    //causing application to crash , so  singleton instance is made volatile
                    result = new Singleton(data);
            }
        }
        return result;
    }
    //Not Robust enough if synchronized not there
    //Double check locking
    //Singleton disables all means of creating objects of a class except for special static creation method.
    //returns existing instance if it has been already created
    //Should be used when class has single instance available, adapted to handle multiple threads

}
