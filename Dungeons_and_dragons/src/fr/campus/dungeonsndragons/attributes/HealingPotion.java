package fr.campus.dungeonsndragons.attributes;

public class HealingPotion {

    public String size;

    public HealingPotion(String size) {
            this.size = size;
    }

    public String toString() {

        return "a " + size + " sized potion";
    }
}
