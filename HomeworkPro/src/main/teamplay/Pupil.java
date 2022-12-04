package teamplay;

public class Pupil extends Participant{
    public Pupil(int age, String name, League league) {
        super(age, name, league);
    }

    @Override
    public String toString() {
        return "Pupil: " + getName() + " " + getAge() + " " + getLeague();
    }
}
