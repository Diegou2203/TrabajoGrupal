package pe.edu.upc.safealertweb.servicesinterfaces;

import pe.edu.upc.safealertweb.entities.NotificacionAlerta;

import java.util.List;

public interface INotificacionAlertaService {
    public List<NotificacionAlerta> list();

    public void insert(NotificacionAlerta na);

    public NotificacionAlerta listarId(int idNotificacionAlerta);

    public void delete(int idNotificacionAlerta);

    public void update(NotificacionAlerta na);
}
