package org.kearis.formation.javaee7.chapitre1_2.ex08;

public class OrderLine08 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private String item;
  private Double unitPrice;
  private Integer quantity;

  // ======================================
  // =            Constructors            =
  // ======================================

  public OrderLine08() {
  }

  public OrderLine08(String item, Double unitPrice, Integer quantity) {
    this.item = item;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
}