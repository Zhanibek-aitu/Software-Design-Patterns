public class Character {

    private String name;
    private String race;
    private String weapon;
    private boolean hasMagic;

    private Character(Builder builder) {
        this.name = builder.name;
        this.race = builder.race;
        this.weapon = builder.weapon;
        this.hasMagic = builder.hasMagic;
    }

    public void showStats() {
        System.out.println("Hero: " + name + " Race: " + race +
                " Weapon: " + weapon + " Magic: " + hasMagic);
    }

    public static class Builder {
        private String name;
        private String race;
        private String weapon;
        private boolean hasMagic;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setRace(String race) {
            this.race = race;
            return this;
        }

        public Builder setWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder setMagic(boolean hasMagic) {
            this.hasMagic = hasMagic;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}