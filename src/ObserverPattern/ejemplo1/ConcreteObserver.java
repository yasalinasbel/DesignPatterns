package ObserverPattern.ejemplo1;

public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name){
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println("El observador "+ name+ "ha sido notificado");

    }
}
