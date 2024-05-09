import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Update path to which textInput you're working with
        File textFile = new File("src/textInput.txt");

        //Holds the Puzzle Input
        ArrayList<String> puzzleInput = new ArrayList<>();

        Scanner sc = new Scanner(textFile);

        while(sc.hasNextLine()) {puzzleInput.add(sc.nextLine());}

        //System.out.println("Puzzle input is " + puzzleInput);

        Day01.puzzleTwo(puzzleInput);



    }
}