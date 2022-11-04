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

}
