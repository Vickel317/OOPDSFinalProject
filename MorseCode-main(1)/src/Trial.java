public class Trial {
    public static void main(String[] args) {
        MorseBinaryTree morseTree = new MorseBinaryTree();

//        System.out.println("\n--- Encoding ---");
//        String encoded = morseTree.toMorse("A");
//        System.out.println("Encoded Morse: " + encoded);

        System.out.println("\n--- Decoding ---");
        String decoded = morseTree.fromMorse(".- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -....- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -....- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -... .- -...");
        System.out.println("Decoded Text: " + decoded);

        System.out.println("\nTotal operations done: " + morseTree.getOperations());
    }
}
