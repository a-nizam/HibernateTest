package su.logix.hibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "key", schema = "main")
public class KeyEntity {
    private String name;
    private String value;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeyEntity keyEntity = (KeyEntity) o;

        if (name != null ? !name.equals(keyEntity.name) : keyEntity.name != null) return false;
        if (value != null ? !value.equals(keyEntity.value) : keyEntity.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
