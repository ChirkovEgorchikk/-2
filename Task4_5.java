package Lab2;

// Объявление класса Task4_5, представляющего человека по ФИО
public class Task4_5 {
    private String firstName;
    private String lastName;
    private String middleName;

    // Конструктор класса Task4_5, принимающий только имя
    // Вызывает основной конструктор (this) с переданным именем, пустой фамилией и пустым отчеством
    public Task4_5(String firstName) {
        this(firstName, "", "");
    }

    // Конструктор класса Task4_5, принимающий имя и фамилию
    // Вызывает основной конструктор (this) с переданным именем, фамилией и пустым отчеством
    public Task4_5(String firstName, String lastName) {
        this(firstName, lastName, "");
    }

    // Основной конструктор класса Task4_5, принимающий имя, фамилию и отчество
    public Task4_5(String firstName, String lastName, String middleName) {
        this.firstName = firstName != null ? firstName : "";// Присваивает имя, если оно не null, иначе пустую строку
        this.lastName = lastName != null ? lastName : "";// Присваивает фамилию, если она не null, иначе пустую строку
        this.middleName = middleName != null ? middleName : "";// Присваивает отчество, если оно не null, иначе пустую строку
    }

    // Приватный вспомогательный метод для проверки, является ли строка непустой
    // Возвращает true, если строка не null и не содержит только пробелы
    private boolean isNotEmpty(String str) {
        return str != null && !str.trim().isEmpty();
    }

    // Переопределение метода toString() для вывода полного ФИО
    @Override
    public String toString() {
        // Создает StringBuilder для эффективного построения строки
        StringBuilder result = new StringBuilder();

        if (isNotEmpty(lastName)) {  // Если фамилия не пустая
            result.append(lastName);// Добавляет фамилию
        }

        if (isNotEmpty(firstName)) {  // Если имя не пустое
            if (result.length() > 0) {// Если в result уже что-то есть (фамилия), добавляет пробел
                result.append(" ");
            }
            result.append(firstName);
        }

        if (isNotEmpty(middleName)) {// Если отчество не пустое
            if (result.length() > 0) {// Если в result уже что-то есть (фамилия или имя), добавляет пробел
                result.append(" ");
            }
            result.append(middleName);
        }

        return result.toString();// Преобразует StringBuilder в строку и возвращает ее
    }

    public String getFirstName() { return firstName; } // метод для получения имени
    public String getLastName() { return lastName; } // для фамилии
    public String getMiddleName() { return middleName; } // для отчества
}