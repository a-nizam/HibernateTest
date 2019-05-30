package su.logix.hibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "student", schema = "main")
public class StudentEntity {
    private short studId;
    private String studNzach;
    private String studFam;
    private String studName;
    private String studSecname;
    private short studSemester;
    private String studGroup;
    private short studFaculty;

    @Id
    @Column(name = "stud_id")
    public short getStudId() {
        return studId;
    }

    public void setStudId(short studId) {
        this.studId = studId;
    }

    @Basic
    @Column(name = "stud_nzach")
    public String getStudNzach() {
        return studNzach;
    }

    public void setStudNzach(String studNzach) {
        this.studNzach = studNzach;
    }

    @Basic
    @Column(name = "stud_fam")
    public String getStudFam() {
        return studFam;
    }

    public void setStudFam(String studFam) {
        this.studFam = studFam;
    }

    @Basic
    @Column(name = "stud_name")
    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    @Basic
    @Column(name = "stud_secname")
    public String getStudSecname() {
        return studSecname;
    }

    public void setStudSecname(String studSecname) {
        this.studSecname = studSecname;
    }

    @Basic
    @Column(name = "stud_semester")
    public short getStudSemester() {
        return studSemester;
    }

    public void setStudSemester(short studSemester) {
        this.studSemester = studSemester;
    }

    @Basic
    @Column(name = "stud_group")
    public String getStudGroup() {
        return studGroup;
    }

    public void setStudGroup(String studGroup) {
        this.studGroup = studGroup;
    }

    @Basic
    @Column(name = "stud_faculty")
    public short getStudFaculty() {
        return studFaculty;
    }

    public void setStudFaculty(short studFaculty) {
        this.studFaculty = studFaculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (studId != that.studId) return false;
        if (studSemester != that.studSemester) return false;
        if (studFaculty != that.studFaculty) return false;
        if (studNzach != null ? !studNzach.equals(that.studNzach) : that.studNzach != null) return false;
        if (studFam != null ? !studFam.equals(that.studFam) : that.studFam != null) return false;
        if (studName != null ? !studName.equals(that.studName) : that.studName != null) return false;
        if (studSecname != null ? !studSecname.equals(that.studSecname) : that.studSecname != null) return false;
        if (studGroup != null ? !studGroup.equals(that.studGroup) : that.studGroup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) studId;
        result = 31 * result + (studNzach != null ? studNzach.hashCode() : 0);
        result = 31 * result + (studFam != null ? studFam.hashCode() : 0);
        result = 31 * result + (studName != null ? studName.hashCode() : 0);
        result = 31 * result + (studSecname != null ? studSecname.hashCode() : 0);
        result = 31 * result + (int) studSemester;
        result = 31 * result + (studGroup != null ? studGroup.hashCode() : 0);
        result = 31 * result + (int) studFaculty;
        return result;
    }
}
