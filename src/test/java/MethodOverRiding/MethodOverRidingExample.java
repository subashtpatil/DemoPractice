package MethodOverRiding;


class Vehicle{
    public void move(){
        System.out.println("Vehicles can move!!");
    }
}
class MotorBike extends Vehicle{
    public void move(){
        System.out.println("MotorBike can move and accelerate too!!");
    }}
class MethodOverRidingExample {
    public static void main(String[] args) {
//parent class reference holds the child class object
        Vehicle vh = new MotorBike();
        vh.move();    // prints MotorBike can move and accelerate too!!
        vh = new Vehicle();
        vh.move();    // prints Vehicles can move!!    }
    }
}