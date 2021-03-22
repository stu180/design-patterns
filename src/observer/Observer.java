package observer;

public interface Observer {

    /**
     * Updates the exercise
     */
    void update();

    /**
     * Sets an exercise for all observers to do
     *
     * @param exercise the exercise to start
     */
    void setExercise(Observable exercise);
}
