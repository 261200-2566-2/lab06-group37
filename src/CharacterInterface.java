public interface CharacterInterface {
    void lvup();
    void equipRing(Ring r);
    void equipGauntlet(Gauntlet g);
    void equipBoot(Boot b);
    void unequipRing();
    void unequipGauntlet();
    void unequipBoot();
    void attack(Character enemy);
    void showStatus();
}
