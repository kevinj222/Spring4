package com.UST.Interviewfeedback.dao;

import com.UST.Interviewfeedback.entity.interviewfeedback;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface interviewfeedbackRepository extends PagingAndSortingRepository<interviewfeedback, Long> {
}