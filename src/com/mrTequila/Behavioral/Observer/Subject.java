package com.mrTequila.Behavioral.Observer;

public interface Subject {

    // methods to register and unregister observers
    public void register(Observer observer);
    public void unregister(Observer observer);

    // notify observers of change
    public void notifyObservers();

    // get updates from subject
    public Object getUpdate(Observer observer);
}
