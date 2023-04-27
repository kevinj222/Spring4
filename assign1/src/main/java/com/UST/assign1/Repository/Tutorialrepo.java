package com.UST.assign1.Repository;

import com.UST.assign1.Entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tutorialrepo extends JpaRepository<Tutorial,Integer> {
}
