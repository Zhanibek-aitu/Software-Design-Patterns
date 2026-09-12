public class Main {
    public static void main(String[] args){
        Character mage=new Character.Builder("Miler")
                .setRace("Maia")
                .setWeapon("Staff")
                .setMagic(true)
                .build();
        mage.showStats();

        Character warrior = new Character.Builder("Gimli")
                .setRace("Lord")
                .setWeapon("Axe")
                .setMagic(true)
                .build();
        warrior.showStats();

    }
}