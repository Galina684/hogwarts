import java.util.Objects;

abstract class Hogwarts {
    private String studentsName;
    private String faculty;
    private Integer apparition; //трансгрессия
    private Integer powerOfMagic; //сила магии


    public Hogwarts(String studentsName, String faculty, Integer apparition, Integer powerOfMagic) {
        this.studentsName = studentsName;
        this.faculty = faculty;
        this.apparition = apparition;
        this.powerOfMagic = powerOfMagic;
    }

    public int sumOfGrades() {
        int sum = getApparition() + getPowerOfMagic();
        return sum;
    }

    public void compare(Hogwarts hogwarts) {
        if (this.sumOfGrades() > hogwarts.sumOfGrades()) {
            System.out.println(studentsName + " сильнее " + hogwarts.getStudentsName() +
                    " по сумме характеристик Хогвартса");
        } else {
            System.out.println(hogwarts.getStudentsName() + " сильнее " + studentsName +
                    " по сумме характеристик Хогвартса");
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "studentsName='" + studentsName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", apparition=" + apparition +
                ", powerOfMagic=" + powerOfMagic +
                '}';
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Integer getApparition() {
        return apparition;
    }

    public void setApparition(Integer apparition) {
        this.apparition = apparition;
    }

    public Integer getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(Integer powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return Objects.equals(studentsName, hogwarts.studentsName) && Objects.equals(faculty, hogwarts.faculty) && Objects.equals(apparition, hogwarts.apparition) && Objects.equals(powerOfMagic, hogwarts.powerOfMagic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentsName, faculty, apparition, powerOfMagic);
    }

}
