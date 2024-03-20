import ObserverPattern.ejemplo1.ConcreteObserver;
import ObserverPattern.ejemplo1.Subject;
import ObserverPattern.repositorio.GitRepository;
import ObserverPattern.repositorio.LoggerObserver;
import StrategyPattern.BubbleSortStrategy;
import StrategyPattern.SelectionSortStrategy;
import StrategyPattern.SorterContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //#Subject Example
        /*
        Subject subject=new Subject();
        ConcreteObserver observer1=new ConcreteObserver("Observador1");
        ConcreteObserver observer2=new ConcreteObserver("Observador2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.doSomething();
        subject.removeObserver(observer1);
         */
        //#BubbleExample

        /*int[] arr={64,25,12,22,11};

        SorterContext context=new SorterContext(new BubbleSortStrategy());
        context.sortArray(arr);

        context.setStrategy(new SelectionSortStrategy());
        context.sortArray(arr);*/


        //#RepositoryExample
        // Crear un repositorio Git/*
        /*GitRepository gitRepository = new GitRepository();

        // Crear observadores (loggers)
        LoggerObserver logger1 = new LoggerObserver("Logger 1");
        LoggerObserver logger2 = new LoggerObserver("Logger 2");

        // Agregar observadores al repositorio
        gitRepository.addObserver(logger1);
        gitRepository.addObserver(logger2);

        // Realizar operaciones en el repositorio y notificar a los observadores
        gitRepository.commit("Primer commit en el repositorio");
        gitRepository.merge("feature_branch");*/
    }

    }
}