public class Nain extends Personnage implements Race  {
    
    Nain(String name, String gender){
        this.setRace("Nain");
        this.setName(name);
        this.setLv(0);
        this.setSex(gender);
        this.setForce(500);
        this.setPv(this.getForce()*2);
    }
    @Override
    public void bonus() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void attaque(Personnage p) {
            // TODO Auto-generated method stub
            super.attaque(p);
            this.bonus();
    }
}
