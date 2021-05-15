package moviereservation;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Seats_table")
public class Seats {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @PrePersist
    public void onPrePersist(){
        SeatAssigned seatAssigned = new SeatAssigned();
        BeanUtils.copyProperties(this, seatAssigned);
        seatAssigned.publishAfterCommit();


        SeatCancelled seatCancelled = new SeatCancelled();
        BeanUtils.copyProperties(this, seatCancelled);
        seatCancelled.publishAfterCommit();

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        moviereservation.external.Ticketing ticketing = new moviereservation.external.Ticketing();
        // mappings goes here
        Application.applicationContext.getBean(moviereservation.external.TicketingService.class)
            .cancelTicket(ticketing);


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
