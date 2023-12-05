public class Accessory implements AccessoryInterface{
    protected int atk, spd, mp; // this is stat
    private Character wearer;

    /**
     * @return wearer
     */
    public Character wearer() {
        return wearer;
    }

    /**
     * effects : set wearer to c and plus c stat by stat
     */
    public void equip(Character c) {
        wearer = c;
        c.atk += atk;
        c.spd += spd;
        c.maxmp += mp;
        c.mp += mp;
    }

    /**
     * effects : minus wearer stat by stat and set wearer to null if wearer not null
     */
    public void unequip(){
        if (wearer!=null) {
            wearer.atk -= atk;
            wearer.spd -= spd;
            wearer.mp -= mp;
            wearer.maxmp -= mp;
            wearer = null;
        }
    }
}
