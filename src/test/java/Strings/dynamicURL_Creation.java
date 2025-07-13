package Strings;

public class dynamicURL_Creation {

    public static void main(String[] args) {

        StringBuilder url = new StringBuilder("https://api.example.com/data?");

        url.append("userId=").append(12345);
        url.append("&filter=").append("active");
        System.out.println("New URL: " + url.toString());

    }
}

/*
Question 3: How is StringBuilder helpful in building dynamic test data strings?
Answer —
StringBuilder is used to efficiently create or modify strings without creating multiple string objects. It’s helpful in building dynamic test data or constructing URLs in automation.

Example —
You can use StringBuilder to dynamically construct query strings for API testing.*/
