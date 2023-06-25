package Lesson_3.Homework;

public enum Cru {
    Autre(80),
    Premier(90),
    Grand(100);
    private int quality;

    public int getQuality() {
        return quality;
    }

    Cru(int quality) {
        this.quality = quality;
    }
}
