import java.util.Objects;

public class Gryffindor extends Hogwarts{
    private Integer nobility;
    private Integer honor;
    private Integer courage;


    public Gryffindor(String studentsName, String faculty, Integer apparition, Integer powerOfMagic, Integer nobility,
                      Integer honor, Integer courage) {
        super(studentsName, faculty, apparition, powerOfMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                        "studentsName='" + getStudentsName() + '\'' +
                ", faculty='" + getFaculty() + '\'' +
                ", apparition=" + getApparition() +
                ", powerOfMagic=" + getPowerOfMagic() + '\'' +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }

    public Integer getNobility() {
        return nobility;
    }

    public void setNobility(Integer nobility) {
        this.nobility = nobility;
    }

    public Integer getHonor() {
        return honor;
    }

    public void setHonor(Integer honor) {
        this.honor = honor;
    }

    public Integer getCourage() {
        return courage;
    }

    public void setCourage(Integer courage) {
        this.courage = courage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return Objects.equals(nobility, that.nobility) && Objects.equals(honor, that.honor) && Objects.equals(courage, that.courage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }
}
