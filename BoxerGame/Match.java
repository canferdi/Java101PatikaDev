package BoxerGame;

public class Match {
    Boxer b1, b2;
    int minWeight, maxWeight;
    Boxer firstBoxer, secondBoxer;

    public Match(Boxer b1, Boxer b2, int minWeight, int maxWeight) { // Constructor
        this.b1 = b1;
        this.b2 = b2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            double hittingChance = Math.random() * 100;  // Kim önce vuracak
            
            if (hittingChance <= 50) {
                firstBoxer = this.b1;
                secondBoxer = this.b2;
            } else {
                firstBoxer = this.b2;
                secondBoxer = this.b1;
            }

            do {
                System.out.println("====YENİ TUR====");
                secondBoxer.health = firstBoxer.hit(secondBoxer); // ilk boksör ikinciye hasar vuruyor
                if (isWin()) {
                    break;
                }

                firstBoxer.health = secondBoxer.hit(firstBoxer); // ikinci boksör ilk boksöre hasar vuruyor
                if (isWin()) {
                    break;
                }
                System.out.println(this.b1.name + " sağlık: " + this.b1.health); 
                System.out.println(this.b2.name + " sağlık: " + this.b2.health);
            } while (this.b1.health > 0 && this.b2.health > 0);

        } else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }

    public boolean isCheck() { // sporcuların sikletleri maça uygun mu kontrolü
        return (this.b1.weight >= minWeight && this.b1.weight <= maxWeight)
                && (this.b2.weight >= minWeight && this.b2.weight <= maxWeight);
    }

    public boolean isWin() {  // kazanan var mı
        if (this.firstBoxer.health == 0) {
            System.out.println(secondBoxer.name + " kazandı !");
            return true;
        }
        if (this.secondBoxer.health == 0) {
            System.out.println(firstBoxer.name + " kazandı !");
            return true;
        }
        return false;

    }
}
