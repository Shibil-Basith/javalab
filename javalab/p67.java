import java.util.*;

class InvalidVoterAgeException extends Exception {
    InvalidVoterAgeException(String message)
    {
            super(message);
    }
}


class Voter{
    String name;
    int age;

    Voter(String name, int age)
    {
        this.name = name;
        this.age =age;
    }

    void checkEligibility() throws InvalidVoterAgeException
    {
        if(age<18)
        {
            throw new InvalidVoterAgeException("Voter " + name + " is not eligible to vote due to age less than eighteen.");
        }
        else
        {
            System.out.println("Voter " + name + " is eligible to vote.");
        }
        
    }
}


class p67
{
    public static void main(String args[])
    {
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter name: ");
            name = input.nextLine();
            System.out.println("Enter age: ");
            age = input.nextInt();
            Voter v = new Voter(name, age);
            v.checkEligibility();
        }
        catch(InvalidVoterAgeException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}