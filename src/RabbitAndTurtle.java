public class RabbitAndTurtle {

    public static void main(String[] args){
        AnimalThread Turtle = new AnimalThread("Черепаха", Thread.MIN_PRIORITY);
        AnimalThread Rabbit = new AnimalThread("Кролик", Thread.MAX_PRIORITY);
        Turtle.start();
        Rabbit.start();
    }
}

