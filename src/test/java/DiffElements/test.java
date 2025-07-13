package DiffElements;//import DiffElements;
import DiffElements.TrafficSignal;

class test {

        public static void main(String[] args) {
            TrafficSignal signal = TrafficSignal.RED;
            System.out.println("The red light means: " + signal.getAction());
            //Output: The red light means: Stop
        }
}