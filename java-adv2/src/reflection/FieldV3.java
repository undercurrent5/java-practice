package reflection;

import reflection.data.Team;
import reflection.data.User;

public class FieldV3 {
    public static void main(String[] args) {
        User user = new User("id1", null, null);
        Team team = new Team("team1", null);
        System.out.println("==== before ====");
        System.out.println("user = " + user);
        System.out.println("team = " + team);



    }
}
