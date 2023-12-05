public class Monk extends Character{
    public Monk(String n){
        name = n;
        maxhp = 100;
        hp = maxhp;
        maxmp = 150;
        mp = maxmp;
        atk = 30;
        spd = 40;
    }

    /**
     * effects : lv is plused by 1,
                 maxhp is plused by 10,
                 maxmp is plused by 15,
                 hp is plused by 1,
                 mp is plused by 1,
                 atk is plused by 1,
                 spd is plused by 1,
     */
    @Override
    public void lvup(){
        lv++;
        maxhp+=10;
        maxmp+=15;
        hp+=10;
        mp+=15;
        atk+=3;
        spd+=2;
    }

    /** Plus f's stat by using 40 mp
     *effects : if mp>=40 then
                 f maxhp is plused by 20,
                 f hp is plused by 20,
                 f maxmp is plused by 25,
                 f mp is plused by 25,
                 f atk is plused by 30,
                 f spd is plused by 20,
                 mp is minused by 40
     */
    public void prayer(Character f){
        if(mp>=40){
            f.maxhp+=20;
            f.hp+=20;

            f.maxmp+=25;
            f.mp+=25;

            f.atk+=30;
            f.spd+=20;

            mp-=40;
        }

    }

    /** Heal f hp by using 40 mp
     * effects :  if mp>=40 then
                    plus f hp by f maxhp / 3. f hp must not be more than f maxhp,
                    mp is minused by 40
     */
    public void heal(Character f){
        if(mp>=40){
            f.HPcompute(maxhp/3);
            mp-=40;
        }
    }
}
