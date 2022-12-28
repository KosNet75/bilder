public class Person {
    protected final String name;
    protected final String surname;
    protected final int age;
    protected final String adress;
    protected final String happyBirthday;

    public Person(String name, String surname, int age, String adress, String happyBirthday) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
        this.happyBirthday = happyBirthday;
    }

    public static PersonBuilder newChildBuilder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return name;
    }


}

