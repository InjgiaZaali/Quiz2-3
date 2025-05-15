package oop.q3;

public class Student {

    private String name;
    private String surname;
    private String country;
    private String info;

    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public String toString() {
        return "Student: " + name + " " + surname + ", from " + country;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student s = (Student) obj;

        if (name != null ? !name.equals(s.name) : s.name != null) return false;
        if (surname != null ? !surname.equals(s.surname) : s.surname != null) return false;
        return country != null ? country.equals(s.country) : s.country == null;
    }
}

