package de.wikigame.Repository;

import de.wikigame.Entitiy.WikiPage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WikiPageRepository extends CrudRepository<WikiPage, Long> {

    List<WikiPage> findByUrl(String url);
}
