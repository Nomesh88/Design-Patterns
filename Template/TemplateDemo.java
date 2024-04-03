public class TemplateDemo {
    public static void main(String[] args) {
        Game game=new Cricket();
        game.play();

        System.out.println("/n");

        Game game1=new Football();
        game1.play();
    }
    
}
