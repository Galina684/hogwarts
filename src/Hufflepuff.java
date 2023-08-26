import java.util.Objects;

public class Hufflepuff extends Hogwarts {
private Integer hardworking;
private Integer loyal;
private Integer honest;

public void compare(Hufflepuff hufflepuff){
    if (hardworking+loyal+honest > getHardworking()+getLoyal()+getHonest()){
        System.out.println(getStudentsName() + " сильнее " + hufflepuff.getStudentsName()+
                " по сумме характеристик факультета Пуффендуй");
    }else {
        System.out.println(hufflepuff.getStudentsName() + " сильнее " + getStudentsName()+
                " по сумме характеристик факультета Пуффендуй");
    }
}
    public void printStudent(Hufflepuff hufflepuff){
        System.out.println(hufflepuff);
    }

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
                "studentsName='" + getStudentsName() + '\'' +
                ", faculty='" + getFaculty() + '\'' +
                ", apparition=" + getApparition() +
                ", powerOfMagic=" + getPowerOfMagic() + '\'' +
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
