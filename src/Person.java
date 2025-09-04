

import java.util.Objects;
import java.util.*;

public class Person {
    private String IDNum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;
    private Calendar calendar;

    public Person(String IDNum, String firstName, String lastName, String title, int age) {
        this.IDNum = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = age;
        this.calendar = Calendar.getInstance();
    }

    /**
     * creates a CSV data string that encodes all the data for this object instance
     * @return
     */
    public String toCVS() {
        return IDNum + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    /**
     * creates a JSON data string that encodes all the data for this object instance
     * @return
     */
    public String toJSON() {
        return "{" +
                "\"IDNum\":\"" + IDNum + "\"," +
                "\"firstName\":\"" + firstName + "\"," +
                "\"lastName\":\"" + lastName + "\"," +
                "\"title\":\"" + title + "\"," +
                "\"YOB\":" + YOB + "," +
                "}";
    }
    /**
     * creates a XML data string that encodes all the data for this object instance
     * @return
     */
    public String toXML() {
        String retString = "<Person>";
        retString += "<IDNum>" + IDNum + "</IDNum>";
        retString += "<firstName>" + firstName + "</firstName>";
        retString += "<lastName>" + lastName + "</lastName>";
        retString += "<title>" + title + "</title>";
        retString += "<YOB>" + YOB + "</YOB></Person>";
        return retString;
    }


    @Override
    public String toString() {
        return IDNum + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    public String getIDNum() {
        return IDNum;
    }

    /**
     * Sets the IDNum Seed to generate unique ordered IDs as we create Person Objects
     * @param IDNum - and int seed for the start of the IDNum generation
     */
    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public int getAge(int year) {
        return calendar.get(Calendar.YEAR) - year;
    }
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(IDNum, person.IDNum) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(title, person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDNum, firstName, lastName, title, YOB);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFormalName() {
        return title + " " + firstName + " " + lastName;
    }


}
