import java.util.Objects;

public class Slytherin extends Hogwarts {
    private Integer cunning;
    private Integer determination;
    private Integer ambition;


    public Slytherin(String studentsName, String faculty, Integer apparition, Integer powerOfMagic, Integer cunning,
                     Integer determination, Integer ambition) {
        super(studentsName, faculty, apparition, powerOfMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int sumOfGrades() {
        int sum = getCunning() + getDetermination() + getAmbition();
        return sum;
    }

    public void compare(Slytherin slytherin) {
        if (this.sumOfGrades() > slytherin.sumOfGrades()) {
            System.out.println(getStudentsName() + " сильнее " + slytherin.getStudentsName() +
                    " по сумме характеристик факультета Слизерин");
        } else {
            System.out.println(slytherin.getStudentsName() + " сильнее " + getStudentsName() +
                    " по сумме характеристик факультета Слизерин");
        }
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "studentsName='" + getStudentsName() + '\'' +
                ", faculty='" + getFaculty() + '\'' +
                ", apparition=" + getApparition() +
                ", powerOfMagic=" + getPowerOfMagic() + '\'' +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                '}';
    }

    public Integer getCunning() {
        return cunning;
    }

    public void setCunning(Integer cunning) {
        this.cunning = cunning;
    }

    public Integer getDetermination() {
        return determination;
    }

    public void setDetermination(Integer determination) {
        this.determination = determination;
    }

    public Integer getAmbition() {
        return ambition;
    }

    public void setAmbition(Integer ambition) {
        this.ambition = ambition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return Objects.equals(cunning, slytherin.cunning) && Objects.equals(determination, slytherin.determination) && Objects.equals(ambition, slytherin.ambition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition);
    }
}
