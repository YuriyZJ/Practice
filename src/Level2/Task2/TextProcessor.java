package Level2.Task2;

public class TextProcessor {
    public void processText(String text){
        class WordCounter {
            WordCounter wordCounter = new WordCounter();

            public int countWords(String text){
                int left = 0;
                int right = text.length() - 1;
                int count = 0;

                while (left < right){
                    if (text.charAt(left) == " "){
                        count++;
                    }
                    left++;
                }
                return count;
            }
        }
    }
}