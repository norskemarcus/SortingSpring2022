package kea.spring2022.sorting;

public class Person implements Sammenlignbar, Comparable {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }

    @Override
    public boolean sorteresEfter(Sammenlignbar andetObjekt) {
        Person andenPerson = (Person) andetObjekt;

        if(this.firstName.compareTo(andenPerson.firstName) > 0){
            return true;
        } else
            return false;
        //return firstName.compareTo(andenPerson.firstName) > 0;
    }

    @Override
    public int compareTo(Object o) {
        Person andenPerson = (Person)o;
        return this.firstName.compareTo(andenPerson.firstName);
    }
}
