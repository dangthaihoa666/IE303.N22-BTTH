/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanB1_Bai2;

import java.io.Serializable;

/**
 *
 * @author admind
 */
public class Pupil implements Serializable  {
    private static final long serialVersionUID = -850138343011302991L;
    private String fullName;

    public Pupil(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
}
