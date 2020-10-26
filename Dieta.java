import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dieta implements Observable {
	private List observers = new ArrayList();
    private double peso;

    public Dieta() {}
    
    public Dieta(double peso) {
         this.peso = peso;
    }

public void setPeso(double peso) {
     this.peso = peso;
     // Quando a altera��o do peso ocorrer, esse � o momento correto para notificar os observers.
     this.notifyObservers();
 }

    @Override
    public void registerObserver(Observer observer) {
         observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
         observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
     // Chama o m�todo de atualiza��o de todos os observers dispon�veis.
    	Iterator it = observers.iterator();
        while(it.hasNext()){
            Observer o = (Observer)it.next();
            o.update(this.peso);
        }
    }

}
