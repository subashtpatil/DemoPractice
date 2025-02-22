package MethodChaining;


class MethodChainingDemo {
    public static void main(String[] args) {
        Person person= new Person();
        // Below line uses method chaining technique
        person.setName("Rahul").setAge(22).getPersonDetails();
    }
}