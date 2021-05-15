
package moviereservation.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="Ticketmanagement", url="http://Ticketmanagement:8080")
public interface TicketingService {

    @RequestMapping(method= RequestMethod.GET, path="/ticketings")
    public void cancelTicket(@RequestBody Ticketing ticketing);

}