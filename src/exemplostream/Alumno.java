
package exemplostream;

/**
 *
 * @author dfernandezguerreiro
 */
public class Alumno {
    
    private String dni;
    private String nome;
    private String curso;
    private int nota;

    public Alumno() {
    }

    public Alumno(String dni, String nome, String curso, int nota) {
        this.dni=dni;
        this.nome=nome;
        this.curso=curso;
        this.nota=nota;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni=dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso=curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota=nota;
    }

    @Override
    public String toString() {
        return "DNI: "+dni+", nome: "+nome+", curso: "+curso+", nota: "+nota;
    }
    
    
    
}
