package com.devteria.notification.mapper;

import com.devteria.notification.dto.request.UserProfileCreationRequest;
import com.devteria.notification.dto.response.UserProfileResponse;
import com.devteria.notification.entities.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(UserProfileCreationRequest request);

    void updateUserProfile(@MappingTarget UserProfile userProfile, UserProfileCreationRequest request);

    UserProfileResponse toProfileResponse(UserProfile userProfile);
}
