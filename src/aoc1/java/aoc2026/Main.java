package aoc2026;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static aoc2026.Nubmers.nubmers;

public class Main {

    private static int okNumbers;

    private final static int startNubmer = 50;

    public static void main(String[] args) {

        int actuall = 0;

        String[] moves = nubmers.split("\n");

        int currentNubmer = startNubmer;

        for(String move : moves){

            move = move.trim();

            if(move.isEmpty()) {
                continue;
            }

            char dir = move.charAt(0);
            int distance = Integer.parseInt(move.substring(1).trim());

            if(dir == 'R'){
                currentNubmer = (currentNubmer + distance) % 100;
            } else if (dir == 'L') {
                currentNubmer = (currentNubmer - (distance % 100) + 100 ) % 100;
            }else {
                return;
            }

            if(currentNubmer == 0){
                okNumbers++;
            }

        }
        
        System.out.println(okNumbers);

    }


}

