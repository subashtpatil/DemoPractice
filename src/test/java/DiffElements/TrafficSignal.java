package DiffElements;

public enum TrafficSignal {
    RED("Stop"),
    GREEN("Go"),
    YELLOW("Slow down");

    private final String action;

    TrafficSignal(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
/*public static void main(String[] args) {
    TrafficSignal signal = TrafficSignal.RED;
    System.out.println("The red light means: " + signal.getAction());
    //Output: The red light means: Stop
    }*/
