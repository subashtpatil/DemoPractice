package Strings;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> str1= Optional.empty();
        Optional<String> str2= Optional.of("John");
      /*  if (str1.isPresent()){
            System.out.println("Hi "+str2.get());
        } else{
            System.out.println("Hi ");
        }*/

        System.out.println("Hi "+str2.orElse(""));
        System.out.println("Hi "+str1.orElse(""));

    }
}
/*
If a value is present, returns the value, otherwise returns other.
        Params:
other – the value to be returned, if no value is present. May be null.
Returns:
the value, if present, otherwise othe*/
