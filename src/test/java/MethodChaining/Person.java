package MethodChaining;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

class Person {
    String name;
    int age;

    // This method can be used in chaining
    public Person setName(String name) {
        this.name = name;
        return this;
    }
    // This method can also be used in chaining
    public Person setAge(int age) {
        this.age = age;
        return this;
    }
    public void getPersonDetails() {
        System.out.println("Person name :  " + name + ", age : " +age+" years.");
    }
}