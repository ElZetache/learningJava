package teoria;

public class Dog extends Animal {

    public int getLegs(){
        return this.numberOfLegs;
    }

    public void setLegs(int legs){
        this.numberOfLegs = legs;
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
        
    }

    @Override
    public void die() {
        System.out.println("dog die");
        
    }

}
