package cleaningSoSModel;

import kr.ac.kaist.se.controller.sim.SimEngine;
import cleaningSoSModel.model.sos.SweepingRobot;
import cleaningSoSModel.model.sos.CleaningSoS;
import cleaningSoSModel.simdata.input.CleaningSoSConfiguration;
import cleaningSoSModel.simdata.input.CleaningSoSScenario;

public class main {
    public static void main(String [] args) {
        String modelFile = "";
        CleaningSoS cleaningSoS = readModel(modelFile);

        String configurationFile = "";
        CleaningSoSConfiguration cleaningSoSConfiguration = readConfiguration(configurationFile);

        String scenarioFile = "";
        CleaningSoSScenario cleaningSoSScenario = readScenario(scenarioFile);

        SimEngine simEngine = new SimEngine(cleaningSoS, cleaningSoSConfiguration, cleaningSoSScenario);
        simEngine.executeSimulation();
    }

    private static CleaningSoS readModel(String fileName) {
        CleaningSoS cleaningSoS = new CleaningSoS();
        cleaningSoS.sos_csList.add(new SweepingRobot(0, 0));
        return cleaningSoS;
    }

    private static CleaningSoSConfiguration readConfiguration(String fileName) {
        CleaningSoSConfiguration cleaningSoSConfiguration = new CleaningSoSConfiguration(10);
        return cleaningSoSConfiguration;
    }

    private static CleaningSoSScenario readScenario(String fileName) {
        return new CleaningSoSScenario();
    }
}