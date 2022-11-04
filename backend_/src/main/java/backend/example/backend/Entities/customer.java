package backend.example.backend.Entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "customer")
public class customer {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "student_sequence"
    )
    private long id;
    private String name;
    private String email;
    private  long currentBalance;

    @OneToMany(mappedBy ="fromCustomer")
    private List<transfers> fromTransfers;

    @OneToMany(mappedBy ="toCustomer")
    private List<transfers> toTransfers;


    public customer(long id, String name, String email, long currentBalance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.currentBalance = currentBalance;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }
}
