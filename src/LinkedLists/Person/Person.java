package LinkedLists.Person;

public class Person
{
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int age;
    private Job job;

    public Person ()
    {
    }

    public Person (String firstName, String lastName, String email, String phoneNumber, int age, Job job)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.job = job;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public int getAge ()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    public Job getJob ()
    {
        return job;
    }

    public void setJob (Job job)
    {
        this.job = job;
    }
}
