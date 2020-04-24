package fr.unice.polytech.isa.dd;

//import fr.unice.polytech.isa.dd

import fr.unice.polytech.isa.dd.entities.Drone;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/droneService")
public interface DroneWebService {

    @WebMethod
    Boolean register(@WebParam(name="drone_id") String id) throws Exception;

}
