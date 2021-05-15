package moviereservation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="ticketings", path="ticketings")
public interface TicketingRepository extends PagingAndSortingRepository<Ticketing, Long>{


}
