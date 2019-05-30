package su.logix.hibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "faculty", schema = "main")
public class FacultyEntity {
    private long facCode;
    private String facName;

    @Id
    @Column(name = "fac_code")
    public long getFacCode() {
        return facCode;
    }

    public void setFacCode(long facCode) {
        this.facCode = facCode;
    }

    @Basic
    @Column(name = "fac_name")
    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FacultyEntity that = (FacultyEntity) o;

        if (facCode != that.facCode) return false;
        if (facName != null ? !facName.equals(that.facName) : that.facName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (facCode ^ (facCode >>> 32));
        result = 31 * result + (facName != null ? facName.hashCode() : 0);
        return result;
    }
}
