package com.UST.District.Repository;

import com.UST.District.Entity.Districting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<Districting,String>
{

    Districting findByState(String state);
}
