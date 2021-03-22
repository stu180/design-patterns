package observer;

public class ExerciseSubscriber implements Observer {

    private String name;
    private Observable exercise;

    public ExerciseSubscriber(String name) {
        this.setName(name);
    }

    @Override
    public void update() {

        if (exercise == null) {
            System.out.println(this.getName() + " has nothing to exercise");
            return;
        }

        String newExercise = exercise.getUpdate();
        System.out.println(this.getName() + ": received new exercise: " + newExercise);

    }

    @Override
    public void setExercise(Observable exercise) {
        this.exercise = exercise;
    }

    /**
     * Returns the name of the ExerciseSubscriber
     *
     * @return name of the subscriber
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the ExerciseSubscriber
     *
     * @param name the of the ExerciseSubscriber
     */
    public void setName(String name) {
        this.name = name;
    }

}
