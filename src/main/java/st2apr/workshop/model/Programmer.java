package st2apr.workshop.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 100)
    String lastName;

    @Column(nullable = false, length = 100)
    String firstName;

    String address;
    String expertiseLanguage;
    String favoriteBook;
    BigDecimal salary;

    public Programmer() {}

    public Programmer(Long id, String lastName, String firstName, String address, String expertiseLanguage, String favoriteBook, BigDecimal salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.expertiseLanguage = expertiseLanguage;
        this.favoriteBook = favoriteBook;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExpertiseLanguage() {
        return expertiseLanguage;
    }

    public void setExpertiseLanguage(String expertiseLanguage) {
        this.expertiseLanguage = expertiseLanguage;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public void setFavoriteBook(String favoriteBook) {
        this.favoriteBook = favoriteBook;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", expertiseLanguage='" + expertiseLanguage + '\'' +
                ", favoriteBook='" + favoriteBook + '\'' +
                ", salary=" + salary +
                '}';
    }
}
