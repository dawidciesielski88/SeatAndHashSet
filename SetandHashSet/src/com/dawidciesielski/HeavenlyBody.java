package com.dawidciesielski;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class HeavenlyBody {
    private final String NAME;
    private final double ORBITAL_PERIODS;
    private final Set<HeavenlyBody> SATELLITES;

    public HeavenlyBody(String NAME, double ORBITAL_PERIODS) {
        this.NAME = NAME;
        this.ORBITAL_PERIODS = ORBITAL_PERIODS;
        this.SATELLITES = new HashSet<>();
    }

    public String getNAME() {
        return NAME;
    }

    public double getORBITAL_PERIODS() {
        return ORBITAL_PERIODS;
    }

    public Set<HeavenlyBody> getSATELLITES() {
        return new HashSet<>(this.SATELLITES);
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.SATELLITES.add(moon);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavenlyBody that = (HeavenlyBody) o;
        return Double.compare(that.ORBITAL_PERIODS, ORBITAL_PERIODS) == 0 &&
                NAME.equals(that.NAME) &&
                SATELLITES.equals(that.SATELLITES);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, ORBITAL_PERIODS, SATELLITES);
    }
}
