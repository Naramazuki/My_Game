public class Elfe extends Personnage implements Race  {
    
    Elfe(String name, String gender){
        this.setRace("Elfe");
        this.setName(name);
        this.setLv(0);
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
}
