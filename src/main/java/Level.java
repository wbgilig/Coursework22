/**
 * Add in some lovely javadoc here.
 */
public class Level
{
    private char[] boardLayout;

    //Regen speeds for items
    private int bombRegenSpeed;
    private int gasRegenSpeed;
    private int sterilisationRegenSpeed;
    private int poisonRegenSpeed;
    private int mSexChangeRegenSpeed;
    private int fSexChangeRegenSpeed;
    private int noEntryRegenSpeed;
    private int deathRatRegenSpeed;

    //Amount of items held by user
    private int bombAmount;
    private int gasAmount;
    private int sterilisationAmount;
    private int poisonAmount;
    private int mSexChangeAmount;
    private int fSexChangeAmount;
    private int noEntryAmount;
    private int deathRatAmount;

    //Time and scorekeeping attributes
    private int timeInLevel;
    private int expectedCompletionTime;
    private int currentScore = 0;

    //constructor. -> Will want to javadoc this.
    public Level(char[] tiles, int bombRS, int gasRS, int sterilRS, int poisonRS,
                 int mscRS, int fscRS, int noEntryRS, int deathRS, int bombNo,
                 int gasNo, int sterilNo, int poisonNo, int mscNo, int fscNo,
                 int noEntryNo, int deathNo, int compTime)
    {
        setBoardLayout(tiles);
        setBombRegenSpeed(bombRS);
        setGasRegenSpeed(gasRS);
        setSterilisationRegenSpeed(sterilRS);
        setPoisonRegenSpeed(poisonRS);
        setmSexChangeRegenSpeed(mscRS);
        setfSexChangeRegenSpeed(fscRS);
        setNoEntryRegenSpeed(noEntryRS);
        setDeathRatRegenSpeed(deathRS);
        setBombAmount(bombNo);
        setGasAmount(gasNo);
        setSterilisationAmount(sterilNo);
        setPoisonAmount(poisonNo);
        setmSexChangeAmount(mscNo);
        setfSexChangeAmount(fscNo);
        setNoEntryAmount(noEntryNo);
        setDeathRatAmount(deathNo);
        setExpectedCompletionTime(compTime);
    }



    public char[] getBoardLayout()
    {
        return boardLayout;
    }

    public void setBoardLayout(char[] boardLayout)
    {
        this.boardLayout = boardLayout;
    }

    public int getBombRegenSpeed()
    {
        return bombRegenSpeed;
    }

    public void setBombRegenSpeed(int bombRegenSpeed)
    {
        this.bombRegenSpeed = bombRegenSpeed;
    }

    public int getGasRegenSpeed()
    {
        return gasRegenSpeed;
    }

    public void setGasRegenSpeed(int gasRegenSpeed)
    {
        this.gasRegenSpeed = gasRegenSpeed;
    }

    public int getSterilisationRegenSpeed()
    {
        return sterilisationRegenSpeed;
    }

    public void setSterilisationRegenSpeed(int sterilisationRegenSpeed)
    {
        this.sterilisationRegenSpeed = sterilisationRegenSpeed;
    }

    public int getPoisonRegenSpeed()
    {
        return poisonRegenSpeed;
    }

    public void setPoisonRegenSpeed(int poisonRegenSpeed)
    {
        this.poisonRegenSpeed = poisonRegenSpeed;
    }

    public int getmSexChangeRegenSpeed()
    {
        return mSexChangeRegenSpeed;
    }

    public void setmSexChangeRegenSpeed(int mSexChangeRegenSpeed)
    {
        this.mSexChangeRegenSpeed = mSexChangeRegenSpeed;
    }

    public int getfSexChangeRegenSpeed()
    {
        return fSexChangeRegenSpeed;
    }

    public void setfSexChangeRegenSpeed(int fSexChangeRegenSpeed)
    {
        this.fSexChangeRegenSpeed = fSexChangeRegenSpeed;
    }

    public int getNoEntryRegenSpeed()
    {
        return noEntryRegenSpeed;
    }

    public void setNoEntryRegenSpeed(int noEntryRegenSpeed)
    {
        this.noEntryRegenSpeed = noEntryRegenSpeed;
    }

    public int getDeathRatRegenSpeed()
    {
        return deathRatRegenSpeed;
    }

    public void setDeathRatRegenSpeed(int deathRatRegenSpeed)
    {
        this.deathRatRegenSpeed = deathRatRegenSpeed;
    }

    public int getBombAmount()
    {
        return bombAmount;
    }

    public void setBombAmount(int bombAmount)
    {
        this.bombAmount = bombAmount;
    }

    public int getGasAmount()
    {
        return gasAmount;
    }

    public void setGasAmount(int gasAmount)
    {
        this.gasAmount = gasAmount;
    }

    public int getSterilisationAmount()
    {
        return sterilisationAmount;
    }

    public void setSterilisationAmount(int sterilisationAmount)
    {
        this.sterilisationAmount = sterilisationAmount;
    }

    public int getPoisonAmount()
    {
        return poisonAmount;
    }

    public void setPoisonAmount(int poisonAmount)
    {
        this.poisonAmount = poisonAmount;
    }

    public int getmSexChangeAmount()
    {
        return mSexChangeAmount;
    }

    public void setmSexChangeAmount(int mSexChangeAmount)
    {
        this.mSexChangeAmount = mSexChangeAmount;
    }

    public int getfSexChangeAmount()
    {
        return fSexChangeAmount;
    }

    public void setfSexChangeAmount(int fSexChangeAmount)
    {
        this.fSexChangeAmount = fSexChangeAmount;
    }

    public int getNoEntryAmount()
    {
        return noEntryAmount;
    }

    public void setNoEntryAmount(int noEntryAmount)
    {
        this.noEntryAmount = noEntryAmount;
    }

    public int getDeathRatAmount()
    {
        return deathRatAmount;
    }

    public void setDeathRatAmount(int deathRatAmount)
    {
        this.deathRatAmount = deathRatAmount;
    }

    public int getTimeInLevel()
    {
        return timeInLevel;
    }

    public void setTimeInLevel(int timeInLevel)
    {
        this.timeInLevel = timeInLevel;
    }

    public int getExpectedCompletionTime()
    {
        return expectedCompletionTime;
    }

    public void setExpectedCompletionTime(int expectedCompletionTime)
    {
        this.expectedCompletionTime = expectedCompletionTime;
    }

    public int getCurrentScore()
    {
        return currentScore;
    }

    /**
     * <h1>What this method does:</h1> Updates the player's score.
     * @param amountToIncreaseScore The number of points to add to a
     * player's score.
     */
    public void updateCurrentScore(int amountToIncreaseScore)
    {
        this.currentScore = currentScore + amountToIncreaseScore;
    }


}
