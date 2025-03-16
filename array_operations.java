import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. TRAVERSE ARRAY");
            System.out.println("2. INSERT ELEMENT");
            System.out.println("3. SEARCH ELEMENT");
            System.out.println("4. DELETE ELEMENT");
            System.out.println("5. EXIT");
            System.out.println("\n");
            System.out.print("Enter your choice: ");

 // Reading the user's choice
 choice = scanner.nextInt();

 switch (choice) {
 case 1:
5
 // Traversal
 System.out.println("Array elements:");
 for (int i = 0; i < arr.length; i++) {
 System.out.print(arr[i] + " ");
 }
 System.out.println(); // For new line after traversal
 break;
 case 2:
 // Insertion
 System.out.println("Enter the element to insert: ");
 int newElement = scanner.nextInt();
 int[] nArr = new int[arr.length + 1]; 
 // Creating new array with one extra element

 // Copying elements of arr to nArr
 for (int i = 0; i < arr.length; i++) {
 nArr[i] = arr[i];
 }
 nArr[arr.length] = newElement; // Insert the new
element at the end

 arr = nArr; // Update arr to the new array
 System.out.println("After insertion:");
 for (int num : arr) {
 System.out.print(num + " ");
 }
 System.out.println(); // For new line
 break;
 case 3:
 // Searching
 System.out.print("Enter the element to search: ");
 int searchKey = scanner.nextInt();
 boolean found = false;
 for (int num : arr) {
 if (num == searchKey) {
 found = true;
 break;
 }
 }
 System.out.println("Element " + searchKey + (found ? "
found." : " not found."));
 break;
 case 4:
 // Deletion
 System.out.print("Enter the element to delete: ");
 int deleteKey = scanner.nextInt();
 int[] uArr = new int[arr.length - 1];
 int index = 0;
 // Copy elements to uArr, skipping the deleteKey
 for (int num : arr) {
 if (num != deleteKey) {
 uArr[index++] = num;
 }
 }
 arr = uArr; // Update arr to the new array
 System.out.println("After deletion:");
 for (int num : arr) {
 System.out.print(num + " ");
 }
 System.out.println(); // For new line
 break;
 case 5:
 // Exit
 System.out.println("Sayonara!");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");
 }
 } while (choice != 5); // Continue looping until user chooses to
exit
 scanner.close();
 }
}
