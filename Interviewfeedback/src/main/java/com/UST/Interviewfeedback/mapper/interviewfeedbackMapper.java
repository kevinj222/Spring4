package com.UST.Interviewfeedback.mapper;

import com.UST.Interviewfeedback.dto.interviewfeedbackDTO;
import com.UST.Interviewfeedback.entity.interviewfeedback;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface interviewfeedbackMapper extends GenericMapper<interviewfeedback, interviewfeedbackDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    interviewfeedback asEntity(interviewfeedbackDTO dto);
}