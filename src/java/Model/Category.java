/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DELL
 */
public class Category {

    int typeId;
    String typeName;
    int parentId;
    int numberTypeChild;

    public Category(String typeName, int parentId) {
        this.typeName = typeName;
        this.parentId = parentId;
    }
    
    

    
    public int getNumberTypeChild() {
        return numberTypeChild;
    }

    public void setNumberTypeChild(int numberTypeChild) {
        this.numberTypeChild = numberTypeChild;
    }

    public Category() {
    }

    public Category(int typeId, String typeName, int parentId) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.parentId = parentId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Category{" + "typeId=" + typeId + ", typeName=" + typeName + ", parentId=" + parentId + ", numberTypeChild=" + numberTypeChild + '}';
    }

}
