public class Character implements CharacterInterface {
    protected int lv;
    protected int maxhp, maxmp, hp, mp, atk, spd; // this is stat!!
    protected String name;
    protected Ring ring;
    protected Gauntlet gauntlet;
    protected Boot boot;
    /**
     * Plus lv by 1
     * effects : lv is plused by 1
     */
    public void lvup() {
        lv++;
    }

    /**
     * Change ring to r, change ring wearer to this and plus this stat by r stat
     * effects : change ring to r. If this has old ring, minus this stat by old ring stat
     * effects : change ring wearer to this. If r has old wearer, minus old wearer stat by r stat
     * effects : plus this stat by r stat
     */
    public void equipRing(Ring r) {
        if(ring != null){
            unequipRing();
        }
        if(r.wearer() != null){
            r.wearer().unequipRing();
        }
        ring = r;
        r.equip(this);
    }

    /**
     * Change gauntlet to g, change gauntlet wearer to this and plus this stat by g stat
     * effects : change gauntlet to g. If this has old gauntlet, minus this stat by old gauntlet stat
     * effects : change gauntlet wearer to this. If g has old wearer, minus old wearer stat by g stat
     * effects : plus this stat by g stat
     */
    public void equipGauntlet(Gauntlet g) {
        if(gauntlet != null){
            unequipGauntlet();
        }
        if(g.wearer() != null){
            g.wearer().unequipGauntlet();
        }
        gauntlet = g;
        g.equip(this);
    }

    /**
     * Change boot to b, change boot wearer to this and plus this stat by b stat
     * effects : change boot to b. If this has old boot, minus this stat by old boot stat
     * effects : change boot wearer to this. If b has old wearer, minus old wearer stat by b stat
     * effects : plus this stat by b stat
     */
    public void equipBoot(Boot b){
        if(boot != null){
            unequipBoot();
        }
        if(b.wearer() != null){
            b.wearer().unequipBoot();
        }
        boot = b;
        b.equip(this);
    }

    /**
     * effects : minus stat by ring stat and set ring to null if ring not null
     */
    public void unequipRing(){
        if (ring!=null) {
            ring.unequip();
            ring = null;
        }
    }
    /**
     * effects : minus stat by gauntlet stat and set gauntlet to null if gauntlet not null
     */
    public void unequipGauntlet(){
        if (gauntlet!=null) {
            gauntlet.unequip();
            gauntlet = null;
        }
    }
    /**
     * effects : minus stat by boot stat and set boot to null if boot not null
     */
    public void unequipBoot(){
        if (boot!=null) {
            boot.unequip();
            boot = null;
        }
    }
    /**
     * Plus hp by h
     * @param h int to be used to plus hp
     *          may be positive or negative
     * effects : plus hp by h. hp must not be less than 0 or more than maxhp
     */
    protected void HPcompute(int h){
         hp+=h;
         if(hp<0){
             hp = 0;
         } else if (hp>maxhp) {
             hp = maxhp;
         }
    }

    /**
     * enemy hp is minused by atk
     * effects : name "attack" enemy name printed
     * effects : enemy name "is received" atk "damage." printed and hp is minused by atk if atk>0
                 enemy name "takes no damage." printed if atk <= 0
     * effects : enemy name "is died" printed if enemy hp <=0
     */
    public void attack(Character enemy){
        System.out.println(name+" attack "+enemy.name);

        if(atk>0) {
            System.out.println(enemy.name+" is received "+atk+" damage.");
            enemy.hp -= atk;
        }
        else {
            System.out.println(enemy.name+" takes no damage.");
        }

        if (enemy.hp<=0) {
            enemy.hp=0;
            System.out.println(enemy.name+" is died");
        }
    }

    /**
     * effects : print name , lv , hp , maxhp , mp , maxmp , atk and spd
     */
    public void showStatus(){
        System.out.println("---------------- Hero Name : "+name+" ----------------");
        System.out.println("LV : "+lv);
        System.out.println("Hp : "+hp+"/"+maxhp);
        System.out.println("Mp : "+mp+"/"+maxmp);
        System.out.println("Attack : "+atk);
        System.out.println("Speed : "+spd);
        System.out.println("--------------------------------------------------");
    }

}
