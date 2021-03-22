package observer;

public class ObserverMain {
    public static void main(String[] args) {

        Exercise exercise = new Exercise();
        Observer obs1 = new ExerciseSubscriber("Fitness maniac 01");
        Observer obs2 = new ExerciseSubscriber("Fitness maniac 02");
        Observer obs3 = new ExerciseSubscriber("Fitness maniac 03");

        exercise.subscribe(obs1);
        exercise.subscribe(obs2);
        exercise.subscribe(obs3);

        System.out.println("Starting first exercise");
        exercise.setExercise("New exercise 1");

        // One person quits
        exercise.unsubscribe(obs1);

        System.out.println("Starting second exercise");

        exercise.setExercise("New exercise 2");
    }

}
