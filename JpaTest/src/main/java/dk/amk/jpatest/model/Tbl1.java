package dk.amk.jpatest.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by joegus on 1/30/16.
 */
@Entity
public class Tbl1 {


  private Long tbl1Index;

  @Id
  @Column(name = "tbl1Index")
  public Long getTbl1Index() {
    return tbl1Index;
  }

  public void setTbl1Index(Long tbl1Index) {
    this.tbl1Index = tbl1Index;
  }

  private String fld1;

  @Basic
  @Column(name = "fld1")
  public String getFld1() {
    return fld1;
  }

  public void setFld1(String fld1) {
    this.fld1 = fld1;
  }

  private Long fld2;

  @Basic
  @Column(name = "fld2")
  public Long getFld2() {
    return fld2;
  }

  public void setFld2(Long fld2) {
    this.fld2 = fld2;
  }

  private Double fld3;

  @Basic
  @Column(name = "fld3")
  public Double getFld3() {
    return fld3;
  }

  public void setFld3(Double fld3) {
    this.fld3 = fld3;
  }  private Timestamp fld4;

  @Basic
  @Column(name = "fld4")
  public Timestamp getFld4() {
    return fld4;
  }

  public void setFld4(Timestamp fld4) {
    this.fld4 = fld4;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Tbl1 tbl1 = (Tbl1) o;

    if (tbl1Index != null ? !tbl1Index.equals(tbl1.tbl1Index) : tbl1.tbl1Index != null) return false;
    if (fld1 != null ? !fld1.equals(tbl1.fld1) : tbl1.fld1 != null) return false;
    if (fld2 != null ? !fld2.equals(tbl1.fld2) : tbl1.fld2 != null) return false;
    if (fld3 != null ? !fld3.equals(tbl1.fld3) : tbl1.fld3 != null) return false;
    if (fld4 != null ? !fld4.equals(tbl1.fld4) : tbl1.fld4 != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = tbl1Index != null ? tbl1Index.hashCode() : 0;
    result = 31 * result + (fld1 != null ? fld1.hashCode() : 0);
    result = 31 * result + (fld2 != null ? fld2.hashCode() : 0);
    result = 31 * result + (fld3 != null ? fld3.hashCode() : 0);
    result = 31 * result + (fld4 != null ? fld4.hashCode() : 0);
    return result;
  }
}
