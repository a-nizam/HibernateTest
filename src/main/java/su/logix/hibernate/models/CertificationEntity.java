package su.logix.hibernate.models;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "certification", schema = "main")
public class CertificationEntity {
    private short certId;
    private short certSemester;
    private short certNum;
    private String certYear;
    private short certFaculty;
    private String certGroup;
    private short certSubject;
    private byte[] certExported;

    @Id
    @Column(name = "cert_id")
    public short getCertId() {
        return certId;
    }

    public void setCertId(short certId) {
        this.certId = certId;
    }

    @Basic
    @Column(name = "cert_semester")
    public short getCertSemester() {
        return certSemester;
    }

    public void setCertSemester(short certSemester) {
        this.certSemester = certSemester;
    }

    @Basic
    @Column(name = "cert_num")
    public short getCertNum() {
        return certNum;
    }

    public void setCertNum(short certNum) {
        this.certNum = certNum;
    }

    @Basic
    @Column(name = "cert_year")
    public String getCertYear() {
        return certYear;
    }

    public void setCertYear(String certYear) {
        this.certYear = certYear;
    }

    @Basic
    @Column(name = "cert_faculty")
    public short getCertFaculty() {
        return certFaculty;
    }

    public void setCertFaculty(short certFaculty) {
        this.certFaculty = certFaculty;
    }

    @Basic
    @Column(name = "cert_group")
    public String getCertGroup() {
        return certGroup;
    }

    public void setCertGroup(String certGroup) {
        this.certGroup = certGroup;
    }

    @Basic
    @Column(name = "cert_subject")
    public short getCertSubject() {
        return certSubject;
    }

    public void setCertSubject(short certSubject) {
        this.certSubject = certSubject;
    }

    @Basic
    @Column(name = "cert_exported")
    public byte[] getCertExported() {
        return certExported;
    }

    public void setCertExported(byte[] certExported) {
        this.certExported = certExported;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CertificationEntity that = (CertificationEntity) o;

        if (certId != that.certId) return false;
        if (certSemester != that.certSemester) return false;
        if (certNum != that.certNum) return false;
        if (certFaculty != that.certFaculty) return false;
        if (certSubject != that.certSubject) return false;
        if (certYear != null ? !certYear.equals(that.certYear) : that.certYear != null) return false;
        if (certGroup != null ? !certGroup.equals(that.certGroup) : that.certGroup != null) return false;
        if (!Arrays.equals(certExported, that.certExported)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) certId;
        result = 31 * result + (int) certSemester;
        result = 31 * result + (int) certNum;
        result = 31 * result + (certYear != null ? certYear.hashCode() : 0);
        result = 31 * result + (int) certFaculty;
        result = 31 * result + (certGroup != null ? certGroup.hashCode() : 0);
        result = 31 * result + (int) certSubject;
        result = 31 * result + Arrays.hashCode(certExported);
        return result;
    }
}
