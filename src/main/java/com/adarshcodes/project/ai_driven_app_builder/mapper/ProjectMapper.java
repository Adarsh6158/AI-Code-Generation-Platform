package com.adarshcodes.project.ai_driven_app_builder.mapper;

import com.adarshcodes.project.ai_driven_app_builder.dto.project.ProjectResponse;
import com.adarshcodes.project.ai_driven_app_builder.dto.project.ProjectSummaryResponse;
import com.adarshcodes.project.ai_driven_app_builder.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
