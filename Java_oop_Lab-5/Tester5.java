public class Tester5 {
    public static void main(String[] args) {
        Cricket_Tournament ct1 = new Cricket_Tournament();
        System.out.println(ct1.detail());
        System.out.println("-----------------------");

        Cricket_Tournament ct2 = new Cricket_Tournament("IPL", 10, "t20");
        System.out.println(ct2.detail());
        System.out.println("-----------------------");

        Tennis_Tournament tt = new Tennis_Tournament("Roland Garros", 128);
        System.out.println(tt.detail());
    }
}

/* Base Tournament class */
class Tournament {
    private String name;

    public Tournament() {
        this.name = "Default";
    }

    public Tournament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

/* Cricket_Tournament class */
class Cricket_Tournament extends Tournament {
    private int numberOfTeams;
    private String type;

    public Cricket_Tournament() {
        super();
        numberOfTeams = 0;
        type = "No type";
    }

    public Cricket_Tournament(String name, int numberOfTeams, String type) {
        super(name);
        this.numberOfTeams = numberOfTeams;
        this.type = type;
    }

    public String detail() {
        return "Cricket Tournament Name: " + getName() +
               "\nNumber of Teams: " + numberOfTeams +
               "\nType: " + type;
    }
}

/* Tennis_Tournament class */
class Tennis_Tournament extends Tournament {
    private int numberOfPlayers;

    public Tennis_Tournament(String name, int numberOfPlayers) {
        super(name);
        this.numberOfPlayers = numberOfPlayers;
    }

    public String detail() {
        return "Tennis Tournament Name: " + getName() +
               "\nNumber of Players: " + numberOfPlayers;
    }
}

