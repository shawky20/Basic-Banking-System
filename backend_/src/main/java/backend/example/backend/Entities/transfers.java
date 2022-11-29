package backend.example.backend.Entities;


import javax.persistence.*;

@Entity
@Table(name = "transfers")
public class transfers {
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "from_customer_id")
    private Customer fromCustomer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "to_customer_id")
    private Customer toCustomer;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getFromCustomer() {
        return fromCustomer;
    }

    public void setFromCustomer(Customer fromCustomer) {
        this.fromCustomer = fromCustomer;
    }

    public Customer getToCustomer() {
        return toCustomer;
    }

    public void setToCustomer(Customer toCustomer) {
        this.toCustomer = toCustomer;
    }
}
