public class ZombiePlant {
    private int potency;
    private int treatmentsNeeded;

    public ZombiePlant(int potency, int treatmentsNeeded){
        this.potency = potency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int getPotency(){
        return potency;
    }

    public int treatmentsNeeded(){
        return treatmentsNeeded;
    }

    public boolean isDangerous(){
        return (treatmentsNeeded >= 1);
    }

    public void treat(int potency){
        if (potency <= 10 && potency > 0 && treatmentsNeeded > 0){
            treatmentsNeeded--;
        }
        else if (potency > 10){
            treatmentsNeeded++;
        }
    }


}
