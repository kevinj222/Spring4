package com.UST.Interviewfeedback.controller;

import com.UST.Interviewfeedback.dto.interviewfeedbackDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "interviewfeedback API")
public interface interviewfeedbackController {
    @ApiOperation("Add new data")
    public interviewfeedbackDTO save(@RequestBody interviewfeedbackDTO interviewfeedback);

    @ApiOperation("Find by Id")
    public interviewfeedbackDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<interviewfeedbackDTO> list();

    @ApiOperation("Pagination request")
    public Page<interviewfeedbackDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public interviewfeedbackDTO update(@RequestBody interviewfeedbackDTO dto, @PathVariable("id") Long id);
}