package com.devteria.profile.controllers;

import com.devteria.profile.dto.request.UserProfileCreatonRequest;
import com.devteria.profile.dto.response.UserProfileResponse;
import com.devteria.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @PostMapping("/create")
    public UserProfileResponse createProfile(@RequestBody UserProfileCreatonRequest request) {
        return userProfileService.createProfile(request);
    }

    @GetMapping("/{id}")
    public UserProfileResponse getProfile(@PathVariable String id) {
        return userProfileService.getProfile(id);
    }
}
