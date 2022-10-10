import java.util.Random;

class Personnage{
    private String Name;  // Name of the person
    private String Race;    // Race of the person
    private int Lv;     // Level of the person
    private String Sex;    // Sex of the person
    private int Force;      // Force of the person
    private int Experience;     // Experience of the person
    private int pv; // Pv of the person
    private  int maxPv; // Max pv of the person
    private int barExperience; // Experience's bar of the person
    Personnage(){
        this.setName("inconnu");
        this.setRace("inconnue");
        this.setSex("inconnu");
        this.setLv(0);
       
    }
    public int getMaxPv() {
        return this.maxPv;
    }
    public int getExperience() {
        return this.Experience;
    }
    public int getForce() {
        return this.Force;
    }
    public String getSex() {
        return this.Sex;
    }
    public int getLv() {
        return this.Lv;
    }
    public String getName() {
        return this.Name;
    }
    
    public String getRace() {
        return this.Race;
    }
    public int getPv() {
        return this.pv;
    }
    public void setName(String name) {
        this.Name = name;
    }
    
    public void setRace(String race) {
        this.Race = race;
    }
    public void setSex(String sex) {
        this.Sex = sex;
    }
    public void setLv(int lv) {
        this.Lv = lv;
    }
    public void setForce(int force) {
        this.Force = force;
    }
    public void setExperience(int experience) {
        this.Experience = experience;
    }
    public void setPv(int pv) {
        this.pv = pv;
    }
    public void setMaxPv(int maxPv) {
        this.maxPv = maxPv;
    }
    public void attaque(Personnage p){
        if (this.getForce()<p.getForce()) {
            this.dealDamage(p.getForce()-this.getForce());
        }
        if(this.getForce()>p.getForce()){
            p.dealDamage(this.getForce()-p.getForce());
        }
        else{
            Random r= new Random();
            int chance=r.nextInt(10);
            if(chance>4){
                this.dealDamage(this.getPv()-chance);
                
            }
            else{
                p.dealDamage(p.getPv()-chance);
            }
        }
    }
    public void dealDamage(int damage) {
        this.setPv(damage);
    }
    public void aTue(Personnage p){
        if(this.getLv()>30){
            this.setExperience(this.getExperience()+p.getLv()/p.getForce());

        }
        else{
            this.setExperience(this.getExperience()+p.getForce());
        }

    }
}

