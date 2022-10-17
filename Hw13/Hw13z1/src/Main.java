import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void addTask(List<String> arr, String text) {
        arr.add(text);
    }
    public static boolean removeTask(List<String> arr, int taskIndex) {
        if (taskIndex > 0 && taskIndex <= arr.size()) {
            arr.remove(taskIndex-1);
            return true;
        } else return false;
    }
    public static void showTaskList(List<String> arr) {
        System.out.println(arr.size() > 0 ? "Список задач:" : "Нет задач.");
        for (int cnt = 0; cnt < arr.size(); cnt++) {
            System.out.println(cnt+1 + ". " + arr.get(cnt));
        }
    }
    
    public static void main(String[] args) {

        List<String> noteBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int input;
        do {
            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input = -1;
            }
            String taskText;
            switch (input) {
                case 1:
                    System.out.println("Введите задачу для планирования:");
                    taskText = scanner.nextLine();
                    addTask(noteBook, taskText);
                    System.out.println("Задача добавлена");
                    break;
                case 2:
                    showTaskList(noteBook);
                    break;
                case 3:
                    System.out.println("Введите задачу для Yдаления:");
                    int removeTaskIndex = -1;
                    try {
                        removeTaskIndex = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Проблема. Нужно ввести номер задачи.");
                    }
                    if(removeTaskIndex > 0) {
                        if (removeTask(noteBook, removeTaskIndex)) {
                        System.out.println("Задача удалена.");
                        } else System.out.println("Задача не удалена. Некорректный номер задачи.");
                    } 
                case 0:
                    break;
                default:
                    System.out.println("Incoorect command.");
                    break;
            }
        } while (input != 0);
        System.out.println("До свидания!");
    }
}
