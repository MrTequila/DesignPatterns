package com.mrTequila.Behavioral.Observer;

public interface Observer {

    // method to update observer, used by subject
    public void update();

    // attach with subject to observe
    public void setSubject(Subject subject);
}
