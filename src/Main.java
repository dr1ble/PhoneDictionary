import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneDict work = new PhoneDict();
        System.out.println("Это телефонный справочник. \nЕсть такие команды как: \nдобавить контакт | add; удалить контакт | delete; " +
                "найти контакт (по номеру) | find; список контактов | show; q - для выхода из программы.");
        while (true){
            System.out.print("\nВведите комманду: ");
            String com = sc.nextLine().strip();
            if(com.toLowerCase().equals("добавить контакт")
                    || com.toLowerCase().equals("add")){
                System.out.print("Введите Имя Контакта: ");
                String name = sc.nextLine();
                System.out.print("Введите Номер Телефона: ");
                String number = sc.nextLine();
                work.addAbonent(name, number);
            }
            else if(com.toLowerCase().equals("удалить контакт")
                    ||com.toLowerCase().equals("delete")){
                System.out.print("Введите Имя Контакта, Которого нужно удалить: ");
                String name = sc.nextLine();
                work.deleteAbonent(name);
            }
            else if(com.toLowerCase().equals("найти контакт")
                    ||com.toLowerCase().equals("find")){
                System.out.print("Введите номер контакта, Которого нужно найти: ");
                String number = sc.nextLine();
                work.findName(number);
            }
            else if(com.toLowerCase().equals("список контактов")
                    ||com.toLowerCase().equals("show")){
                work.toPrint();
            }
            else if(com.equals("q")){
                System.exit(1);
            }
        }
    }
}
