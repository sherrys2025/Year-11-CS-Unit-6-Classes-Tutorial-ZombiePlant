public class ZombiePlant {
    private int potency;
    private int treatment;

    public ZombiePlant(int p, int t){
        potency = p;
        treatment = t;
    }
    public int treatmentsNeeded(){
        return treatment;
    }

    public boolean isDangerous(){
        return (treatment >= 1);
    }

    public void treat(int n){
        if (n > potency)
            ++treatment;
        else if (n > 0) {
            if (treatment !=0)
                --treatment;
        }

    }

    public int getPotencyRequired(){
        return potency;
    }
}
