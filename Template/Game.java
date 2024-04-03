public abstract class Game{
    abstract void intialise();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        //intialise the game
        intialise();

        //start the game
        startPlay();

        //end the game
        endPlay();
    }

}