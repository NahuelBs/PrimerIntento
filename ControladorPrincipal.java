import java.util.ArrayList;

public class ControladorPrincipal{

    public static void main(String[] args) {  
    
        ArrayList<Alumno>arreglo1=new ArrayList<Alumno>();
        ArrayList<Profesor>arreglo2=new ArrayList<Profesor>();
        ArrayList<Idioma>arreglo3=new ArrayList<Idioma>();
        ArrayList<Lugar>arreglo4=new ArrayList<Lugar>();
        ArrayList<PalabraClave>arreglo5=new ArrayList<PalabraClave>();
        ArrayList<Tipo>arreglo6=new ArrayList<Tipo>();
        ArrayList<Grupo>arreglo7=new ArrayList<Grupo>();

        Alumno Objeto1=new Alumno();
        Alumno Objeto2=new Alumno();
        Alumno Objeto3=new Alumno();
        Alumno Objeto4=new Alumno();
        Alumno Objeto5=new Alumno();
        
        Profesor Objeto6=new Profesor();
        Profesor Objeto7=new Profesor();
        Profesor Objeto8=new Profesor();
        Profesor Objeto9=new Profesor();
        Profesor Objeto10=new Profesor();

        Idioma Objeto11=new Idioma();
        Idioma Objeto12=new Idioma();
        Idioma Objeto13=new Idioma();
        Idioma Objeto14=new Idioma();
        Idioma Objeto15=new Idioma();

        Lugar Objeto16=new Lugar();
        Lugar Objeto17=new Lugar();
        Lugar Objeto18=new Lugar();
        Lugar Objeto19=new Lugar();
        Lugar Objeto20=new Lugar();

        PalabraClave Objeto21=new PalabraClave();
        PalabraClave Objeto22=new PalabraClave();
        PalabraClave Objeto23=new PalabraClave();
        PalabraClave Objeto24=new PalabraClave();
        PalabraClave Objeto25=new PalabraClave();

        Tipo Objeto26=new Tipo();
        Tipo Objeto27=new Tipo();
        Tipo Objeto28=new Tipo();
        Tipo Objeto29=new Tipo();
        Tipo Objeto30=new Tipo();

        Grupo Objeto31=new Grupo();
        Grupo Objeto32=new Grupo();
        Grupo Objeto33=new Grupo();
        Grupo Objeto34=new Grupo();
        Grupo Objeto35=new Grupo();

        arreglo1.add(Objeto1);
        arreglo1.add(Objeto2);
        arreglo1.add(Objeto3);
        arreglo1.add(Objeto4);
        arreglo1.add(Objeto5);

        arreglo2.add(Objeto6);
        arreglo2.add(Objeto7);
        arreglo2.add(Objeto8);
        arreglo2.add(Objeto9);
        arreglo2.add(Objeto10);

        arreglo3.add(Objeto11);
        arreglo3.add(Objeto12);
        arreglo3.add(Objeto13);
        arreglo3.add(Objeto14);
        arreglo3.add(Objeto15);

        arreglo4.add(Objeto16);
        arreglo4.add(Objeto17);
        arreglo4.add(Objeto18);
        arreglo4.add(Objeto19);
        arreglo4.add(Objeto20);

        arreglo5.add(Objeto21);
        arreglo5.add(Objeto22);
        arreglo5.add(Objeto23);
        arreglo5.add(Objeto24);
        arreglo5.add(Objeto25);
        
        arreglo6.add(Objeto26);
        arreglo6.add(Objeto27);
        arreglo6.add(Objeto28);
        arreglo6.add(Objeto29);
        arreglo6.add(Objeto30);

        arreglo7.add(Objeto31);
        arreglo7.add(Objeto32);
        arreglo7.add(Objeto33);
        arreglo7.add(Objeto34);
        arreglo7.add(Objeto35);
        
        for(Alumno a:arreglo1)
            a.mostrar();

        for(Profesor b:arreglo2)
            b.mostrar();

        for(Idioma c:arreglo3)
            c.mostrar();

        for(Lugar d:arreglo4)
            d.mostrar();

        for(PalabraClave e:arreglo5)
            e.mostrar();

        for(Tipo f:arreglo6)
            f.mostrar();

        for(Grupo g:arreglo7)
            g.mostrar();
    }
}