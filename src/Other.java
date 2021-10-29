public class Other {
    private final String FirstName;
    private final String LastName;
    private final int Age;
    private final String Job;

    Other(String FirstName, String LastName, int Age, String Job)
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

    @Override
   public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Other that = (Other) o;

        if (Age != that.Age) return false;
        if (!FirstName.equals(that.FirstName)) return false;
        return LastName.equals(that.LastName);
    }


   @Override
    public int hashCode()
    {
        int result = FirstName.hashCode();
        result = 31 * result + LastName.hashCode();
        result = 31 * result + Age;
        return result;
    }

}
