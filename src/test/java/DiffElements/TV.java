package DiffElements;

abstract public class TV {
    abstract void turnOn();
    abstract void turnOff();

}

class Remote extends TV {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    void turnOff() {
        System.out.println("TV is turned OFF.");
    }

    /*// Main class to demonstrate abstraction
    public class Main {*/
        public static void main(String[] args) {
            Remote remote = new Remote();
            remote.turnOn();
            remote.turnOff();
        }
    }

