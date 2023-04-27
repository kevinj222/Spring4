package com.UST.Interviewfeedback.service.impl;

import com.UST.Interviewfeedback.dao.interviewfeedbackRepository;
import com.UST.Interviewfeedback.dto.interviewfeedbackDTO;
import com.UST.Interviewfeedback.entity.interviewfeedback;
import com.UST.Interviewfeedback.mapper.interviewfeedbackMapper;
import com.UST.Interviewfeedback.service.interviewfeedbackService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class interviewfeedbackServiceImpl implements interviewfeedbackService {
    private final interviewfeedbackRepository repository;

    public interviewfeedbackServiceImpl(interviewfeedbackRepository repository) {
        this.repository = repository;
    }

    @Override
    public interviewfeedback save(interviewfeedback entity) {
        return repository.save(entity);
    }

    @Override
    public List<interviewfeedback> save(List<interviewfeedback> entities) {
        return (List<interviewfeedback>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<interviewfeedback> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<interviewfeedback> findAll() {
        return (List<interviewfeedback>) repository.findAll();
    }

    @Override
    public Page<interviewfeedback> findAll(Pageable pageable) {
        Page<interviewfeedback> entityPage = repository.findAll(pageable);
        List<interviewfeedback> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public interviewfeedback update(interviewfeedback entity, Long id) {
        Optional<interviewfeedback> optional = findById(id) ;
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}