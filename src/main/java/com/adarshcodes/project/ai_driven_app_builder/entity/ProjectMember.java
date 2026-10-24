package com.adarshcodes.project.ai_driven_app_builder.entity;

import com.adarshcodes.project.ai_driven_app_builder.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;

    Project project;

    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}
