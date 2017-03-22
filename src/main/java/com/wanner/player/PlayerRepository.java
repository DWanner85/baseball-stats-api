package com.wanner.player;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;

public interface PlayerRepository extends PagingAndSortingRepository<Player, String> {
    @RestResource(rel = "lastName", path = "lastName")
    Page<Player> findByNameLast(@Param("nameLast") String nameLast, Pageable page);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void delete(String playerID);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void delete(Player entity);
}
