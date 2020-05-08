package fr.unice.polytech.isa.dd;

//import fr.unice.polytech.isa.dd

import fr.unice.polytech.isa.dd.entities.DRONE_STATES;
import fr.unice.polytech.isa.dd.entities.Drone;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.text.ParseException;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/droneService")
public interface DroneWebService {

    @WebMethod
    Boolean register(@WebParam(name="drone_id") String id, @WebParam(name="date") String date,
                           @WebParam(name="hour") String hour) throws ParseException;

    @WebMethod
    @WebResult(name = "delete_all")
    boolean deleteAll();

    @WebMethod
    void changeStatus(@WebParam(name="status") DRONE_STATES states, @WebParam(name="drone") Drone drone, @WebParam(name="date") String date,
                      @WebParam(name="hour") String hour) throws ParseException;
}
