package BoxerGame;

public class Main {
    public static void main(String[] args) {
        Boxer b1 = new Boxer("A", 10, 120, 100, 40);
        Boxer b2 = new Boxer("B", 20, 85, 85, 20);

        Match match = new Match(b1, b2, 85, 100);
        match.run();

    }
}
