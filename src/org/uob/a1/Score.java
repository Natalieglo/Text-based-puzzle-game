package org.uob.a1;

//FINISHED

// Task 5 - Score.java
//The Score class stores and calculates the player’s score. It includes the starting score,
//the current score, the number of rooms visited, the number of puzzles solved and the
//score per puzzle. 

public class Score {
    // attributes
    private int startingScore;
    private int currentScore;
    private int roomsVisited;
    private int puzzlesSolved;
    private final int PUZZLE_VALUE=10;

    public Score(int startingScore)
    {
        this.startingScore= startingScore;
        this.currentScore=startingScore;
        this.roomsVisited=0;
        this.puzzlesSolved=0;
    }

    public void visitRoom()
    {
        roomsVisited++;
    }
    public void SolvePuzzle()
    {
        puzzlesSolved++;
        currentScore+=PUZZLE_VALUE;
    }
        
    public double getScore()
    {
        currentScore=startingScore-roomsVisited+(puzzlesSolved*PUZZLE_VALUE);
        return currentScore;
        
    }
    public void collectItem()
    {
        puzzlesSolved++;
        currentScore += PUZZLE_VALUE;
    }

}