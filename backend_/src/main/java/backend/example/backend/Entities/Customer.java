package backend.example.backend.Entities;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Table(name = "Customer")
public class Customer {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue( // 3shan mnb3tosh hwa yt3amel m3 nfso
            strategy = GenerationType.SEQUENCE,
            generator =  "student_sequence"
    )
     long id;
    private String name;
    private String email;
    private  long currentBalance;

    @OneToMany(mappedBy ="fromCustomer")
    private List<transfers> fromTransfers;

    @OneToMany(mappedBy ="toCustomer")
    private List<transfers> toTransfers;

//    public Customer() {
//    }

    public Customer(long id, String name, String email, long currentBalance) {
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
