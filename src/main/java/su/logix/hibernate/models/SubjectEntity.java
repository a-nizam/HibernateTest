package su.logix.hibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "subject", schema = "main")
public class SubjectEntity {
    private short subId;
    private String subName;
    private short subFaculty;
    private short subSemester;

    @Id
    @Column(name = "sub_id")
    public short getSubId() {
        return subId;
    }

    public void setSubId(short subId) {
        this.subId = subId;
    }

    @Basic
    @Column(name = "sub_name")
    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Basic
    @Column(name = "sub_faculty")
    public short getSubFaculty() {
        return subFaculty;
    }

    public void setSubFaculty(short subFaculty) {
        this.subFaculty = subFaculty;
    }

    @Basic
    @Column(name = "sub_semester")
    public short getSubSemester() {
        return subSemester;
    }

    public void setSubSemester(short subSemester) {
        this.subSemester = subSemester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectEntity that = (SubjectEntity) o;

        if (subId != that.subId) return false;
        if (subFaculty != that.subFaculty) return false;
        if (subSemester != that.subSemester) return false;
        if (subName != null ? !subName.equals(that.subName) : that.subName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) subId;
        result = 31 * result + (subName != null ? subName.hashCode() : 0);
        result = 31 * result + (int) subFaculty;
        result = 31 * result + (int) subSemester;
        return result;
    }
}
