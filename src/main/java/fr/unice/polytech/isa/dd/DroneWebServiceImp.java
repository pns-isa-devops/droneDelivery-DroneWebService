package fr.unice.polytech.isa.dd;

import fr.unice.polytech.isa.dd.entities.Drone;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/droneService")
@Stateless(name = "DroneWS")
public class DroneWebServiceImp implements DroneWebService {

    @EJB private DroneRegister registry;

    @Override
    public Boolean register(String id) throws Exception {
        System.out.println("registerDrone");
        return registry.register(0,0,id);
    }
}
