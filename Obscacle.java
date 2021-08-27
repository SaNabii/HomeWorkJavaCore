package JavaCoreHomeWorkDZ1;

public enum Obscacle {
    RUNING("Бег", 54), CLIMBING("Скалозаланье", 42), JUMPING("Прыжки", 51),
    CRAWLING("Ползаннье", 55), SWINIMNG("Плаванье", 58), BALANCING("Балансирование", 54);
    private String obstacle;
    private int age;
    Obscacle(String obstacle, int age){
        this.obstacle = obstacle;
        this.age = age;
    }

    public boolean ablePass(int age){
        return (age > 14 && age <= this.age );
    }
}
