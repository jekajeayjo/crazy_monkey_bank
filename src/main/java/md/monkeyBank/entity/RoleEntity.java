package md.monkeyBank.entity;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "CODE")
    @Enumerated(EnumType.STRING)
    private RoleEnum code;

    @Column(name = "NAME")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoleEnum getCode() {
        return code;
    }

    public void setCode(RoleEnum code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
