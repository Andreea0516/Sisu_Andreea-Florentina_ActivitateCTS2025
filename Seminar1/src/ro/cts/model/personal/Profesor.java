package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil, IPersoana{

    private int id;
    private int vechime;

    public Profesor(String nume, int varsta, int id, int vechime) {
        super(nume, varsta);
        this.id = id;
        this.vechime = vechime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public void afiseazaMetodaInvatare() {
        StringBuilder sb = new StringBuilder("Profesorul invata prin predare de: ");
        sb.append(this.vechime);
        sb.append(" ani");
        System.out.println(sb);
    }

    @Override
    public void preda() {
        System.out.println("Profesorul preda de obicei la curs");
    }
}
