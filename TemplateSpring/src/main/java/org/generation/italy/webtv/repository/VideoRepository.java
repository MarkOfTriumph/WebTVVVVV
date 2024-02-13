package org.generation.italy.webtv.repository;

import java.util.Optional;

import org.generation.italy.webtv.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer>{
Optional <Video>findByTitoloIgnoreCase(String titolo);
}
