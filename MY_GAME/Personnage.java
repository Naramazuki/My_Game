
class Personnage{
    private String Name;  // Name of the person
    private String Race;    // Race of the person
    private int Lv;     // Level of the person
    private String Sex;    // Sex of the person
    private int Force;      // Force of the person
    private int Experience;     // Experience of the person
    Personnage(){
        this.Name = "Inconnu";
        this.Race = "Inconnue";
        this.Sex = "Inconnu";
        this.Lv=0;
       
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
}

