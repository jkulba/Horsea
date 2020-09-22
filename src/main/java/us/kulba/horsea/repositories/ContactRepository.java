package us.kulba.horsea.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import us.kulba.horsea.models.Contact;

import java.util.List;

/**s
 * ContactRepository Interface for Contact Data.
 *
 * @author James Kulba, jkulba@gmail.com
 */
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
    List<Contact> findByLastName(String lastName);

    Contact findById(long id);
}
