package ru.netology.conditionalapp.profileImpl;

import ru.netology.conditionalapp.profile.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
