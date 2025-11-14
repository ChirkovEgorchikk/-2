package Lab2;

public class Task2_4 {
    private String name; // Объявление приватной переменной name типа String для хранения имени сотрудника
    // Объявление приватной переменной department типа Department для хранения отдела, в котором работает сотрудник
    private Department department;

    // Конструктор класса Task2_4
    // Принимает имя сотрудника и объект отдела в качестве параметров
    public Task2_4(String name, Department department) {
        this.name = name; // Присваивает значение параметра name приватной переменной this.name
        this.department = department; // Присваивает значение параметра department приватной переменной this.department
    }

    // Публичный метод getName()
    // Возвращает имя сотрудника
    public String getName() {
        return name;
    }

    // Публичный метод isHeadOfDepartment().
    // Проверяет, является ли сотрудник начальником отдела
    // Сравнивает текущий объект Task2_4 (this) с начальником отдела, полученным из объекта department
    // Если они совпадают, возвращает true (сотрудник является начальником отдела), иначе false
    public boolean isHeadOfDepartment() {
        return this.department.getHead() == this;
    }

    // Переопределение метода toString()
    // Возвращает строковое представление объекта Task2_4
    @Override
    public String toString() {
        if (isHeadOfDepartment()) { // Проверяет, является ли сотрудник начальником отдела
            // Если сотрудник является начальником отдела, возвращает строку, указывающую,
            // что сотрудник является начальником отдела и название отдела
            return name + " начальник отдела " + department.getName();
        } else {
            // Если сотрудник не является начальником отдела, возвращает строку, указывающую,
            // что сотрудник работает в отделе, название отдела и имя начальника отдела
            return name + " работает в отделе " + department.getName() +
                    ", начальник которого " + department.getHead().getName();
        }
    }
}

// Класс Department
class Department {
    private String name;// Объявление приватной переменной name типа String для хранения названия отдела
    // Объявление приватной переменной head типа Task2_4 для хранения ссылки на начальника отдела (объект Task2_4)
    private Task2_4 head;

    // Конструктор класса Department.
    // Принимает название отдела в качестве параметра
    public Department(String name) {
        this.name = name; // Присваивает значение параметра name приватной переменной this.name
    }

    // Публичный метод getName().
    // Возвращает название отдела
    public String getName() {
        return name;
    }

    // Публичный метод getHead().
    // Возвращает объект Task2_4, представляющий начальника отдела
    public Task2_4 getHead() {
        return head;
    }

    // Публичный метод setHead().
    // Устанавливает начальника отдела
    public void setHead(Task2_4 head) {
        this.head = head;
    }
}