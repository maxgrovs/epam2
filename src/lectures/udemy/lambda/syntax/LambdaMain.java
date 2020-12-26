package lectures.udemy.lambda.syntax;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaMain {

    public static void main(String[] args) {

        String[] colors = {"jd", "jdjdj", "ksjd"};

        Player player = new Player("Max", 70);
        Player player1 = new Player("Vasya", 72);
        Player player2 = new Player("Sonya", 10);
        Player player3 = new Player("Tanya", 140);

        Player[] players = {player, player1, player2, player3};

        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.score - o2.score;
            }
        });

        Arrays.sort(colors, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - 1 - o2.length() - 1;
            }
        });

        Arrays.sort(colors, (String o1, String o2) -> { // преобразовали в простую лямбду
            return o1.length() - 1 - o2.length() - 1;
        });

        Arrays.sort(colors, (String o1, String o2) -> o1.length() - 1 - o2.length() - 1);
        // преобразовали в лямбду


    }


    //-----------------------------------
    private static class Player {
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
}
