package StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Alice");
        Friend friend2 = new Friend("Bob");
        Friend friend3 = new Friend("Charlie");

        System.out.println(Friend.noOfFriends); // Outputs: 3
    }
}
