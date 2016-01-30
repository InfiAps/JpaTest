package dk.amk.jpatest.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by joegus on 1/30/16.
 */
@Entity
public class Tbl2 {

  private Long tbl2Index;

  @Id
  @Column(name = "tbl2Index")
  public Long getTbl2Index() {
    return tbl2Index;
  }

  public void setTbl2Index(Long tbl2Index) {
    this.tbl2Index = tbl2Index;
  }

  private String sFld1;

  @Basic
  @Column(name = "sFld1")
  public String getsFld1() {
    return sFld1;
  }

  public void setsFld1(String sFld1) {
    this.sFld1 = sFld1;
  }

  private Long sFld2;

  @Basic
  @Column(name = "sFld2")
  public Long getsFld2() {
    return sFld2;
  }

  public void setsFld2(Long sFld2) {
    this.sFld2 = sFld2;
  }

  private Double sFld3;

  @Basic
  @Column(name = "sFld3")
  public Double getsFld3() {
    return sFld3;
  }

  public void setsFld3(Double sFld3) {
    this.sFld3 = sFld3;
  }

  private Timestamp sFld4;

  @Basic
  @Column(name = "sFld4")
  public Timestamp getsFld4() {
    return sFld4;
  }

  public void setsFld4(Timestamp sFld4) {
    this.sFld4 = sFld4;
  }

  private Long tbl1Fk;

  @Basic
  @Column(name = "tbl1Fk")
  public Long getTbl1Fk() {
    return tbl1Fk;
  }

  public void setTbl1Fk(Long tbl1Fk) {
    this.tbl1Fk = tbl1Fk;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Tbl2 tbl2 = (Tbl2) o;

    if (tbl2Index != null ? !tbl2Index.equals(tbl2.tbl2Index) : tbl2.tbl2Index != null) return false;
    if (sFld1 != null ? !sFld1.equals(tbl2.sFld1) : tbl2.sFld1 != null) return false;
    if (sFld2 != null ? !sFld2.equals(tbl2.sFld2) : tbl2.sFld2 != null) return false;
    if (sFld3 != null ? !sFld3.equals(tbl2.sFld3) : tbl2.sFld3 != null) return false;
    if (sFld4 != null ? !sFld4.equals(tbl2.sFld4) : tbl2.sFld4 != null) return false;
    if (tbl1Fk != null ? !tbl1Fk.equals(tbl2.tbl1Fk) : tbl2.tbl1Fk != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = tbl2Index != null ? tbl2Index.hashCode() : 0;
    result = 31 * result + (sFld1 != null ? sFld1.hashCode() : 0);
    result = 31 * result + (sFld2 != null ? sFld2.hashCode() : 0);
    result = 31 * result + (sFld3 != null ? sFld3.hashCode() : 0);
    result = 31 * result + (sFld4 != null ? sFld4.hashCode() : 0);
    result = 31 * result + (tbl1Fk != null ? tbl1Fk.hashCode() : 0);
    return result;
  }
}
