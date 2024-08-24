// Generic Pair class
public class Day11assignment1<A, B> {
    private A first;
    private B second;

    // Constructor
    public Day11assignment1(A first, B second) {
        this.first = first;
        this.second = second;
    }

    // Getter for first element
    public A getFirst() {
        return first;
    }

    // Getter for second element
    public B getSecond() {
        return second;
    }

    // Method to reverse the pair
    public Day11assignment1<B, A> reverse() {
        return new Day11assignment1<>(second, first);
    }

    // Example usage
    public static void main(String[] args) {
        Day11assignment1<String, Integer> pair = new Day11assignment1<>("Hello", 123);
        System.out.println("Original Pair: " + pair.getFirst() + ", " + pair.getSecond());

        Day11assignment1<Integer, String> reversedPair = pair.reverse();
        System.out.println("Reversed Pair: " + reversedPair.getFirst() + ", " + reversedPair.getSecond());
    }
}
