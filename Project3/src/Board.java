import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class Board {

    // mảng 2 chiều dùng để duy trì vị trí hiện tại của các con vật
    private Animal[][] board;

    // list chứa tất cả con vật tham gia
    //Khi list có length = 1 thì kết thúc ván đấu
    private List<Animal> list;

    //constructor mặc định board sẽ có động rộng 10x10
    public Board() {
        board = new Animal[10][10];
    }

    //constructor custom độ rộng của board
    public Board(Animal[][] board) {
        this.board = board;
    }

    public Animal[][] getBoard() {
        return board;
    }

    public void setBoard(Animal[][] board) {
        this.board = board;
    }

    //method để add tất cả con vật vào list
    // vị trí ban đầu sẽ là ngẫu nhiên nên sẽ gọi contructor không có tham số pos
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

    // đặt mỗi con vật vào vị trí trong board dựa trên thuộc tính pos của chúng
    public void addAllToBoard() {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            // gọi method check board để kiểm tra trước khi đặt
            // nếu vị trí đã có con vật khác rồi thì sẽ gọi setRandomPosition 
            // để chọn lại vị trí cho đến khi không vị trùng
            while (!checkBoard(animal)) {
                animal.setRandomPosition();
            }
            //khi đã chọn được vị trí phù hợp sẽ gọi add() để add vào board
            add(animal);
        }
        //in ra tất cả board sau khi add
        System.out.println("Board");
        printBoard();
    }

    //bắt đầu
    public void start() {
        // đếm số round
        int round = 1;
        System.out.println("Press Enter to start: ");
        // Ấn enter để bắt đầu
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // chiến cho tới khi list còn lại 1 con vật
        while (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                // lần lượt từng con vật di chuyển
                Animal animal = list.get(i);
                // đặt lại vị trí trước khi di chuyển = null
                board[animal.getPosition().getX()][animal.getPosition().getY()] = null;
                animal.move();
                // kiểm tra xem vị trí mới sau khi di chuyển đã có con vật nào chưa
                //nếu chưa thì add vào vị trí đó
                
                //kiểm tra xem có đi ra khỏi bàn không, nếu ra ngoài xét lại random pos
                checkPos(animal);
                if (checkBoard(animal)) {
                    add(animal);
                // nếu có rồi sẽ chiến nhau với nó để giành lãnh thổ
            } else {
                    // lấy vị trí con vật đã chiếm lãnh thổ trước đó
                    Animal animal2 = board[animal.getPosition().getX()][animal.getPosition().getY()];
                    // random để xác định con chiến thắng
                    Random r = new Random();
                    int winner = r.nextInt(2);
                    // con vật mới tới thắng
                    if (winner == 1) {
                        //add con mới
                        add(animal);
                        //xóa con cũ
                        list.remove(animal2);
                        System.out.println(animal.getName() + " beats " + animal2.getName());
                    // con cũ thắng
                    } else {
                        //xóa con mới
                        list.remove(animal);
                        System.out.println(animal2.getName() + " beats " + animal.getName());
                    }
                }
            }
            System.out.println(list.size() + " left.");
            System.out.println("Board after round " + round);
            // in board
            printBoard();
            round++;
            System.out.println("Press Enter to start next round: ");
            s = sc.nextLine();
        }
        System.out.println("The winner is: " + list.get(0).getName());
        //in vào file con vật giành chiến thắng
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
    
    // đặt con vật vào board dựa theo thuộc tính pos
    public void add(Animal animal) {
        board[animal.getPosition().getX()][animal.getPosition().getY()] = animal;
    }
    
    //return true nếu không có con vật nào, false ngc lại
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
