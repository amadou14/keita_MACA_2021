package TD2.fichiersystem;

import java.util.Objects;

public class Owner {
    private String nom;
    public Owner(String nom){
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(nom, owner.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
