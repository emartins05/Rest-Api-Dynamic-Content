package com.restapi.dynamiccontent.restapidynamiccontent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Videos, Long> {
}
