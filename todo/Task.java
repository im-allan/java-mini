package todo;

import java.util.Date;


public class Task {
    private String titulo;
    private Date fechaVencimiento;
    private String estado;

    public Task(String titulo, Date fechaVencimiento, String estado) {
        this.titulo = titulo;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
