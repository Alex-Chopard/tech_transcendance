package com.albasheep.tech_transcendance;

public enum Tier {
    TIER_1("tier_1"),
    TIER_2("tier_2"),
    TIER_3("tier_3"),
    TIER_4("tier_4"),
    TIER_5("tier_5"),
    TIER_6("tier_6"),
    TIER_7("tier_7"),
    TIER_8("tier_8"),
    TIER_9("tier_9"),
    TIER_10("tier_10");

    private String mSuffix;

    Tier(String suffix) {
        this.setSuffix(suffix);
    }

    public String getSuffix() {
        return mSuffix;
    }

    private void setSuffix(String mSuffix) {
        this.mSuffix = mSuffix;
    }
}