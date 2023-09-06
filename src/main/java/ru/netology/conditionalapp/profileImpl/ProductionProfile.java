package ru.netology.conditionalapp.profileImpl;

import ru.netology.conditionalapp.profile.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
