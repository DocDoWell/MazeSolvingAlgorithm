package mazeSolver;

public class MazeSolver {

    private int startRow;
    private int startColumn;
    private int[][] maze;
    private boolean[][] visited;

    public MazeSolver(int startRow, int startColumn, int[][] maze) {
        this.startRow = startRow;
        this.startColumn = startColumn;
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
    }

    public boolean solveByDepthFirstSearch(int row, int column){
        //base-case
        if(isValid(row, column) && maze[row][column] == 3){
            return true;
        }

        if(isValid(row, column)){
            visited[row][column] = true;
            //then we visit next cells
            //up
            if(solveByDepthFirstSearch(row+1,column)){
                return true;
            }
            //down
            if(solveByDepthFirstSearch(row-1,column)){
                return true;
            }
            //left
            if(solveByDepthFirstSearch(row,column+1)){
                return true;
            }
            //right
            if(solveByDepthFirstSearch(row,column-1)){
                return true;
            }
        }
        return false;
    }

    private boolean isValid(int row, int column){
        //row not in maze
        if(row<0 || row>maze.length-1){
            return false;
        }

        //col not in maze
        if(column<0 || column>maze.length-1){
            return false;
        }

        //already visited
        if(visited[row][column]){
            return false;
        }

        //obstacle
        if(maze[row][column] == 1){
            return false;
        }

        return true;
    }
}
