public class Devil extends Character{

    public Devil(String n){
        name = n;
        maxhp = 100;
        hp = maxhp;
        maxmp = 100;
        mp = maxmp;
        atk = 60;
        spd = 50;
    }

    /**
     * effects : lv is plused by 1,
                 maxhp is plused by 10,
                 maxmp is plused by 10,
                 hp is plused by 10,
                 mp is plused by 10,
                 atk is plused by 6,
                 spd is plused by 3
     */
    @Override
    public void lvup(){
        lv++;
        maxhp+=10;
        maxmp+=10;
        hp+=10;
        mp+=10;
        atk+=6;
        spd+=3;
    }

    /** Minus some e's stat by using 25 mp
     * effects : if mp >= 25 then
                  e atk is minused by 20, e atk must not be less than 0,
                  e spd is minused by 15, e spd must not be less than 0,
                  e mp is minused by 25
     */
    public void growl(Character e){
        if(mp>=25){
            e.atk-=20;
            e.spd-=15;
            if(e.atk<0) e.atk=0;
            if(e.spd<0) e.spd=0;
            mp-=25;
        }
    }

    /** e hp is minused by 150% of atk and heal hp by that amount, using 30 mp
     * effects :  if mp>=30 then
                    minus e hp by 150% of atk. e hp must not be less than 0,
                    plus hp by that amount. hp must not be more than maxhp,
                    mp is minused by 30
     */
    public void lifeSteal(Character e){
        if(mp>=30){
            e.HPcompute(-atk*3/2);
            HPcompute(atk*3/2);
            mp-=30;
        }
    }
}
