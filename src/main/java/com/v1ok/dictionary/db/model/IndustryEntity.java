package com.v1ok.dictionary.db.model;

import com.v1ok.db.model.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Table(name = "industry")
public class IndustryEntity extends BaseEntity {

  @Id
  @Column(name = "PID")
  String pId;
  @Column(name = "NAME")
  String name;
  @Column(name = "CODE")
  String code;
  @Column(name = "PARENT_CODE")
  String parentCode;
  @Column(name = "PARENT_CODES")
  String parentCodes;
  @Column(name = "TREE_SORT")
  Integer treeSort;
  @Column(name = "TREE_SORTS")
  String treeSorts;
  @Column(name = "TREE_LEAF")
  Integer treeLeaf;
  @Column(name = "TREE_LEVEL")
  Integer treeLevel;
  @Column(name = "TREE_NAMES")
  String treeNames;
  @Column(name = "STATUS")
  Integer status;
  @Column(name = "REMARKS")
  String remarks;

  public String getValue() {
    return this.code;
  }

  public String getLabel() {
    return this.name;
  }

  public boolean getIsLeaf(){
    return this.treeLeaf == 1;
  }
}
