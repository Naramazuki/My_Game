public class Nain extends Personnage implements Race  {
    
    Nain(String name, String gender){
        this.setRace("Nain");
        this.setName(name);
        this.setLv(1);
        this.setSex(gender);
        this.setForce(500);
        this.setPv(this.getForce()*2);
    }
    @Override
    public void bonus() {
        // TODO Auto-generated method stub
        if(this.getPv()<this.getMaxPv()){
            this.setPv(this.getPv()+1);
        }
        
        
    }
    @Override
    public void attaque(Personnage p) {
            // TODO Auto-generated method stub
            super.attaque(p);
            this.bonus();
    }
    @Override
    public void levelUp() {
        // TODO Auto-generated method stub
        
        this.setExperience(this.getExperience()-this.getBarExperience());
        this.setLv(this.getLv()+1);
        this.setForce(this.getForce()+(int)0.5*this.getForce());
        this.setPv(this.getMaxPv()+(int)0.5*this.getMaxPv());
        
    }
    @Override
    public void aTue(Personnage p) {
        // TODO Auto-generated method stub
        super.aTue(p);
        if(this.getExperience()>this.getBarExperience()){
            this.levelUp();
        }
    }
}
