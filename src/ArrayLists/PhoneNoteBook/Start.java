package ArrayLists.PhoneNoteBook;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Start
{
    static ArrayList<PhoneNumber> phoneNumberArrayList = new ArrayList<>();

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "";
        while (!Objects.equals(userAnswer, "0"))
        {
            System.out.println("""
                    Choose from the list below: \s
                    0. Exit. \s
                    1. List of items. \s
                    2. Add item. \s
                    3. Update item. \s
                    4. Remove an item.
                    """);
            userAnswer = scanner.nextLine();
            switch (userAnswer)
            {
                case "1":
                {
                    getListOfData();
                    break;
                }
                case "2":
                {
                    addItemToList(scanner);
                    break;
                }
                case "3":
                {
                    updateItemFromList(scanner);
                    break;
                }
                case "4":
                {
                    deleteItemFromList(scanner);
                    break;
                }
            }
        }
    }

    private static void deleteItemFromList (Scanner scanner)
    {
        System.out.println("Enter phone number: ");
        String phoneNumberAsString = scanner.nextLine();
        boolean isThisItemExists = isItemExists(phoneNumberAsString);
        if (isThisItemExists)
        {
            PhoneNumber currentPhoneNumber = findItem(phoneNumberAsString);

            boolean isItemDeleted = deleteItem(currentPhoneNumber);
            if (isItemDeleted)
            {
                System.out.println("Item deleted successfully!");
            }
        }
        else
        {
            System.out.println("This item does not exist!");
        }
    }

    private static void updateItemFromList (Scanner scanner)
    {
        System.out.println("Enter phone number: ");
        String phoneNumberAsString = scanner.nextLine();
        boolean isThisItemExists = isItemExists(phoneNumberAsString);
        if (isThisItemExists)
        {
            PhoneNumber currentPhoneNumber = findItem(phoneNumberAsString);

            System.out.println("Enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            boolean isUpdatedItemExists = isItemExists(newPhoneNumber);

            if (!isUpdatedItemExists)
            {
                PhoneNumber newPhoneNumberInstance = new PhoneNumber(currentPhoneNumber.getId(), newPhoneNumber);
                boolean isItemUpdated = updateItem(newPhoneNumberInstance);
                if (isItemUpdated)
                {
                    System.out.println("Item updated successfully!");
                }
            }
            else
            {
                System.out.println("An item with the same phone number exists!");
            }
        }
        else
        {
            System.out.println("This item does not exist!");
        }
    }

    private static void addItemToList (Scanner scanner)
    {
        System.out.println("Enter phone number: ");
        String currentPhoneNumber = scanner.nextLine();
        boolean isThisItemExists = isItemExists(currentPhoneNumber);
        if (!isThisItemExists)
        {
            ArrayList<Integer> currentIdList = getPhoneNumberIdList();
            int maxId = getMaxId(currentIdList);
            int currentPhoneNumberId;
            if (maxId == -1)
            {
                currentPhoneNumberId = 1;
            }
            else
            {
                currentPhoneNumberId = maxId + 1;
            }
            PhoneNumber currentPhoneNumberInstance = new PhoneNumber(currentPhoneNumberId, currentPhoneNumber);
            boolean isItemAdded = addItem(currentPhoneNumberInstance);
            if (isItemAdded)
            {
                System.out.println("Item added successfully!");
            }
        }
        else
        {
            System.out.println("This item exists!");
        }
    }

    private static void getListOfData ()
    {
        System.out.println("List of data:\n");
        for (PhoneNumber phoneNumber :
                phoneNumberArrayList)
        {
            System.out.println("PN " + phoneNumber.getId() + " : " + phoneNumber.getPhoneNumber());
        }
    }

    public static ArrayList<Integer> getPhoneNumberIdList ()
    {
        ArrayList<Integer> finalResult = new ArrayList<>();
        for (PhoneNumber phoneNumber :
                phoneNumberArrayList)
        {
            finalResult.add(phoneNumber.getId());
        }
        return finalResult;
    }

    public static int getMaxId (ArrayList<Integer> phoneNumberIdList)
    {
        int finalResult = -1;
        if (phoneNumberIdList.size() > 0)
        {
            for (int id :
                    phoneNumberIdList)
            {
                if (id > finalResult)
                {
                    finalResult = id;
                }
            }
        }
        return finalResult;
    }

    public static boolean addItem (PhoneNumber phoneNumber)
    {
        boolean finalResult;
        try
        {
            phoneNumberArrayList.add(phoneNumber);
            finalResult = true;
        }
        catch (Exception e)
        {
            finalResult = false;
            System.out.println(e.getMessage());
        }
        return finalResult;
    }

    public static boolean isItemExists (int id)
    {
        boolean finalResult = false;
        for (PhoneNumber phoneNumber :
                phoneNumberArrayList)
        {
            if (phoneNumber.getId() == id)
            {
                finalResult = true;
                break;
            }
        }
        return finalResult;
    }

    public static boolean isItemExists (String phoneNumberAsString)
    {
        boolean finalResult = false;
        for (PhoneNumber phoneNumber :
                phoneNumberArrayList)
        {
            if (Objects.equals(phoneNumber.getPhoneNumber(), phoneNumberAsString))
            {
                finalResult = true;
                break;
            }
        }
        return finalResult;
    }

    public static PhoneNumber findItem (int id)
    {
        PhoneNumber finalResult = null;
        if (isItemExists(id))
        {
            for (PhoneNumber phoneNumber :
                    phoneNumberArrayList)
            {
                if (phoneNumber.getId() == id)
                {
                    finalResult = phoneNumber;
                    break;
                }
            }
        }
        else
        {
            System.out.println("This phone number is not exists!");
        }
        return finalResult;
    }

    public static PhoneNumber findItem (String phoneNumberAsString)
    {
        PhoneNumber finalResult = null;
        if (isItemExists(phoneNumberAsString))
        {
            for (PhoneNumber phoneNumber :
                    phoneNumberArrayList)
            {
                if (Objects.equals(phoneNumber.getPhoneNumber(), phoneNumberAsString))
                {
                    finalResult = phoneNumber;
                    break;
                }
            }
        }
        else
        {
            System.out.println("This phone number is not exists!");
        }
        return finalResult;
    }

    public static boolean updateItem (PhoneNumber newPhoneNumber)
    {
        boolean finalResult;
        try
        {
            PhoneNumber currentPhoneNumber = findItem(newPhoneNumber.getId());
            if (currentPhoneNumber != null)
            {
                int index = phoneNumberArrayList.indexOf(currentPhoneNumber);
                phoneNumberArrayList.remove(currentPhoneNumber);
                phoneNumberArrayList.add(index, newPhoneNumber);
            }
            finalResult = true;
        }
        catch (Exception e)
        {
            finalResult = false;
            System.out.println(e.getMessage());
        }
        return finalResult;
    }

    public static boolean deleteItem (PhoneNumber phoneNumber)
    {
        boolean finalResult;
        try
        {
            PhoneNumber currentPhoneNumber = findItem(phoneNumber.getId());
            if (currentPhoneNumber != null)
            {
                phoneNumberArrayList.remove(currentPhoneNumber);
            }
            finalResult = true;
        }
        catch (Exception e)
        {
            finalResult = false;
            System.out.println(e.getMessage());
        }
        return finalResult;
    }
}
