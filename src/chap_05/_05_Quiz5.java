package chap_05;

public class _05_Quiz5 {

    public static void privacyTransformation(String name, String socialSecurityNumber, String phonNumber){
        String[] change = new String[3];
        change[0] = name.charAt(0) + ("*".repeat(name.length()-1));
        change[1] = socialSecurityNumber.substring(0,8) + ("*".repeat(6));
        change[2] = phonNumber.substring(0,9) + ("*".repeat(4));

        for (String c : change){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        privacyTransformation("문빛나리","990130-1234567","010-1234-5678");
    }
}
