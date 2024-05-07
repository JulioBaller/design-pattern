package subject;

import observer.*;
import acoes.Acoes;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void addAcoes(Acoes acoes);
    public void notificar(); 
}
