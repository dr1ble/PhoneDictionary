import java.util.HashMap;
import java.util.Map;

public class PhoneDict {
    private Map<String, String> abonents = new HashMap<>();
    public void addAbonent(String name, String number) {
        abonents.put(name, number);
        System.out.println("Контакт добавлен: " + name + " | " + number);
    }
    public void deleteAbonent(String name) {
        if (abonents.containsKey(name)) {
            abonents.remove(name);
            System.out.println("Контакт удален");
        } else {
            System.out.println("Такого контакта нет");
        }
    }
    public String findName(String phoneNumber) {
        for (String name : abonents.keySet()) {
            if (abonents.get(name).equals(phoneNumber)) {
                String surname [] = name.split(" ");
                System.out.println("По номеру: " + phoneNumber + " Находится контакт с фамилией: " + surname[0]);
            }
        }
        System.out.println("По данному номеру нет контакта");
        return null;
    }
    public void toPrint(){
        System.out.println("\nВаш список контактов: ");
        for (String key: abonents.keySet()) {
            System.out.println(key + " | " + abonents.get(key));
        }
        if(abonents.size() == 0){
            System.out.println("Список контактов пуст");
        }
    }
}
