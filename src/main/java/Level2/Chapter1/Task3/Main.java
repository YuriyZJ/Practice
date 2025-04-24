package Level2.Chapter1.Task3;

public class Main {
    public static void main(String[] args) {
        Button button = new Button(); // Создаём объект кнопки

        // Устанавливаем анонимный класс как обработчик нажатия
        button.setClickListener(new ButtonClickListener() {
            @Override
            public void onClicked() {
                System.out.println("Button clicked");
            }
        });

        button.click(); // Симулируем нажатие на кнопку
    }
}