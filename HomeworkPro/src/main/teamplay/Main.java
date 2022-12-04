package teamplay;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static Faker faker = new Faker();
    static Random random = new Random();

    static Pupil createRandomPupil() {
        String name = faker.name().fullName();
        int age = random.nextInt(14,18);
        Pupil pupil = new Pupil(age,name, League.FIRST);
        return pupil;
    }

    public static void main(String[] args) {
        // volleyball : participants, team, gameplay, results
        // participants: types, leagues, name, age, counter (win//loose)
        // team: list participants, add, change list
        // gameplay: create participants, make a team, play, result, renew counter for each participant
        // output: sout all participants (sort participants' types, leagues, counter (win//loose)

        // create participant
        // create teams
        // play
        // sort participants
        // print results
        List<Pupil> pupilList = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
             pupilList.add(createRandomPupil());
        }
        for (Pupil pupil : pupilList) {
            System.out.println(pupil);
        }
        
    }
}