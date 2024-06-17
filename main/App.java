package main;

import mazeSolver.MazeSolver;

public class App {
    public static void main(String[] args){
        int[][] map = {
                {1,1,1,1,1,1},
                {1,2,0,0,0,1},
                {0,1,0,1,0,1},
                {0,1,0,1,0,0},
                {0,1,0,1,1,0},
                {0,0,0,1,1,3}
        };

        MazeSolver mazeSolver = new MazeSolver(1, 1, map);
        if(mazeSolver.solveByDepthFirstSearch(1,1)){
            System.out.println(" Maze can be escaped!");
        }else{
            System.out.println(" Maze can NOT be escaped!");
        }
    }
}
