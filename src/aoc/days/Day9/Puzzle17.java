package aoc.days.Day9;

import aoc.FileUtilities;
import aoc.RegEx;

import java.io.File;
import java.util.List;

public class Puzzle17 {
    public static void main(String[] args) {
        new Puzzle17().program();
    }

    private void program() {
        String input = FileUtilities.getArrayFromFile(new File("src/AoC/Day9/input.txt"))[0];
        List<Integer> indata = RegEx.getIntegers(input);
        int numberOfPlayers = indata.get(0);
        int totalNumberOfMarbles = indata.get(1);
        System.out.println(Day9.game(numberOfPlayers, totalNumberOfMarbles * 100));
    }
}
