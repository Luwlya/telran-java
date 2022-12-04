package teamplay;

public abstract class Participant {
    private int age;
    private String name;
    private League league;

    public Participant(int age, String name, League league) {
        this.age = age;
        this.name = name;
        this.league = league;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

}
