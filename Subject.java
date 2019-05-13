package DesignPatterns.Observer;

/*
In brief, Observer Pattern = publisher + subscriber.

The following is a typical example about head hunter.
There are two roles in this diagram - HeadHunter and JobSeeker.
 Job seekers subscribe to a head hunter, and head hunter notifies job seekers when there is a new job opportunity.
 */

import java.util.Observer;

public interface Subject {

    public void registerObserver(DesignPatterns.Observer.Observer o);
    public void removeObserver(DesignPatterns.Observer.Observer o );
    public void notifyAllObservers();
}
