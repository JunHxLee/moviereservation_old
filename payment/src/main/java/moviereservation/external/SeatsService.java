
package moviereservation.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="Screeningseatmanagement", url="http://Screeningseatmanagement:8080")
public interface SeatsService {

    @RequestMapping(method= RequestMethod.GET, path="/seats")
    public void seatCancel(@RequestBody Seats seats);

}