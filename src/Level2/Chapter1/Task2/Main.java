package Level2.Chapter1.Task2;

public class Main {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor();

        textProcessor.processText("Hello World. How mach words in this sentence?");
        textProcessor.processText("     ");

        TextProcessor textProcessor2 = new TextProcessor();
        textProcessor2.processText("Hello World. How mach words in this sentence?");
        textProcessor2.processText("     ");
    }
}
