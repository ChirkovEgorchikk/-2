package Lab2;

public class Task1_3 {
    private String lastName; // Объявление приватной переменной lastName типа String для хранения фамилии
    private String firstName;// Объявление приватной переменной firstName типа String для хранения имени
    private String middleName; // Объявление приватной переменной middleName типа String для хранения отчества

    // Конструктор класса Task1_3
    // Принимает фамилию, имя и отчество в качестве параметров
    public Task1_3(String lastName, String firstName, String middleName) {
        // Проверяет, не является ли lastName null. Если null, присваивает пустую строку, иначе присваивает значение lastName
        this.lastName = lastName != null ? lastName : "";
        // Проверяет, не является ли firstName null. Если null, присваивает пустую строку, иначе присваивает значение firstName
        this.firstName = firstName != null ? firstName : "";
        // Проверяет, не является ли middleName null. Если null, присваивает пустую строку, иначе присваивает значение middleName
        this.middleName = middleName != null ? middleName : "";
    }

    // Приватный вспомогательный метод isNotEmpty
    // Принимает строку str
    // Возвращает true, если строка не null и не пустая после удаления начальных или конечных пробелов, иначе false
    private boolean isNotEmpty(String str) {
        return str != null && !str.trim().isEmpty();
    }

    // Переопределение метода toString()
    // Возвращает строковое представление объекта
    @Override
    public String toString() {
        // Создает объект StringBuilder для эффективного построения строки
        StringBuilder result = new StringBuilder();

        // Проверяет, является ли фамилия непустой
        if (isNotEmpty(lastName)) {
            result.append(lastName); // Если фамилия непустая, добавляет ее к результату
        }

        if (isNotEmpty(firstName)) { // Проверяет, является ли имя непустым
            // Если результат уже содержит текст (была добавлена фамилия), добавляет пробел перед именем
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(firstName); // Добавляет имя к результату
        }

        if (isNotEmpty(middleName)) { // Проверяет, является ли отчество непустым
            if (result.length() > 0) { // Если результат уже содержит текст, добавляет пробел перед отчеством
                result.append(" ");
            }
            result.append(middleName); // Добавляет отчество к результату
        }

        return result.toString(); // Преобразует StringBuilder в строку и возвращает ее
    }

    // Публичный метод getLastName().
    // Возвращает значение приватной переменной lastName
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
}