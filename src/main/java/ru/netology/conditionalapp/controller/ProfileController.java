package ru.netology.conditionalapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.conditionalapp.profile.SystemProfile;

@RestController
public class ProfileController {
    private final SystemProfile profile;
    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}
