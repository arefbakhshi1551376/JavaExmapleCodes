package LinkedLists.Person;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Start
{
    static LinkedList<Person> personLinkedList = new LinkedList<>();
    static LinkedList<Job> jobLinkedList = new LinkedList<>();

    public static void main (String[] args)
    {
        String command = "";
        while (!command.equals("0"))
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    What do you want to do? \s
                    0. exit \s
                    1. List of data. \s
                    2. Add person. \s
                    3. Update person. \s
                    4. Delete person. \s
                    5. Count of persons. \s
                    6. Add job. \s
                    """);
            command = scanner.nextLine();

            switch (command)
            {
                case "1":
                {
                    getPersonsList();
                    break;
                }
                case "2":
                {
                    boolean isThisPersonAdded = isThisPersonAdded(scanner);
                    if (isThisPersonAdded)
                    {
                        System.out.println("The person added successfully!");
                    }
                    else
                    {
                        System.out.println("We can`t add this person!");
                    }
                    break;
                }
                case "3":
                {
                    boolean isThisPersonUpdated = isThisPersonUpdated(scanner);
                    if (isThisPersonUpdated)
                    {
                        System.out.println("The person updated successfully!");
                    }
                    else
                    {
                        System.out.println("We can`t update this person!");
                    }
                    break;
                }
                case "4":
                {
                    boolean isThisPersonDeleted = isThisPersonDeleted(scanner);
                    if (isThisPersonDeleted)
                    {
                        System.out.println("The person deleted successfully!");
                    }
                    else
                    {
                        System.out.println("We can`t delete this person!");
                    }
                    break;
                }
                case "5":
                {
                    int countOfPersons = personLinkedList.size();
                    System.out.println("Count of persons: " + countOfPersons);
                    break;
                }
                case "6":
                {
                    System.out.println("Enter job title: ");
                    String jobTitle = scanner.nextLine();
                    addJob(jobTitle);
                    break;
                }
            }
        }

    }

    private static boolean isThisPersonDeleted (Scanner scanner)
    {
        Person deletedPerson = null;
        System.out.println("Enter person data (such as first name etc.)");
        String searchStatement = scanner.nextLine();
        if (findPersonByPhoneNumber(searchStatement) != null)
        {
            deletedPerson = findPersonByPhoneNumber(searchStatement);
        }
        else if (findPersonByPhoneNumber(searchStatement) != null)
        {
            deletedPerson = findPersonByPhoneNumber(searchStatement);
        }
        else if (findPersonByEmail(searchStatement) != null)
        {
            deletedPerson = findPersonByEmail(searchStatement);
        }
        else if (findPersonByFirstName(searchStatement) != null)
        {
            deletedPerson = findPersonByFirstName(searchStatement);
        }
        else if (findPersonByLastName(searchStatement) != null)
        {
            deletedPerson = findPersonByLastName(searchStatement);
        }
        else if (findPersonByJob(searchStatement) != null)
        {
            deletedPerson = findPersonByJob(searchStatement);
        }

        if (deletedPerson != null)
        {
            getPersonsData(deletedPerson);
        }
        System.out.println("Do you want to delete this person? (y/n)");
        String userAnswer = scanner.nextLine();

        boolean isThisPersonDeleted = false;
        if (userAnswer.equalsIgnoreCase("y"))
        {
            isThisPersonDeleted = deletePerson(deletedPerson);
        }
        return isThisPersonDeleted;
    }

    private static boolean isThisPersonUpdated (Scanner scanner)
    {
        Person updatedPerson = null;
        System.out.println("Enter person data (such as first name etc.)");
        String searchStatement = scanner.nextLine();
        if (findPersonByPhoneNumber(searchStatement) != null)
        {
            updatedPerson = findPersonByPhoneNumber(searchStatement);
        }
        else if (findPersonByPhoneNumber(searchStatement) != null)
        {
            updatedPerson = findPersonByPhoneNumber(searchStatement);
        }
        else if (findPersonByEmail(searchStatement) != null)
        {
            updatedPerson = findPersonByEmail(searchStatement);
        }
        else if (findPersonByFirstName(searchStatement) != null)
        {
            updatedPerson = findPersonByFirstName(searchStatement);
        }
        else if (findPersonByLastName(searchStatement) != null)
        {
            updatedPerson = findPersonByLastName(searchStatement);
        }
        else if (findPersonByJob(searchStatement) != null)
        {
            updatedPerson = findPersonByJob(searchStatement);
        }

        if (updatedPerson != null)
        {
            getPersonsData(updatedPerson);
        }
        return updatePerson(updatedPerson);
    }

    private static void getPersonsData (Person person)
    {
        System.out.println("Data of person:\n" +
                person.getFirstName() + " " + person.getLastName() + "\n" +
                person.getEmail() + "\n" +
                person.getPhoneNumber() + "\n" +
                person.getAge() + "\n" +
                person.getJob().getTitle() + ".\n"
        );
    }

    private static void getPersonsList ()
    {
        if (personLinkedList.size() > 0)
        {
            for (Person person : personLinkedList)
            {
                System.out.println("List of data:\n" +
                        person.getFirstName() + " " + person.getLastName()
                );
            }
        }
        else
        {
            System.out.println("Nothing is here!");
        }
        System.out.println("================================================ \n");
    }

    private static boolean isThisPersonAdded (Scanner scanner)
    {
        boolean finalResult;
        try
        {
            System.out.println("Enter person data:");
            System.out.println("Enter person first name:");
            String firstName = scanner.nextLine();
            System.out.println("Enter person last name:");
            String lastName = scanner.nextLine();
            System.out.println("Enter person phone number:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter person email:");
            String email = scanner.nextLine();
            System.out.println("Enter person age:");
            int age = scanner.nextInt();
            Job currentJob = getPersonJob();
            Person newPerson = new Person(
                    firstName,
                    lastName,
                    email,
                    phoneNumber,
                    age,
                    currentJob
            );
            if (!isThisPersonExists(newPerson))
            {
                personLinkedList.add(newPerson);
                finalResult = true;
            }
            else
            {
                System.out.println("This person exists!");
                finalResult = false;
            }
        }
        catch (Exception e)
        {
            finalResult = false;
        }
        return finalResult;
    }

    private static boolean updatePerson (Person currentPerson)
    {
        boolean finalResult;
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("Enter person data:");
            System.out.println("Enter person first name:");
            String firstName = scanner.nextLine();
            System.out.println("Enter person last name:");
            String lastName = scanner.nextLine();
            System.out.println("Enter person phone number:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter person email:");
            String email = scanner.nextLine();
            System.out.println("Enter person age:");
            int age = scanner.nextInt();
            Job currentJob = getPersonJob();
            Person newPerson = new Person(
                    firstName,
                    lastName,
                    email,
                    phoneNumber,
                    age,
                    currentJob
            );
            int indexOfCurrentPerson = personLinkedList.indexOf(currentPerson);
            personLinkedList.remove(currentPerson);
            personLinkedList.add(indexOfCurrentPerson, newPerson);
            finalResult = true;
        }
        catch (Exception e)
        {
            finalResult = false;
        }
        return finalResult;
    }

    private static boolean deletePerson (Person currentPerson)
    {
        boolean finalResult;
        try
        {
            if (isThisPersonExists(currentPerson))
            {
                personLinkedList.remove(currentPerson);
            }
            else
            {
                System.out.println("This person does not exist!");
            }
            finalResult = true;
        }
        catch (Exception e)
        {
            finalResult = false;
        }
        return finalResult;
    }

    private static Job getPersonJob ()
    {
        Job currentJob = null;
        getJobsList();
        System.out.println("==========================================");
        System.out.println("Choose from the list above! (0 for add new job!)");
        Scanner scanner = new Scanner(System.in);
        String jobChoices = scanner.nextLine();
        if (Objects.equals(jobChoices, "0"))
        {
            System.out.println("Enter job title: ");
            String newJobTitle = scanner.nextLine();
            jobLinkedList.add(new Job(newJobTitle));
            getJobsList();
        }
        else
        {
            boolean isExists = isThisJobExists(jobChoices);
            if (!isExists)
            {
                System.out.println("This job does not exists!\n" +
                        "So we add it!");
                currentJob = addJob(jobChoices);
            }
            else
            {
                currentJob = findJob(jobChoices);
            }
        }
        return currentJob;
    }

    private static boolean isThisJobExists (String jobChoices)
    {
        boolean finalResult = false;
        for (Job job :
                jobLinkedList)
        {
            if (Objects.equals(job.getTitle(), jobChoices))
            {
                finalResult = true;
                break;
            }
        }
        return finalResult;
    }

    private static Job findJob (String jobChoices)
    {
        Job finalResult = null;
        for (Job job :
                jobLinkedList)
        {
            if (Objects.equals(job.getTitle(), jobChoices))
            {
                finalResult = job;
                break;
            }
        }
        return finalResult;
    }

    private static boolean isThisPersonExists (Person newPerson)
    {
        boolean finalResult = false;
        for (Person person :
                personLinkedList)
        {
            if (
                    Objects.equals(person.getFirstName(), newPerson.getFirstName())
                            && Objects.equals(person.getLastName(), newPerson.getLastName())
                            && person.getAge() == newPerson.getAge()
            )
            {
                finalResult = true;
                break;
            }
        }
        return finalResult;
    }

    private static Person findPersonByFirstName (String searchStatement)
    {
        Person finalResult = null;
        for (Person person :
                personLinkedList)
        {
            if (Objects.equals(person.getFirstName(), searchStatement))
            {
                finalResult = person;
                break;
            }
        }
        return finalResult;
    }

    private static Person findPersonByLastName (String searchStatement)
    {
        Person finalResult = null;
        for (Person person :
                personLinkedList)
        {
            if (Objects.equals(person.getLastName(), searchStatement))
            {
                finalResult = person;
                break;
            }
        }
        return finalResult;
    }

    private static Person findPersonByEmail (String searchStatement)
    {
        Person finalResult = null;
        for (Person person :
                personLinkedList)
        {
            if (Objects.equals(person.getEmail(), searchStatement))
            {
                finalResult = person;
                break;
            }
        }
        return finalResult;
    }

    private static Person findPersonByPhoneNumber (String searchStatement)
    {
        Person finalResult = null;
        for (Person person :
                personLinkedList)
        {
            if (Objects.equals(person.getPhoneNumber(), searchStatement))
            {
                finalResult = person;
                break;
            }
        }
        return finalResult;
    }


    private static Person findPersonByJob (String searchStatement)
    {
        Person finalResult = null;
        for (Person person :
                personLinkedList)
        {
            if (Objects.equals(person.getJob().getTitle(), searchStatement))
            {
                finalResult = person;
                break;
            }
        }
        return finalResult;
    }

    private static Job addJob (String jobChoices)
    {
        Job finalResult;
        if (!isThisJobExists(jobChoices))
        {
            finalResult = new Job(jobChoices);
            jobLinkedList.add(finalResult);
        }
        else
        {
            finalResult = findJob(jobChoices);
        }
        return finalResult;
    }

    private static void getJobsList ()
    {
        System.out.println("List of jobs:");
        for (Job job :
                jobLinkedList)
        {
            System.out.println(
                    job.getTitle()
            );
        }
    }
}
