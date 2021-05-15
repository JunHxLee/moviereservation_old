package moviereservation;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MovieInfo_table")
public class MovieInfo {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

}
