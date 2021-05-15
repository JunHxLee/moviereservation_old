package moviereservation;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="seats", path="seats")
public interface SeatsRepository extends PagingAndSortingRepository<Seats, Long>{


}
