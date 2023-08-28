import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private Integer smart;
    private Integer wise;
    private Integer witty;


    public Ravenclaw(String studentsName, String faculty, Integer apparition, Integer powerOfMagic,
                     Integer smart, Integer wise, Integer witty) {
        super(studentsName, faculty, apparition, powerOfMagic);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public int sumOfGrades() {
        int sum = getSmart() + getWise() + getWitty();
        return sum;
    }

    public void compare(Ravenclaw ravenclaw) {
        if (this.sumOfGrades() > ravenclaw.sumOfGrades()) {
            System.out.println(getStudentsName() + " сильнее " + ravenclaw.getStudentsName() +
                    " по сумме характеристик факультета Когтевран");
        } else {
            System.out.println(ravenclaw.getStudentsName() + " сильнее " + getStudentsName() +
                    " по сумме характеристик факультета Когтевран");
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "studentsName='" + getStudentsName() + '\'' +
                ", faculty='" + getFaculty() + '\'' +
                ", apparition=" + getApparition() +
                ", powerOfMagic=" + getPowerOfMagic() + '\'' +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                '}';
    }

    public Integer getSmart() {
        return smart;
    }

    public void setSmart(Integer smart) {
        this.smart = smart;
    }

    public Integer getWise() {
        return wise;
    }

    public void setWise(Integer wise) {
        this.wise = wise;
    }

    public Integer getWitty() {
        return witty;
    }

    public void setWitty(Integer witty) {
        this.witty = witty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return Objects.equals(smart, ravenclaw.smart) && Objects.equals(wise, ravenclaw.wise) && Objects.equals(witty, ravenclaw.witty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wise, witty);
    }
}
