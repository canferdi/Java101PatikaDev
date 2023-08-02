package BoxerGame;

public class Boxer {
    String name;
    int damage, health, weight;
    double dodge;

    public Boxer(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    public int hit(Boxer foe) { // foe boksöre hasar vuran metot
        if (foe.isDodge()) { // bloklama ihtimali
            System.out.println(foe.name + " gelen hasarı blokladı!");
            return foe.health;
        }

        if (foe.health - this.damage < 0) { // sağlık 0'ın altına düşerse kalan sağlığı vurulan hasara eşitle
            System.out.println(this.name + " => " + foe.name + " " + foe.health + " hasar vurdu");
            return 0;

        } else { // sağlık 0'ın üstündeyse 
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");
            return foe.health - this.damage;
        }

    }

    public boolean isDodge() { // bloklama ihtimali
        double randomNum = Math.random() * 100;
        return randomNum <= this.dodge;
    }
}
