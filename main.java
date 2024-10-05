import java.util.*;
import java.io.*;

class Codechef {

    
    public void Welcome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?");
        
        String name = scanner.nextLine();
        
        System.out.printf("Welcome %s, to the program%n", name);
        
        String[] choices = {
            "1. Add new Item",
            "2. Update new Item",
            "3. View Items",
            "4. Delete Item",
            "5. Clear the list"
        };
        
        for (String cho : choices) {
            System.out.println(cho);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int choice = scanner.nextInt();
        scanner.close();
        
        switch (choice) {
            case 1:
                AddingNewItem();
                break;
            case 2:
                UpdateItems();
                break;
            case 3:
                ViewItems();
                break;
            case 4:
                DeleteItem();
                break;
            case 5:
                ClearTheList();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
    public static void AddingNewItem() {
        Scanner newItem = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
            System.out.println("Enter something to the list !");
            String item = newItem.nextLine();
            writer.write(item + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            newItem.close();
        }
    }
    
    public static void UpdateItems() {
        
    }
    
    public static void ViewItems() {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void DeleteItem() {
        
    }
    
    public static void ClearTheList() {
        
    }
    
    public static void main(String[] args) {
        Codechef codechef = new Codechef();
        codechef.Welcome(); 
    }
}
