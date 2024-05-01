package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HyS_Service;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class HyS_Steps extends PageSteps {


    @When("hacen click en menu general")

    public void menugeneral() {
    	HyS_Service.menugeneral();
    }


    @And("Ir al menu Turnos Web")
    public void irAlMenuTurnosWeb() {
        HyS_Service.menugeneral();
    }
}