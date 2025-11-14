package Lab2;

public class Task1_2 {
    private String name; // Объявление приватной переменной name типа String для хранения имени
    private int height; // Объявление приватной переменной height типа int для хранения роста

    // Конструктор класса Task1_2
    public Task1_2(String name, int height) { // Принимает имя (name) и рост (height) в качестве параметров
        this.name = name; // Присваивает значение параметра name приватной переменной this.name
        this.height = height; // Присваивает значение параметра height приватной переменной this.height
    }

    public String getName() {
        return name;
    } // Возвращает значение приватной переменной name

    public int getHeight() {
        return height;
    } // Возвращает значение приватной переменной height

    // Переопределение метода toString()
    // Возвращает строковое представление объекта
    // Включает имя и рост объекта в отформатированной строке
    @Override
    public String toString() {
        return name + ", рост: " + height;
    }
}