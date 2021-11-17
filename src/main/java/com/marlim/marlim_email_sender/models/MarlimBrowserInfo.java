package com.marlim.marlim_email_sender.models;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "marlim_browser_info")
public class MarlimBrowserInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int browserinfo_id;
    private String navegador;
    private String versao;
    private String linguagem;
    private String plataforma;
    private String useragent;

    public MarlimBrowserInfo() {
    }

    public MarlimBrowserInfo(String navegador, String versao, String linguagem, String plataforma, String useragent) {
        this.navegador = navegador;
        this.versao = versao;
        this.linguagem = linguagem;
        this.plataforma = plataforma;
        this.useragent = useragent;
    }

    public int getBrowserinfo_id() {
        return browserinfo_id;
    }

    public void setBrowserinfo_id(int browserinfo_id) {
        this.browserinfo_id = browserinfo_id;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarlimBrowserInfo that = (MarlimBrowserInfo) o;
        return getBrowserinfo_id() == that.getBrowserinfo_id() && Objects.equals(getNavegador(), that.getNavegador()) && Objects.equals(getVersao(), that.getVersao()) && Objects.equals(getLinguagem(), that.getLinguagem()) && Objects.equals(getPlataforma(), that.getPlataforma()) && Objects.equals(getUseragent(), that.getUseragent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrowserinfo_id(), getNavegador(), getVersao(), getLinguagem(), getPlataforma(), getUseragent());
    }
}
