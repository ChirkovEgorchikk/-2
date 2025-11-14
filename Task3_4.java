package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Task3_4 { // Объявление класса Task3_4, представляющего сотрудника
    private String name; // Приватная переменная для хранения имени сотрудника
    private Department3_4 department; // Приватная переменная для хранения отдела, в котором работает сотрудник

    // Конструктор класса Task3_4
    // Принимает имя сотрудника и объект отдела
    public Task3_4(String name, Department3_4 department) {
        this.name = name; // Присваивает переданное имя сотруднику
        this.department = department; // Присваивает переданный отдел сотруднику
        this.department.addEmployee(this); // Добавляет текущего сотрудника (this) в список сотрудников его отдела
    }

    // метод для получения имени сотрудника
    public String getName() {
        return name;
    }

    // метод для получения объекта отдела, в котором работает сотрудник
    public Department3_4 getDepartment() {
        return department;
    }

    // метод для проверки, является ли сотрудник начальником своего отдела
    // Сравнивает текущий объект сотрудника с начальником, установленным в его отделе
    public boolean isHeadOfDepartment() {
        return this.department.getHead() == this;
    }

    // метод для получения списка всех сотрудников отдела, в котором работает текущий сотрудник
    // Передаёт запрос объекту отдела
    public List<Task3_4> getDepartmentEmployees() {
        return this.department.getEmployees();
    }

    // Переопределение метода toString() для вывода информации о сотруднике в читаемом виде
    @Override
    public String toString() {
        if (isHeadOfDepartment()) { // Если сотрудник является начальником отдела
            // Возвращает строку формата "Имя начальник отдела НазваниеОтдела"
            return name + " начальник отдела " + department.getName();
        } else {
            // Если сотрудник не начальник, возвращает строку формата "Имя работает в отделе Название Отдела,
            // начальник которого "Имя Начальника"
            return name + " работает в отделе " + department.getName() +
                    ", начальник которого " + department.getHead().getName();
        }
    }
}

// Объявление класса Department3_4, представляющего отдел
class Department3_4 {
    private String name; // Приватная переменная для хранения названия отдела
    private Task3_4 head; // Приватная переменная для хранения ссылки на начальника отдела
    private List<Task3_4> employees; // Приватная переменная (список) для хранения сотрудников отдела

    // Конструктор класса Department3_4.
    // Принимает название отдела
    public Department3_4(String name) {
        this.name = name; // Присваивает переданное название отделу
        this.employees = new ArrayList<>(); // Создаёт список сотрудников как новый пустой ArrayList
    }

    // метод для получения названия отдела
    public String getName() {
        return name;
    }

    // метод для получения объекта сотрудника, который является начальником отдела
    public Task3_4 getHead() {
        return head;
    }

    // метод для установки начальника отдела
    // Присваивает переданного сотрудника в качестве начальника
    public void setHead(Task3_4 head) {
        this.head = head;
    }

    // метод для добавления сотрудника в список отдела
    public void addEmployee(Task3_4 employee) {
        if (!employees.contains(employee)) {// Проверяет, что сотрудника еще нет в списке, чтобы избежать дубликатов
            employees.add(employee);
        }
    }

    // метод для получения списка всех сотрудников отдела
    public List<Task3_4> getEmployees() {
        // Возвращает новую копию списка сотрудников
        return new ArrayList<>(employees);
    }

    // метод для получения количества сотрудников в отделе
    // Возвращает размер списка сотрудников
    public int getEmployeeCount() {
        return employees.size();
    }
}