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
    private customer fromCustomer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "to_customer_id")
    private customer toCustomer;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public customer getFromCustomer() {
        return fromCustomer;
    }

    public void setFromCustomer(customer fromCustomer) {
        this.fromCustomer = fromCustomer;
    }

    public customer getToCustomer() {
        return toCustomer;
    }

    public void setToCustomer(customer toCustomer) {
        this.toCustomer = toCustomer;
    }
}
