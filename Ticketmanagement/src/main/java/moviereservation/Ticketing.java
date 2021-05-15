package moviereservation;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Ticketing_table")
public class Ticketing {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @PrePersist
    public void onPrePersist(){
        TicketReserved ticketReserved = new TicketReserved();
        BeanUtils.copyProperties(this, ticketReserved);
        ticketReserved.publishAfterCommit();


        TicketCancelled ticketCancelled = new TicketCancelled();
        BeanUtils.copyProperties(this, ticketCancelled);
        ticketCancelled.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
