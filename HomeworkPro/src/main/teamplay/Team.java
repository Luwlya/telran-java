package teamplay;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Participant> {
    final List<T> participants = new ArrayList<>();

    void addParticipant(T participant){
       participants.add(participant);
    }


}
