import java.util.Objects;

public class Hufflepuff extends Hogwarts {
private Integer hardworking;
private Integer loyal;
private Integer honest;


    public Hufflepuff(String studentsName, String faculty, Integer apparition, Integer powerOfMagic,
    Integer hardworking, Integer loyal, Integer honest) {
        super(studentsName, faculty, apparition, powerOfMagic);
        this.hardworking=hardworking;
        this.loyal=loyal;
        this.honest=honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }

    public Integer getHardworking() {
        return hardworking;
    }

    public void setHardworking(Integer hardworking) {
        this.hardworking = hardworking;
    }

    public Integer getLoyal() {
        return loyal;
    }

    public void setLoyal(Integer loyal) {
        this.loyal = loyal;
    }

    public Integer getHonest() {
        return honest;
    }

    public void setHonest(Integer honest) {
        this.honest = honest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return Objects.equals(hardworking, that.hardworking) && Objects.equals(loyal, that.loyal) && Objects.equals(honest, that.honest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardworking, loyal, honest);
    }
}