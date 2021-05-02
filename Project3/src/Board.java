import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class Board {

    private Animal[][] board;
    private List<Animal> list;

    public Board() {
        board = new Animal[10][10];
    }

    public Board(Animal[][] board) {
        this.board = board;
    }

    public Animal[][] getBoard() {
        return board;
    }

    public void setBoard(Animal[][] board) {
        this.board = board;
    }

    public List<Animal> addToList() {
        list = new ArrayList<>();
        list.add(new Bird("Bird", board.length));
        list.add(new Frog("Frog", board.length));
        list.add(new Mouse("Mouse", board.length));
        list.add(new Rabbit("Rabbit", board.length));
        list.add(new Snake("Snake", board.length));
        list.add(new Turtle("Turtle", board.length));
        list.add(new Wolf("Wolf", board.length));
        return list;
    }

    public void addAllToBoard() {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            while (!checkBoard(animal)) {
                animal.setRandomPosition();
            }
            add(animal);
        }
        System.out.println("Board");
        printBoard();
    }

    public void start() {
        int round = 1;
        System.out.println("Press Enter to start: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                Animal animal = list.get(i);
                board[animal.getPosition().getX()][animal.getPosition().getY()] = null;
                animal.move();
                checkPos(animal);
                if (checkBoard(animal)) {
                    add(animal);
                } else {
                    Animal animal2 = board[animal.getPosition().getX()][animal.getPosition().getY()];
                    Random r = new Random();
                    int winner = r.nextInt(2);
                    if (winner == 1) {
                        add(animal);
                        list.remove(animal2);
                        System.out.println(animal.getName() + " beats " + animal2.getName());
                    } else {
                        list.remove(animal);
                        System.out.println(animal2.getName() + " beats " + animal.getName());
                    }
                }
            }
            System.out.println(list.size() + " left.");
            System.out.println("Board after round " + round);
            printBoard();
            round++;
            System.out.println("Press Enter to start next round: ");
            s = sc.nextLine();
        }
        System.out.println("The winner is: " + list.get(0).getName());
        try {
            FileWriter fw = new FileWriter(new File("record.txt"));
            fw.write(list.get(0).getName());
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    System.out.print("\t|");
                } else {
                    System.out.print(board[i][j].getName() + "\t|");
                }
            }
            System.out.println();
        }
    }
    
    public void add (Animal animal) {
        board[animal.getPosition().getX()][animal.getPosition().getY()] = animal;
    }
    
    public boolean checkBoard (Animal animal) {
        if (board[animal.getPosition().getX()][animal.getPosition().getY()] == null) {
            return true;
        }
        return false;
    }

    public void checkPos (Animal animal) {
        if (animal.getPosition().getX() >= board.length || animal.getPosition().getY() >= board.length || animal.getPosition().getX() < 0 || animal.getPosition().getY() < 0) {
            animal.setRandomPosition();
        }
    }
}
