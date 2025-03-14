package ro.cts.model.personal;

public class Student extends Persoana implements IPersoana{

    private int idStudent;
    private int anStudiu;

    public Student(String nume, int varsta, int idStudent, int anStudiu) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.anStudiu = anStudiu;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public void afiseazaMetodaInvatare() {
        StringBuilder sb = new StringBuilder("Studentul are ");
        sb.append(this.anStudiu);
        sb.append(" ani de studiu");
        System.out.println(sb);
    }
}
