package PassByValueByReference;


public class PassByReference {

    // This method takes a copy of the reference to MyObjectValue
    public static void changeObjectName(MyObject obj) {
        // Modifying the state of the object through the copied reference
        obj.setName("New Name");
    }

    public static void main(String[] args) {
        MyObject originalObj = new MyObject("Original Name");
        System.out.println("Before method call: " + originalObj.getName()); // Output: Original Name

        changeObjectName(originalObj); // Pass the copy of the reference
// above method went and updated the original name to New Name

        System.out.println("After method call: " + originalObj.getName());  // Output: New Name

    }
}
