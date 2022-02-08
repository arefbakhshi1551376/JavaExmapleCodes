package ArrayLists.PhoneNoteBook;

public class PhoneNumber
{
    private int id;
    private String phoneNumber;

    public PhoneNumber ()
    {
    }

    public PhoneNumber (int id, String phoneNumber)
    {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}
