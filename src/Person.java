public class Person {

    private String FirstName;
    private String LastName;
    private int Age;
    private String Job;

    Person(String FirstName, String LastName, int Age, String Job)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Job = Job;
    }

    public String getFirstName() {return FirstName;}
    public String getLastName() {return LastName;}
    public int getAge() {return Age;}
    public String getJob() {return Job;}



 }
