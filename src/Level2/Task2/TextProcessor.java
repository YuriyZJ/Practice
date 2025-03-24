package Level2.Task2;

public class TextProcessor {
    public void processText(String text){

        class WordCounter { // локальный класс
            public int countWords(String text){
                int first = 0;
                int count = 1;
                while (first < text.length()){
                    if (text == null || text.isBlank()) {
                        return 0;
                    } if (text.charAt(first) == ' ') {
                        count++;
                    }
                    first++;
                }
                return count;
            }
        }

        WordCounter wordCounter = new WordCounter();
        System.out.println(wordCounter.countWords(text));
    }

    public void processText2(String text){

        class WordCounter2 {
            public int countWords(String text){
                String[] words = text.split(" ");
                int count = words.length;
                return count;
            }
        }
        WordCounter2 wordCounter = new WordCounter2();
        System.out.println(wordCounter.countWords(text));
    }
}