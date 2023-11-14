package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.ClientsRepository;
import fr.abbo.septArche.exceptions.ClientExceptions;
import fr.abbo.septArche.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {
    @Autowired
    private ClientsRepository repClients;

    @Transactional(rollbackFor = ClientExceptions.class)
    public void creerClient(Client client) throws ClientExceptions {
        repClients.save(client);
    }
}
