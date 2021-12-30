public class AnimalGUI {
    public static void main(String[] args) {
        AnimalFrame frame = new AnimalFrame();

        frame.add(25, Bird.class);
        frame.add(25, Mouse.class);        
//        frame.add(25, Frog.class);
//        frame.add(25, Rabbit.class);
//        frame.add(25, Snake.class);
//        frame.add(25, Turtle.class);
//        frame.add(25, Wolf.class);

        frame.start();
    }
}
