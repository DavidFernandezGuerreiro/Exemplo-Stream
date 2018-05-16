
package exemplostream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class UsoStreams {
    
    List<Alumno>listaAlumnos=new ArrayList();
    List<Alumno>listaSuspensos;
    
    public void crearLista(){
        listaAlumnos.add(new Alumno("111","Ana","dam1",4));
        listaAlumnos.add(new Alumno("222","Ana","dam1",8));
        listaAlumnos.add(new Alumno("333","Anton","dam2",6));
        listaAlumnos.add(new Alumno("444","Brais","fpb",5));
        listaAlumnos.add(new Alumno("555","Alex","dam1",3));
        listaAlumnos.add(new Alumno("666","Noa","adm",7));
        //O pedir los datos por la libreria (PedirDatos).
    }
    
    public void amosar(){
        /* for each normal: */
//        for(Alumno al:listaAlumnos){
//            System.out.println(al);
//        }
        
        /* Usando Streams: */
//        listaAlumnos.stream().forEach(al->System.out.println(al));

        /* Usando referencias a métodos: */
        listaAlumnos.stream().forEach(System.out::println);
    }
    
    public void amosarAlumnoDeterminado(){
        /* amosar os alumnos que comezan por a */
        listaAlumnos.stream().filter(al->al.getNome().charAt(0)=='A').forEach(al->System.out.println(al));
        
        /* amosar os alumnos que comezan por b */
//        listaAlumnos.stream().filter(al->al.getNome().startsWith("B")).forEach(al->System.out.println(al));
    }
    
    public void aprobados(){
        listaAlumnos.stream().filter(al->al.getNota()>=5).forEach(al->System.out.println(al));
    }
    
    /* mostrar los suspensos en otra lista. (en otra coleccion) */
    public void suspensos(){
        listaSuspensos=listaAlumnos.stream().filter((al)->al.getNota()<5).collect(Collectors.toList());
//        listaSuspensos.forEach(al->System.out.println(al));
    }
    
    public void amosarSuspensos(){
        listaSuspensos.stream().forEach(al->System.out.println(al));
    }
    
    /*Buscar alumnos en base un dni*/
    public void buscarDni(){
        String buscarDni=JOptionPane.showInputDialog("Introducir dni do alumno: ");
        listaAlumnos.stream().filter(al->al.getDni().equalsIgnoreCase(buscarDni)).forEach(al->System.out.println(al));
    }
    
    /* alumno de maior nota */
    public void alumnosMaiorNota(){
        
        System.out.println(listaAlumnos.stream().max((al1,al2)->al1.getNota()-al2.getNota()).get()); //Para que no aparezca la Clase Optional, si el valor no es null, se recoge con un .get().
    }
    
    /* ordenar por nombre */
    public void ordenarPorNome(){
        listaAlumnos.stream().sorted((al1,al2)->al1.getNome().compareToIgnoreCase(al2.getNome())).forEach(al->System.out.println(al));
    }
    
    /* subir nota a todos os alumnos. Subir 2 puntos. */
    public void subirNota(){
        listaAlumnos.stream().map((al)->al.getNota()+2).forEach(al->System.out.println(al));
    }
    
    /* subir nota a los alumnos que están aprobados. */
    public void subirNotaAprobados(){
        listaAlumnos.stream().filter((al)->al.getNota()>=5).map((al)->al.getNota()+2).forEach(al->System.out.println(al));
    }
    
    
    
}
