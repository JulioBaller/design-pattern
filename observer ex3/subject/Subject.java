package subject;

import observer.Observer;

public interface Subject {
    
public void addObserver(Observer observer);   
public void notificar(); 

}

