package lab7;

import java.util.*;

public class Team {
    ArrayList<Player> allPlayer;
    ArrayList<Player> team;

    public ArrayList<Player> getAllPlayer() {
        allPlayer = new ArrayList<>();
        allPlayer.add(new Player("Marc-André ter Stegen", position.GK, 1));
        allPlayer.add(new Player("Sergiño Dest", position.DF, 2));
        allPlayer.add(new Player("Gerard Piqué", position.DF, 3));
        allPlayer.add(new Player("Ronald Araújo", position.DF, 4));
        allPlayer.add(new Player("Sergio Busquets", position.MF, 5));
        allPlayer.add(new Player("Antoine Griezmann", position.FW, 7));
        allPlayer.add(new Player("Miralem Pjanić", position.MF, 8));
        allPlayer.add(new Player("Martin Braithwaite", position.FW, 9));
        allPlayer.add(new Player("Lionel Messi", position.FW, 10));
        allPlayer.add(new Player("Ousmane Dembélé", position.FW, 11));
        allPlayer.add(new Player("Riqui Puig", position.MF, 12));
        allPlayer.add(new Player("Neto", position.GK, 13));
        allPlayer.add(new Player("Clément Lenglet", position.DF, 15));
        allPlayer.add(new Player("Pedri", position.MF, 16));
        allPlayer.add(new Player("Francisco Trincão", position.FW, 17));
        allPlayer.add(new Player("Jordi Alba", position.DF, 18));
        allPlayer.add(new Player("Matheus Fernandes", position.MF, 19));
        allPlayer.add(new Player("Sergi Roberto", position.DF, 20));
        allPlayer.add(new Player("Frenkie de Jong", position.DF, 21));
        allPlayer.add(new Player("Ansu Fati", position.FW, 22));
        allPlayer.add(new Player("Samuel Umtiti", position.DF, 23));
        allPlayer.add(new Player("Junior Firpo", position.DF, 24));
        return allPlayer;
    }
    
    public ArrayList<Player> buildTeam() {
        team = new ArrayList<>();
        int countGK = 0, countDF = 0, countMF = 0, countFW = 0;
        Random general = new Random();
        System.out.println("List Player(default):");
        Scanner sc = new Scanner(System.in);
        String option;
        while (countGK < 1) {
            int rdGK = general.nextInt(22);
            if (allPlayer.get(rdGK).getPos().equals(position.GK) && !team.contains(allPlayer.get(rdGK))) {
                team.add(allPlayer.get(rdGK));
                countGK++;
            }
        }
        while (countDF < 4) {
            int rdDF = general.nextInt(22);
            if (allPlayer.get(rdDF).getPos().equals(position.DF) && !team.contains(allPlayer.get(rdDF))) {
                team.add(allPlayer.get(rdDF));
                countDF++;
            }
        }
        while (countMF < 4) {
            int rdMF = general.nextInt(22);
            if (allPlayer.get(rdMF).getPos().equals(position.MF) && !team.contains(allPlayer.get(rdMF))) {
                team.add(allPlayer.get(rdMF));
                countMF++;
            }
        }
        while (countFW < 2) {
            int rdFW = general.nextInt(22);
            if (allPlayer.get(rdFW).getPos().equals(position.FW) && !team.contains(allPlayer.get(rdFW))) {
                team.add(allPlayer.get(rdFW));
                countFW++;
            }
        }
        for (Player player : team) {
            System.out.println(player);
        }
        System.out.println("Do you want to see another option? Type Y or N");
        option = sc.nextLine();
        if (option.equalsIgnoreCase("y")) {
            buildTeam();
        } else {
            makeOtherStatic();
        }
        
        return team;
    }
    
    public ArrayList<Player> buildTeam(int df, int mf, int fw) {
        team = new ArrayList<>();
        int countGK = 0, countDF = 0, countMF = 0, countFW = 0;
        Random general = new Random();
        Scanner sc = new Scanner(System.in);
        String option;
        System.out.println("List Player(" + df + " - " + mf + " - " + fw + ")");
        while (countGK < 1) {
            int rdGK = general.nextInt(22);
            if (allPlayer.get(rdGK).getPos().equals(position.GK) && !team.contains(allPlayer.get(rdGK))) {
                team.add(allPlayer.get(rdGK));
                countGK++;
            }
        }
        while (countDF < df) {
            int rdDF = general.nextInt(22);
            if (allPlayer.get(rdDF).getPos().equals(position.DF) && !team.contains(allPlayer.get(rdDF))) {
                team.add(allPlayer.get(rdDF));
                countDF++;
            }
        }
        while (countMF < mf) {
            int rdMF = general.nextInt(22);
            if (allPlayer.get(rdMF).getPos().equals(position.MF) && !team.contains(allPlayer.get(rdMF))) {
                team.add(allPlayer.get(rdMF));
                countMF++;
            }
        }
        while (countFW < fw) {
            int rdFW = general.nextInt(22);
            if (allPlayer.get(rdFW).getPos().equals(position.FW) && !team.contains(allPlayer.get(rdFW))) {
                team.add(allPlayer.get(rdFW));
                countFW++;
            }
        }
        for (Player player : team) {
            System.out.println(player);
        }
        System.out.println("Do you want to see another option? Type Y or N");
        option = sc.nextLine();
        if (option.equalsIgnoreCase("y")) {
            buildTeam(df, mf, fw);
        } else {
            makeOtherStatic();
        }
        return team;
    }
    
    private void makeOtherStatic() {
        String choice;
        int ndf, nmf, nfw;
        System.out.println("Do you want to build another team with difference static? Type Y or N");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextLine();
        if(choice.equalsIgnoreCase("Y")){
            System.out.println("Make your static (DF - MF - FW): ");
            ndf = sc.nextInt();
            nmf = sc.nextInt();
            nfw = sc.nextInt();
            buildTeam(ndf, nmf, nfw);
        }
    }
}
