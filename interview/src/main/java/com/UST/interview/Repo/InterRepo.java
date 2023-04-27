package com.UST.interview.Repo;

import com.UST.interview.Entity.Inter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterRepo extends JpaRepository<Inter,Long>
{

}
