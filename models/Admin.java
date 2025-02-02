
package com.medical.records.models;

public class Admin extends User {

    public Admin(int id, String username) {
        super(id, username, "Admin");
    }

    public void manageSystem() {
        System.out.println("Managing system as Admin...");
    }
}
