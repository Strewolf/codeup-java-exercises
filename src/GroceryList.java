import java.util.HashMap;
import java.util.Scanner;

public class GroceryList {
    private HashMap<String, HashMap<String, Integer>> list;
    private String[] categories;

    public GroceryList(String[] categories) {
        this.categories = categories;
        list = new HashMap<String, HashMap<String, Integer>>();
        for (String category : categories) {
            list.put(category, new HashMap<String, Integer>());
        }
    }

    public void addItem(String category, String item, int quantity) {
        if (list.containsKey(category)) {
            HashMap<String, Integer> categoryList = list.get(category);
            if (categoryList.containsKey(item)) {
                int currentQuantity = categoryList.get(item);
                categoryList.put(item, currentQuantity + quantity);
            } else {
                categoryList.put(item, quantity);
            }
        } else {
            System.out.println("Invalid category.");
        }
    }

//    public void editItem(String category, String item, int newQuantity) {
//        if (!list.containsKey(category)) {
//            System.out.println("Error: category not found in list.");
//            return;
//        }
//
//        if (!list.get(category).containsKey(item)) {
//            System.out.println("Error: item not found in category.");
//            return;
//        }
//
//        int oldQuantity = list.get(category).get(item);
//        list.get(category).put(item, newQuantity);
//
//        System.out.println("Item updated: " + category + " - " + item + " (" + oldQuantity + ") => " + category + " - " + item + " (" + newQuantity + ")");
//    }
public void editGroceryListItem(String oldCategory, String oldItemName, String newCategory, String newItemName, int newQuantity) {
    if (!list.containsKey(oldCategory)) {
        System.out.println("Error: category not found in list.");
        return;
    }

    if (!list.get(oldCategory).containsKey(oldItemName)) {
        System.out.println("Error: item not found in category.");
        return;
    }

    int oldQuantity = list.get(oldCategory).remove(oldItemName);

    if (newCategory.equals(oldCategory)) {
        list.get(newCategory).put(newItemName, newQuantity);
    } else {
        HashMap<String, Integer> newCategoryMap = list.getOrDefault(newCategory, new HashMap<>());
        newCategoryMap.put(newItemName, newQuantity);
        list.put(newCategory, newCategoryMap);
    }

    System.out.println("Item updated: " + oldCategory + " - " + oldItemName + " (" + oldQuantity + ") => " + newCategory + " - " + newItemName + " (" + newQuantity + ")");
}


    public void removeItem(String category, String item) {
        if (list.containsKey(category)) {
            if (list.get(category).containsKey(item)) {
                list.get(category).remove(item);
                System.out.println("Item removed: " + category + " - " + item);
            } else {
                System.out.println("Error: item not found in category.");
            }
        } else {
            System.out.println("Error: category not found in list.");
        }
    }

    public void printList() {
        System.out.println("Grocery List:");
        for (String category : categories) {
            System.out.println(category + ":");
            HashMap<String, Integer> categoryList = list.get(category);
            for (String item : categoryList.keySet()) {
                int quantity = categoryList.get(item);
                System.out.println("  " + item + ": " + quantity);
            }
        }
    }

    public static void main(String[] args) {
        String[] categories = {"Produce", "Dairy", "Meat", "Canned Goods", "Bakery"};
        GroceryList groceryList = new GroceryList(categories);
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Would you like to create a grocery list? (y/n)");
            String createList = scanner.nextLine();
            if (createList.equalsIgnoreCase("y")) {
                while (true) {
                    System.out.println("Would you like to enter a new item or edit/delete an existing item? (n/e/d)");
                    String choiceString = scanner.nextLine();
                    if (choiceString.equalsIgnoreCase("n")) {
                        System.out.println("Select a category:");
                        for (int i = 0; i < categories.length; i++) {
                            System.out.println((i + 1) + ". " + categories[i]);
                        }
                        int categoryIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // clear input buffer
                        System.out.println("Enter the name of the item:");
                        String itemName = scanner.nextLine();
                        System.out.println("Enter the quantity:");
                        int itemQuantity = scanner.nextInt();
                        scanner.nextLine(); // clear input buffer
                        groceryList.addItem(categories[categoryIndex], itemName, itemQuantity);
                    } else if (choiceString.equalsIgnoreCase("e")) {
                        System.out.println("Enter the category of the item you would like to edit:");
                        String oldCategory = scanner.nextLine();
                        System.out.println("Enter the name of the item you would like to edit:");
                        String oldItemName = scanner.nextLine();
                        System.out.println("Enter the new category of the item:");
                        String newCategory = scanner.nextLine();
                        System.out.println("Enter the new name of the item:");
                        String newItemName = scanner.nextLine();
                        System.out.println("Enter the new quantity of the item:");
                        int newQuantity = scanner.nextInt();
                        scanner.nextLine(); // clear input buffer
                        groceryList.editGroceryListItem(oldCategory, oldItemName, newCategory, newItemName, newQuantity);
                    } else if (choiceString.equalsIgnoreCase("d")) {
                        System.out.println("Enter the name of the item you would like to delete:");
                        String itemName = scanner.nextLine();
                        System.out.println("Enter the category of the item you would like to delete:");
                        String category = scanner.nextLine();
                        groceryList.removeItem(category, itemName);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    System.out.println("Would you like to enter another item or edit/delete another item? (y/n)");
                    String newItem = scanner.nextLine();
                    if (newItem.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                groceryList.printList();
            } else if (createList.equalsIgnoreCase("n")) {
                quit = true;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}