package moviereservation;

import moviereservation.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTicketReserved_CheckProcess(@Payload TicketReserved ticketReserved){

        if(ticketReserved.isMe()){
            System.out.println("##### listener CheckProcess : " + ticketReserved.toJson());
            System.out.println();
            System.out.println();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTicketCancelled_CheckProcess(@Payload TicketCancelled ticketCancelled){

        if(ticketCancelled.isMe()){
            System.out.println("##### listener CheckProcess : " + ticketCancelled.toJson());
            System.out.println();
            System.out.println();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserved_CheckProcess(@Payload Reserved reserved){

        if(reserved.isMe()){
            System.out.println("##### listener CheckProcess : " + reserved.toJson());
            System.out.println();
            System.out.println();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCancelled_CheckProcess(@Payload Cancelled cancelled){

        if(cancelled.isMe()){
            System.out.println("##### listener CheckProcess : " + cancelled.toJson());
            System.out.println();
            System.out.println();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayCancelled_CheckProcess(@Payload PayCancelled payCancelled){

        if(payCancelled.isMe()){
            System.out.println("##### listener CheckProcess : " + payCancelled.toJson());
            System.out.println();
            System.out.println();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverApproved_CheckProcess(@Payload Approved approved){

        if(approved.isMe()){
            System.out.println("##### listener CheckProcess : " + approved.toJson());
            System.out.println();
            System.out.println();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSeatAssigned_CheckProcess(@Payload SeatAssigned seatAssigned){

        if(seatAssigned.isMe()){
            System.out.println("##### listener CheckProcess : " + seatAssigned.toJson());
            System.out.println();
            System.out.println();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSeatCancelled_CheckProcess(@Payload SeatCancelled seatCancelled){

        if(seatCancelled.isMe()){
            System.out.println("##### listener CheckProcess : " + seatCancelled.toJson());
            System.out.println();
            System.out.println();
        }
    }

}
