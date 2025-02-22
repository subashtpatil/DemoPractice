package MethodChaining;

public class MethodChainingProgram {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Java");
        // Below line uses method chaining technique
        sb.insert(0,"Learn ").append("online").append(" tutorial");
        System.out.println(sb);
        // Below line also uses method chaining technique
        System.out.println(sb.substring(14));
        System.out.println(sb.substring(14).replace(" tutorial", ""));
        String str = sb.substring(14).replace(" tutorial", "").toUpperCase();
        System.out.println(str);
    }
}
