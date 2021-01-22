/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

/**
 *
 * @author Sebastian
 */
public class Item {
    private int id;
  private String description;

  public Item(int id, String description) {
    this.id = id;
    this.description = description;
  }

  

  public int getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return description;
  }
}
