public class AnimalThread extends Thread {

    String name;
    int priority;
    private int i;

    AnimalThread(String name, int priority){
        this.name = name;
        this.priority = priority;
        i = 0;
        setPriority(priority);
    }

    public int increment() {
        return i++;
    }


    @Override
    public void run(){
        while (true){
            System.out.println(name + " " + increment());
        }
    }

}
