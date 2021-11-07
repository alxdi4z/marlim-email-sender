package com.marlim.marlim_email_sender.models;

import java.io.Serial;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marlim_access")
public class MarlimAccess implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int acessos_id;
    private String email;
    private boolean by_message;
    private boolean by_email;
    private String number;

    public MarlimAccess() {
    }
    
    public MarlimAccess(String email, boolean by_message, boolean by_email, String number) {
        this.email = email;
        this.by_message = by_message;
        this.by_email = by_email;
        this.number = number;
    }

    public int getAcessos_id() {
        return acessos_id;
    }

    public void setAcessos_id(int acessos_id) {
        this.acessos_id = acessos_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBy_message() {
        return by_message;
    }

    public void setBy_message(boolean by_message) {
        this.by_message = by_message;
    }

    public boolean isBy_email() {
        return by_email;
    }

    public void setBy_email(boolean by_email) {
        this.by_email = by_email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + acessos_id;
        result = prime * result + (by_email ? 1231 : 1237);
        result = prime * result + (by_message ? 1231 : 1237);
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MarlimAccess other = (MarlimAccess) obj;
        if (acessos_id != other.acessos_id)
            return false;
        if (by_email != other.by_email)
            return false;
        if (by_message != other.by_message)
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        return true;
    }

}
