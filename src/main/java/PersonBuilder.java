public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String adress;
    private String happyBirthday;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст меньше 0");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return this;
    }

    public PersonBuilder sethappyBirthday(String happyBirthday) {
        this.happyBirthday = happyBirthday;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalArgumentException("Не заполнены обязательные поля");
        }

        return new Person(name, surname, age, adress, happyBirthday);
    }
}
