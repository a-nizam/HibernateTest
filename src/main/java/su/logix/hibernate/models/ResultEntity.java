package su.logix.hibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "result", schema = "main")
public class ResultEntity {
    private short resId;
    private short resStudent;
    private short resCertification;
    private double resMark;
    private short resLecturesMissed;
    private short resLecturesCor;
    private short resPracticeMissed;
    private short resPracticeCor;

    @Id
    @Column(name = "res_id")
    public short getResId() {
        return resId;
    }

    public void setResId(short resId) {
        this.resId = resId;
    }

    @Basic
    @Column(name = "res_student")
    public short getResStudent() {
        return resStudent;
    }

    public void setResStudent(short resStudent) {
        this.resStudent = resStudent;
    }

    @Basic
    @Column(name = "res_certification")
    public short getResCertification() {
        return resCertification;
    }

    public void setResCertification(short resCertification) {
        this.resCertification = resCertification;
    }

    @Basic
    @Column(name = "res_mark")
    public double getResMark() {
        return resMark;
    }

    public void setResMark(double resMark) {
        this.resMark = resMark;
    }

    @Basic
    @Column(name = "res_lectures_missed")
    public short getResLecturesMissed() {
        return resLecturesMissed;
    }

    public void setResLecturesMissed(short resLecturesMissed) {
        this.resLecturesMissed = resLecturesMissed;
    }

    @Basic
    @Column(name = "res_lectures_cor")
    public short getResLecturesCor() {
        return resLecturesCor;
    }

    public void setResLecturesCor(short resLecturesCor) {
        this.resLecturesCor = resLecturesCor;
    }

    @Basic
    @Column(name = "res_practice_missed")
    public short getResPracticeMissed() {
        return resPracticeMissed;
    }

    public void setResPracticeMissed(short resPracticeMissed) {
        this.resPracticeMissed = resPracticeMissed;
    }

    @Basic
    @Column(name = "res_practice_cor")
    public short getResPracticeCor() {
        return resPracticeCor;
    }

    public void setResPracticeCor(short resPracticeCor) {
        this.resPracticeCor = resPracticeCor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResultEntity that = (ResultEntity) o;

        if (resId != that.resId) return false;
        if (resStudent != that.resStudent) return false;
        if (resCertification != that.resCertification) return false;
        if (Double.compare(that.resMark, resMark) != 0) return false;
        if (resLecturesMissed != that.resLecturesMissed) return false;
        if (resLecturesCor != that.resLecturesCor) return false;
        if (resPracticeMissed != that.resPracticeMissed) return false;
        if (resPracticeCor != that.resPracticeCor) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) resId;
        result = 31 * result + (int) resStudent;
        result = 31 * result + (int) resCertification;
        temp = Double.doubleToLongBits(resMark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) resLecturesMissed;
        result = 31 * result + (int) resLecturesCor;
        result = 31 * result + (int) resPracticeMissed;
        result = 31 * result + (int) resPracticeCor;
        return result;
    }
}
