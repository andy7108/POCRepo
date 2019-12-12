package org.poc.bootproject.SpringBootProject.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.poc.bootproject.SpringBootProject.model.*;;
@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByPlayers(long playerId);
}
