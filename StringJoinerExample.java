import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        String[] cities = {"Dhaka", "Chittagong", "Khulna", "Mymenshing", "Rajshahi", "Rangpur", "Sylhet"};
        StringJoiner joiner = new StringJoiner(", ");
        for (String city : cities) {
            joiner.add(city);
        }
        System.out.println("Division of Bangladesh: " + joiner);
    }
    
}