public class Elfe extends Personnage implements Race  {
    // vasy la vie est belle 
    Elfe(String name, String gender){
        this.setRace("Elfe");
        this.setName(name);
        this.setLv(1);
        this.setSex(gender);
        this.setForce(400);  // mettre en place la notion de vitesse pour les attaques
        this.setPv(500);
    }
    @Override
    public void bonus() {
        // TODO Auto-generated method stub
        this.dealDamage(this.getPv()/this.getForce());
        
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
        this.setPv(this.getMaxPv()+(int)0.25*this.getMaxPv());
        
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
