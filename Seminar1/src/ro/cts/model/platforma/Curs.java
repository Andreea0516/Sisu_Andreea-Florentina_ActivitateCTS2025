package ro.cts.model.platforma;

import ro.cts.model.personal.IPersoana;
import ro.cts.model.personal.IPredabil;
import ro.cts.model.personal.Student;

import java.util.List;

public class Curs {
    private String numeCurs;
    private IPredabil cadruDidactic;
    private List<Student> studenti;

    public Curs(String numeCurs, IPredabil cadruDidactic, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void sustinereExamen()
    {
        StringBuilder sb =new StringBuilder("Profesorul ");
        sb.append(((IPersoana)this.cadruDidactic).getNume()).append(" preda la materia ").append(this.numeCurs);
        sb.append(" cu urmatorii studenti: ");
        System.out.println(sb);

        for(Student student : studenti)
        {
            System.out.println(student.getNume());
        }
    }
}
