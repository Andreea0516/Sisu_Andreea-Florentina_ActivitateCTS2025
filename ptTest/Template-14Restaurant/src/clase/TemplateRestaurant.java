package clase;

public abstract class TemplateRestaurant {
    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();
    protected abstract void aseazaPersoaneLaMasa();

    public final void OcupaMasa()
    {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        aseazaPersoaneLaMasa();
    }

}
