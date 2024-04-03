public class Football extends Game {

    @Override
    void intialise() {
      System.out.println("Football game intialised");
    }

    @Override
    void startPlay() {
       System.out.println("Football game started");
    }

    @Override
    void endPlay() {
        System.out.println("Football game ended");
    }
    
}
