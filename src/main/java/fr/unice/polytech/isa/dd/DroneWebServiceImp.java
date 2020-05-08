package fr.unice.polytech.isa.dd;

import fr.unice.polytech.isa.dd.entities.DRONE_STATES;
import fr.unice.polytech.isa.dd.entities.Drone;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.text.ParseException;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/droneService")
@Stateless(name = "DroneWS")
public class DroneWebServiceImp implements DroneWebService {

    @EJB
    private DroneRegister registry;
    @EJB
    private DroneStatusInterface st;


    @Override
    public Boolean register(String id, String date, String hour) throws ParseException {
        System.out.println("registerDrone");
        return registry.register(id, date, hour);
    }

    @Override
    public boolean deleteAll() {
        System.out.println("deleteAll");
        return registry.deleteAll();
    }

    @Override
    public void changeStatus(DRONE_STATES states, Drone drone, String date, String hour) throws ParseException {
        System.out.println("changeDroneStatus");
        st.changeStatus(states, drone, date, hour);
    }

}
