package fjaviermelero.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person{

    private Set<Specialty> specialities = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialities;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialities = specialties;
    }
}
