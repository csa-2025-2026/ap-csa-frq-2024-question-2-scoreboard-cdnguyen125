/*

# Answer close reading 1 questions here


# Answer close reading 2 questions here

*/

// Write the class below

public class Scoreboard
{
    private String team1;
    private int team1Score;
    private String team2;
    private int team2Score;
    private int turnCount;

    public Scoreboard(String t1, String t2)
    {
        team1 = t1;
        team2 = t2;
        turnCount = 1;
        team1Score = 0;
        team2Score = 0;
    }

    public void recordPlay(int points)
    {
        if (points == 0)
        {
            turnCount++;
        }
        else if (turnCount % 2 == 1)
        {
            team1Score += points;
        }
        else if (turnCount % 2 == 0)
        {
            team2Score += points;
        }
    }

    public String getScore()
    {
        String activeTeam;
        if (turnCount % 2 == 1)
        {
            activeTeam = team1;
        }
        else
        {
            activeTeam = team2;
        }
        return team1Score + "-" + team2Score + "-" + activeTeam;
    }
}