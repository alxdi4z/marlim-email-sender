package com.marlim.marlim_email_sender.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

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
    private boolean by_message;
    private boolean by_email;

    public MarlimAccess() {
    }
    
    public MarlimAccess(boolean by_message, boolean by_email) {
        this.by_message = by_message;
        this.by_email = by_email;
    }

    public int getAcessos_id() {
        return acessos_id;
    }

    public boolean isBy_message() {
        return by_message;
    }

    public boolean isBy_email() {
        return by_email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarlimAccess that = (MarlimAccess) o;
        return getAcessos_id() == that.getAcessos_id() && isBy_message() == that.isBy_message() && isBy_email() == that.isBy_email();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAcessos_id(), isBy_message(), isBy_email());
    }
}
