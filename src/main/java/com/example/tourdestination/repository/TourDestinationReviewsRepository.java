package com.example.tourdestination.repository;


import com.example.tourdestination.domain.entity.TourDestinationReviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TourDestinationReviewsRepository extends JpaRepository<TourDestinationReviews,Long> {
    List<TourDestinationReviews> findByTourDestinationId(Long id);

}
