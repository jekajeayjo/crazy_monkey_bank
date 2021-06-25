package md.monkeyBank.entity;



import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "USER_DETAIL")
public class UserDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(name = "IM")
    private  String im;
    @Column(name = "FAM")
    private  String fam;
    @Column(name = "OT")
    private  String ot;

    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;
    @Column(name = "DATE_BIRTH")
    private LocalDateTime dateBirth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }



    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public LocalDateTime getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDateTime dateBirth) {
        this.dateBirth = dateBirth;
    }
}
