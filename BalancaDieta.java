
public class BalancaDieta implements Observer {
	@Override
    public void update(double novoPeso) {
     if (novoPeso >= 100) {
         System.out.println("Voc� ultrapassou o peso limite no sistema!");
     }
    }
}
