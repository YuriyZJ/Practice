package Level2.Task3;

public class Button {
    private ButtonClickListener listener;

    public void setClickListener(ButtonClickListener listener) {
        this.listener = listener; // Сохраняем переданный слушатель
    }

    public void click() {
        if (listener != null) { // Проверяем, установлен ли слушатель
            listener.onClicked(); // Вызываем обработчик клика
        }
    }
}
