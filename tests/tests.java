package tests;

import mazeSolver.MazeSolver;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class tests {

    int[][] mapWithNoExit = {
            {1,1,1,1,1,1},
            {1,2,0,0,0,1},
            {0,1,0,1,0,1},
            {0,1,0,1,0,0},
            {0,1,0,1,1,0},
            {0,0,0,1,1,1}
    };

    int[][] mapWithExit = {
            {1,1,1,1,1,1},
            {1,2,0,0,0,1},
            {0,1,0,1,0,1},
            {0,1,0,1,0,0},
            {0,1,0,1,1,0},
            {0,0,0,1,1,3}
    };

    int[][] mapWithBlockedExit = {
            {1,1,1,1,1,1},
            {1,2,0,0,0,1},
            {0,1,0,1,0,1},
            {0,1,0,1,0,1},
            {0,1,0,1,1,0},
            {0,0,0,1,1,3}
    };


    @Test
    public void testSearchAlgorithmIsCorrect(){
        Assert.assertFalse(new MazeSolver(1,1,mapWithNoExit).solveByDepthFirstSearch(1,1));
        Assert.assertFalse(new MazeSolver(1,1,mapWithBlockedExit).solveByDepthFirstSearch(1,1));
        Assert.assertTrue(new MazeSolver(1,1,mapWithExit).solveByDepthFirstSearch(1,1));
    }

}
