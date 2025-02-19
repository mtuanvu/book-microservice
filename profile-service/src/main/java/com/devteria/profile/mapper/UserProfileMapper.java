package com.devteria.profile.mapper;

import com.devteria.profile.dto.request.UserProfileCreatonRequest;
import com.devteria.profile.dto.response.UserProfileResponse;
import com.devteria.profile.entities.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(UserProfileCreatonRequest request);

    void updateUserProfile(@MappingTarget UserProfile userProfile, UserProfileCreatonRequest request);

    UserProfileResponse toProfileResponse(UserProfile userProfile);
}
