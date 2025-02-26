package com.devteria.notification.controllers;

import com.devteria.notification.dto.response.UserProfileResponse;
import com.devteria.notification.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @GetMapping("users/{id}")
    public UserProfileResponse getProfile(@PathVariable String id) {
        return userProfileService.getProfile(id);
    }

    @GetMapping("/users")
    List<UserProfileResponse> getAllProfiles() {
        return userProfileService.getAllProfiles();
    }
}
