package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

class Cannon{
    private Boolean loaded;

    public Cannon(boolean loaded) {
        this.loaded = loaded;
    }
    public boolean getLoaded() {
        return this.loaded;
    }
    public String toString() {
        return String.valueOf(loaded);
    }

    @Override
    public boolean equals(Object o){
        final Cannon c = (Cannon) o;
        return this.loaded.equals(c.getLoaded());
    }

    //checking. If Cannons are not loaded method load them.
    public static Cannon fire(Cannon cannonStatus){

        if (cannonStatus.equals(new Cannon(false))) {
            System.out.println("No bullet in the Cannon ");
            System.out.println("Loading the Cannon");
        }
        System.out.println("The Cannon is loaded ");
        System.out.println("Fireing from the Cannon");
        //after fireing the cannon must be empty
        cannonStatus = new Cannon(false);
        System.out.println("The Cannon is empty \n");

        return cannonStatus;
    }
}

class Program
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //initialising the collection
        LinkedList<Cannon> cannonsList = new LinkedList<Cannon>();
        // creating Cannon objects
        Cannon cannon1 = new Cannon(false);
        Cannon cannon2 = new Cannon(true);
        Cannon cannon3 = new Cannon(true);
        Cannon cannon4 = new Cannon(false);

        cannonsList.add(cannon1);
        cannonsList.add(cannon2);
        cannonsList.add(cannon3);
        cannonsList.add(cannon4);
        //	fireing the Cannons using fire method.
        for(int i = 0; i < cannonsList.size(); i++) {
            System.out.println("Checking Cannon" + (i+1));
            Cannon status = Cannon.fire(cannonsList.get(i));
            //updating the Cannons status after fireing.
            cannonsList.set(i, status);
        }
    }
}
